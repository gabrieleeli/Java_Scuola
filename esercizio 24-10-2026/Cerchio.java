public class Cerchio {
	private double raggio;
	
	public Cerchio(){
		raggio = 0;
		}
		
	public Cerchio(double r){
		raggio = r;
		}
		
	public Cerchio(Cerchio c){
		
		this.raggio	= c.raggio;
		}
	
	public String toString(){
		String s = "";
		s += "Il raggio è pari a: " + raggio;
		return s;
		}
	
	public void setRaggio(double r){ //serve per cambiare il valore della variabile
		raggio = r;
		}
	
	public double getRaggio(){
		return raggio;
		}
		
	public double getArea(){
		double area = Math.PI * (raggio * raggio);
		return area;
		}
		
	public double getCirc(){
		double circonferenza = (2.0*raggio) * Math.PI;
		return circonferenza;
		}
		
	public Cerchio mezzRagg(){
		Cerchio c1 = new Cerchio(this.raggio/2);
		return c1;
		}
		
	public Cerchio sommaRaggio(Cerchio f){
		Cerchio h = new Cerchio(this.raggio + f.raggio);
		return h;
		}
}


