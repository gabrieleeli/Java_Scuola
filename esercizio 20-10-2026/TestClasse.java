import java.util.Scanner;
public class TestClasse {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int altezza; int base;
		
		
		System.out.println("Inserisci la base intera del rettangolo: ");
			base = Integer.parseInt(in.nextLine());
		
		System.out.println("Inserisci l'altezza intera del rettangolo: ");
			altezza = Integer.parseInt(in.nextLine());
		
		Rettangolo r = new Rettangolo(base, altezza); 
		
			System.out.println(r.toString()); //metodo che mi serve per togliere la stringa esadecimale alla fine di rettangolo
		
		
		Rettangolo r1 = new Rettangolo();
		System.out.println("Inserisci la base intera del secondo rettangolo: ");
			r1.setBase(Integer.parseInt(in.nextLine())); //usando il metodo setBase riesco a scrivere la variabile base dentro rettangolo che ho inzializzato prima
			
		System.out.println("Inserisci l'altezza intera del secondo rettangolo: ");	
			r1.setAltezza(Integer.parseInt(in.nextLine())); //usando il metodo setAltezza riesco a scrivere la variabile base dentro rettangolo che ho inzializzato prima
			
		System.out.println(r1.toString());
		
		//calcoli:
		
		System.out.println("Area primo rettangolo: " + r.area()); //qua uso il metodo area che ho creato in precedenza con la classe
		System.out.println("Perimetro primo rettangolo: " + r.perimetro()); //uso il metodo perimetro
		System.out.println("Diagonale primo rettangolo: " + r.diagonale()); //uso il metodo diagonale
		
		System.out.println("");
		
		System.out.println("Area secondo rettangolo: " + r1.area());
		System.out.println("Perimetro secondo rettangolo: " + r1.perimetro());
		System.out.println("Diagonale secondo rettangolo: " + r1.diagonale());	
		
		Rettangolo r3 = new Rettangolo (int b3, int a3);
		
		System.out.println("Inserisci la base del 3° rettangolo: ");
		b3 = Integer.parseInt(in.nextLine());
		
		System.out.println("Inserisci la base del 2° rettangolo: ");
		a3 = Integer.parseInt(in.nextLine());
		
		System.out.println(r3.toString());
		System.out.println("Rettangolo dopo la somma dei lati: " + r3.sommaLati());
		System.out.println("Rettangolo dopo la duplicazione dei lati: " + r3.duplicaLati());
	}
}





