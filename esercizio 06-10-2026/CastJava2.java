
public class CastJava2 {
	
	public static void main (String[] args) {
		double a; int b = 10; int c = 3;
		
		a = 10/3; //anche se io ho definito che a è un double comunque il mio risultato sarà intero perchè i miei dati sono interi
		System.out.println("Prima del cast: " + a);
		
		a = (double) b/c; //dopo il cast in double il mio numero appare tutto il resto del risultato
		System.out.println("Dopo il cast: " + a);
		
		a = (double) (b/c); //qua il cast in double è superfluo siccome se metto l'operazione (b/c) il valore calcolato sarà intero e non verrà preso in considerazione dal cast 
		System.out.println("Cast tra parentesi: " + a);
					
					//Costanti:
					
		System.out.println("Pi Greco: " + Math.PI);
		System.out.println("Numero di Neplero: " + Math.E);
		
		
		
		int d = 5;
		System.out.println(d);
		System.out.println(d++); //con questo vado ad incrementare la variabile di 1, ma non scrivo il risultato incrementato 
		System.out.println(++d); //con questo vado ad incrementare la variabile di 1, e scrivo il risultato a schermo
		
		
		
		int t = 2;
		t *= 2; // modo alternativo per scrivere t = t *2;
		System.out.println(t);
		
					//Pagina 137
					
		double f = 4.35;
		System.out.println(100 * f);  //qua c'è un apparente errore ma è un difetto della trasformazione da decimale a binario 
		
					//Pagina 195
					
		double r = Math.sqrt(2);
		double e = r * r - 2;
		if (e == 0){
			
			System.out.println("sqrt(2) quadrato meno 2 è uguale a 0");
			
			}
					
		else{	
			
			System.out.println("sqrt(2) quadrato meno 2 non è 0 ma: " + e);	
			
			}
		
		/*
			
		final double EPSILON = 1E - 14; // in questo caso 1E - 14 è pari a 1 * 10^(-14)
		if (Math.abs(e) <= EPSILON)
			{
				//x è quasi uguale a y
			}
		*/
		
		
	}
}
