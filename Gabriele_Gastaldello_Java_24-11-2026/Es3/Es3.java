import java.util.Scanner;
public class Es3 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero: ");
		int n = in.nextInt();
		int tab = 0;
		System.out.println("Tabellina del " + n);
		
		for (int i = 0; i <= 10; i++){
			
			System.out.println(n + " + " + i + " = " + n * i);
			
			}
		
	}
}

