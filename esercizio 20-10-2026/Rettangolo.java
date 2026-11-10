public class Rettangolo { //con questo creo la classe
	
	private int base; //creo due variabili private
	private int altezza;
	
	public Rettangolo() { //qua creo il metodo costruttore
		base = 0; //qua assegnamo il valore di sia base che altezza entrabi pari a 0
		altezza = 0;
	}	
	
	public Rettangolo(int b, int h) {
		base = b; //qua abbiamo fatto il metodo cosruttore con ingresso
		altezza = h;
	}	
	
	public int getBase(){ //qua creiamo il metodo che ci permette di ricevere la base
		return base;
	}
	
	public int getAltezza(){ //metodo che serve per ricevere l'altezza
		return altezza;
	}

	public void setAltezza(int nh){ //questo serve per cambiare il valore dell'altezza e della variabile
		altezza = nh; 
	}
	
	public void setBase(int nb){
		base = nb; 
	}
	
	public double area(){ //creo il metodo per ricevere l'area
		return base * altezza;
	}
	
	public double perimetro(){ //creo il metodo per ricevere il perimetro 
		return (base + altezza) * 2;
	}
	
	public double diagonale(){ //creo il metodo per ricevere la diagonale
		return Math.sqrt((base * base) + (altezza * altezza));
		//return hypot(base, altezza);
	}
	
	public String toString(){ 
		String s = "Rettangolo 1 dati: ";
		s +="base: " + base;
		s +=" altezza: " + altezza;
		return s;
	}
	
	public Rettangolo(Rettangolo r){
		this.base = r.base; //this. fa riferimento alla base che ho inserito io nella base o altezza che ho inserito nel programma TestClasse.java
		this.altezza = r.altezza;
		}
	
	public Rettangolo sommaLati(Rettangolo y){
		Rettangolo r2 = new Rettangolo(this.base + y.base, this.altezza + y.altezza);	
		return r2;
		}
	 
	 public boolean areaVer(Rettangolo r){
		 
	 if (this.area() == r.area()){
			return true;
		}

		else{
			return false;
			}
		 }
	
	public Rettangolo duplicaLati(){
		int doppBase = this.base * 2; 
		int doppAlt = this.altezza * 2;
		
		//return doppBase;
		//return doppAlt;
		return new Rettangolo(doppBase, doppAlt);
		}
		
	public Rettangolo sommaLati(){
		int somBase = this.base + this.base;
		int somAlt = this.altezza + this.altezza;
		
		//return somBase;
		//return somAlt; 
		return new Rettangolo(somBase, somAlt);
		}	
}
