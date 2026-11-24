import java.util.Scanner;
public class Es5 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Inserisci il voto (1-10): ");
		int voto = in.nextInt();
		
		while (voto > 10 || voto < 1){
			System.out.println("Voto non valido");
			voto = in.nextInt();
			}
		
		System.out.println("Voto: " + voto);
	}
}

