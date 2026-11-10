#!/usr/bin/env bash
#
# generate-javadoc.sh
#
# Generates the Javadoc documentation of every exercise into the "javadoc"
# folder and builds javadoc/index.html, a home page with a link to the
# documentation of each exercise.
#
# Every exercise folder is documented separately because some class names
# (for example Rectangle and RectangleTester) are used in more than one
# exercise, and Javadoc cannot document two classes with the same name in
# the same (unnamed) package.
#
# Usage:  ./generate-javadoc.sh
#
set -euo pipefail

cd "$(dirname "$0")"

OUT="javadoc"
rm -rf "$OUT"
mkdir -p "$OUT"

# Exercise folders sorted by date (the folder names use the dd-mm-yyyy format).
mapfile -t DIRS < <(
	for d in esercizio*/; do
		d="${d%/}"
		date=$(grep -oE '[0-9]{2}-[0-9]{2}-[0-9]{4}' <<< "$d" | head -n1)
		IFS=- read -r dd mm yyyy <<< "$date"
		printf '%s%s%s\t%s\n' "$yyyy" "$mm" "$dd" "$d"
	done | sort | cut -f2
)

ROWS=""
for dir in "${DIRS[@]}"; do
	date=$(grep -oE '[0-9]{2}-[0-9]{2}-[0-9]{4}' <<< "$dir" | head -n1)
	name="exercise-$date"
	echo "Generating Javadoc for '$dir' -> $OUT/$name"

	javadoc -quiet -private -author -version -encoding UTF-8 -charset UTF-8 \
		-Xdoclint:all,-missing \
		-windowtitle "Exercise $date" \
		-doctitle "Exercise $date" \
		-d "$OUT/$name" "$dir"/*.java 2>&1 | grep -v '^Picked up' || true

	classes=""
	for f in "$dir"/*.java; do
		cls=$(basename "$f" .java)
		classes+="<a href=\"$name/$cls.html\"><code>$cls</code></a> "
	done
	ROWS+="      <tr><td><a href=\"$name/index.html\">Exercise $date</a></td><td><code>$dir</code></td><td>$classes</td></tr>"$'\n'
done

cat > "$OUT/index.html" <<EOF
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Java_Scuola - Javadoc</title>
  <style>
    :root { --bg: #ffffff; --fg: #1f2328; --muted: #59636e; --line: #d1d9e0; --head: #f6f8fa; --link: #0969da; }
    @media (prefers-color-scheme: dark) {
      :root { --bg: #0d1117; --fg: #e6edf3; --muted: #9198a1; --line: #3d444d; --head: #151b23; --link: #4493f8; }
    }
    body { margin: 0; padding: 24px 16px; background: var(--bg); color: var(--fg);
           font-family: system-ui, -apple-system, "Segoe UI", sans-serif; line-height: 1.5; }
    main { max-width: 960px; margin: 0 auto; }
    h1 { margin-top: 0; }
    p { color: var(--muted); }
    a { color: var(--link); }
    .wrap { overflow-x: auto; }
    table { border-collapse: collapse; width: 100%; }
    th, td { border: 1px solid var(--line); padding: 8px 12px; text-align: left; vertical-align: top; }
    th { background: var(--head); }
    td a code { margin-right: 6px; }
  </style>
</head>
<body>
  <main>
    <h1>Java_Scuola &mdash; Javadoc</h1>
    <p>API documentation of all the classes of the school Java exercises.
       Each exercise has its own Javadoc site: open an exercise to see the
       summary of its classes, or click a class name to go straight to it.</p>
    <div class="wrap">
    <table>
      <tr><th>Exercise</th><th>Source folder</th><th>Classes</th></tr>
$ROWS    </table>
    </div>
  </main>
</body>
</html>
EOF

echo "Done: open $OUT/index.html"
