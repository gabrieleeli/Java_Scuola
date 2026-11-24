import java.util.Scanner;
public class Es2 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num = 0;
		int somma = 0;
		
		do{
			System.out.println("Inserisci il tuo numero: ");
			num = Integer.parseInt(in.nextLine());
			somma += num;
			}
		while (num != 0);
		
		System.out.println("Somma: " + somma);
	}
}

