public class CerchioClassTester {
	
	public static void main (String[] args) {
		Cerchio c = new Cerchio(67);
		Cerchio d = new Cerchio(6.7);
		//System.out.println(c.getRaggio().toString());
		System.out.println("Raggio del cerchio: " + c.getRaggio());
		System.out.println("Area del cerchio: " + c.getArea());
		System.out.println("Circonferenza del cerchio: " + c.getCirc());
		System.out.println("Mezzo raggio: " +  c.mezzRagg());
		System.out.println("raggio + 6.7: " +  c.sommaRaggio(d));
	}
}

