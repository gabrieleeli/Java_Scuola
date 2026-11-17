import java.util.Scanner;
public class E51P239 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        if (a.length() == 4 &&
                ((a.charAt(0) == a.charAt(1) && a.charAt(2) == a.charAt(3)))) {
            System.out.println("Sono due coppie");
	} else {
            System.out.println("Non sono due coppie");
	}
}
}