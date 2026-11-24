import java.util.Scanner;
public class Es1 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Inserisci un numero naturale, pari: ");
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i <= n; i++){
			if (i % 2 == 0){
				System.out.println(i + " è un numero pari");
				}
			else {
				System.out.println(i + " è un numero dispari");
				}
			}
		
	}
}

