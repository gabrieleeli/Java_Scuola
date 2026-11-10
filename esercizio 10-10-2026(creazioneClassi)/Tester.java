public class Tester {
	
	public static void main (String[] args) {
		Counter idk = new Counter();
		
		int val = 0;
		System.out.println("valore di val iniziale: " + val);
		
		idk.click();
		val = idk.getValue();
		System.out.println("conteggio di val: " + val);
		
		idk.reset();
		val = idk.getValue();
		System.out.println("Val resettato: " + val);
		
		//int b = idk.value+67;
		//System.out.println("valore di value: " + b);
	}
}

