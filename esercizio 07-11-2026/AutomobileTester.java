import java.util.Scanner;

public class AutomobileTester {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		Automobile a = new Automobile("FIAT Panda", 20, 50, 10);
		
		System.out.println(a.toString());
		
		System.out.println("Autonomia: " + a.getAutonomia() + " km");
		System.out.println("In riserva? " + a.inRiserva());
		System.out.println("Percorribile 150 km? " + a.isPercorribile(150));

		a.percorri(100);
		System.out.println("Dopo 100 km, litri nel serbatoio: " + a.getLitri());

		a.faRifornimento(15);
		System.out.println("Dopo rifornimento di 15 l: " + a.getLitri());
		
		System.out.print("Nome: ");
		String nomeB = in.nextLine();

		System.out.print("Resa (km/l): ");
		double resaB = 10;

		System.out.print("Capienza (l): ");
		double capienzaB = 100;

		System.out.print("Litri nel serbatoio (0 = a secco): ");
		double litriB = 0.0;

		Automobile b = new Automobile(nomeB, resaB, capienzaB, litriB);

		System.out.println(b.toString());

		System.out.println("Autonomia: " + b.getAutonomia() + " km");
		System.out.println("In riserva? " + b.inRiserva());
		System.out.println("Percorribile 50 km? " + b.isPercorribile(50));

		b.faRifornimento(30);
		System.out.println("Dopo rifornimento di 30 l: " + b.getLitri());
		System.out.println("Autonomia dopo rifornimento: " + b.getAutonomia() + " km");
		
		System.out.println(a.getNome() + " consuma meno di " + b.getNome() + "? " + a.consumaMeno(b));
	
	}
}

