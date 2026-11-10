/**
 * A word that can be inspected and transformed.
 *
 * <p>Exercise on the {@link String} methods {@code charAt},
 * {@code length} and {@code substring}, and on {@code for} loops. The
 * class can return the first, last and middle characters of the word,
 * append text to it, reverse it and encrypt it with the Caesar
 * cipher.</p>
 *
 * @author gastaldello12303
 * @version 27-10-2026
 */
public class CorrectWord {

	/** The word stored in the object. */
	private String word;
	// former instance variables, now replaced by local variables in the methods:
	//~ private String firstChar;
	//~ private String lastChar;
	//~ private String center;
	//~ private String reversed;
	//~ private String key;
	//~ private String encrypted;

	/**
	 * Creates an object that stores the given word.
	 *
	 * @param p the initial word
	 */
	public CorrectWord(String p){
		word = p;
		}

	/**
	 * Replaces the stored word with a new one.
	 *
	 * @param c the new word
	 */
	public void setWord(String c){
		word = c;
		}

	/**
	 * Returns the stored word.
	 *
	 * @return the word
	 */
	public String getWord(){
		return word;
		}

	/**
	 * Returns a text description of the object.
	 *
	 * @return a string such as {@code "Word = hello"}
	 */
	@Override
	public String toString(){
		return "Word = " + word;
		}

	/**
	 * Returns the first character of the word.
	 *
	 * @return the character at position 0
	 */
	public char getFirstChar(){
		char firstChar;
		firstChar = word.charAt(0);
		return firstChar;
		}

	/**
	 * Returns the last character of the word.
	 *
	 * @return the character at position {@code length() - 1}
	 */
	public char getLastChar(){
		char lastChar;
		lastChar = word.charAt(word.length() - 1); // positions start from 0, so the last one is length - 1
		return lastChar;
		}

	/**
	 * Returns the central part of the word.
	 *
	 * <p>If the word has an odd number of characters, the single middle
	 * character is returned (for example "c" for "abcde"). If it has an
	 * even number of characters, the two middle characters are returned
	 * (for example "bc" for "abcd").</p>
	 *
	 * @return the middle character, or the two middle characters
	 */
	public String getCenter(){
		int length = word.length();
		String center;

		if (length % 2 == 0){
			// even length: take the two characters around the middle
			int start = (length / 2) - 1;
			int end = (length / 2) + 1;

			center = word.substring(start, end);
			}

		else {
			// odd length: take the single character in the middle
			int index = length / 2;
			center = word.substring(index, index + 1);
		}

		return center;
		}

		/**
		 * Appends a string to the end of the stored word.
		 *
		 * @param conc the text to add at the end of the word
		 */
		public void concatString(String conc){
			word = word + conc;
			}

		/**
		 * Returns the word written backwards. The stored word is not
		 * modified.
		 *
		 * @return the reversed word (for example "olleh" for "hello")
		 */
		public String reverseWord(){
			String reversed = "";
			// walk the word from the last character to the first one
			for (int i = word.length() - 1; i >= 0; i--){
				reversed = reversed + word.charAt(i);
				}
			return reversed;
			}

		/**
		 * Encrypts the word with the Caesar cipher: every character is
		 * shifted forward by {@code k} positions in the character table
		 * (for example, with {@code k = 3}, "abc" becomes "def"). The
		 * stored word is not modified.
		 *
		 * @param k the key, that is the number of positions to shift
		 * @return the encrypted word
		 */
		public String caesarCipher(int k){

			String s = "";

			for (int i = 0; i < word.length(); i++){
				char c = word.charAt(i);     // original character
				char t = (char)(c + k);      // character shifted by k positions
				s = s + t;
				}

			return s;

			}
}
