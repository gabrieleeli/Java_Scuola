import java.util.Scanner;
public class SalvadanaioTester {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		Salvadanaio s = new Salvadanaio("Gabriele");
		
		System.out.println(s.getProprietario());
		System.out.println(s.getDenaro());
	
		System.out.println("denaro: ");
		int den = Integer.parseInt(in.nextLine());
		s.setDenaro(den);
		
		System.out.println(s.toString());
		
		System.out.println("Soldi usciti scuotendo il salvadanaio: " + s.scuoti());
		
		System.out.println("Rottura salvadanaio: " + s.rompi());
		
		s.ripara();
		
		System.out.println("Inserisci denaro salvadanaio aggiustato");
		den = Integer.parseInt(in.nextLine());
		System.out.println("Denaro inserito nel nuovo salvadanaio" + s.getDenaro());
		
		System.out.println("Inserisci il nome della persona che vuoi trasferire i soldi: ");
		String persona = in.nextLine();
		
		System.out.println("Inserisci denaro: ");
		den = Integer.parseInt(in.nextLine());
		System.out.println("Denaro inserito nel salvadanaio" + s.getDenaro());
		
		System.out.println("Rottura salvadanaio: " + s.rompi());
		System.out.println("Scuoti salvadanaio rotto: " + s.scuoti());
		
		
		
		
	}
}

