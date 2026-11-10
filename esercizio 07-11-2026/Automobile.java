public class Automobile {
	
	private String nome;
	private double resa;
	private double capienza;
	private double litriSerb;
	
	public Automobile(String n, double r, double c, double l){
		nome = n;
		resa = r;
		capienza = c;
		litriSerb = l;
		}
	
	public Automobile(String n, double r, double c){
		nome = n;
		resa = r;
		capienza = c;
		litriSerb = 0;
		}
	
	public String getNome(){
		return nome;
		}
		
	public double getResa(){
		return resa;
		}
	
	public double getCapienza(){
		return capienza;
		}
	
	public double getLitri(){
		return litriSerb;
		}
		
	public void setNome(String nome){
		this.nome = nome; 
		}
		
	//~ public void setResa(double resa){
		//~ this.resa = resa;
		//~ }
		
	//~ public void setCapienza(double capienza){
		//~ this.capienza = capienza; 
		//~ }
	
	public void setLitri(double litriSerb){
		if (litriSerb <= capienza){
		this.litriSerb = litriSerb;
		}
		else {
			this.litriSerb = capienza;
			}
	}
	
	public String toString(){
		return "Automobile: " + nome + " con capienza di: " + capienza + "Litri" + " e una resa di: " + resa + "Km/L " + "con: " + litriSerb + "Litri nel serbatoio";
		}
	
	public boolean isPercorribile(double distanza){
		boolean rispo;
		if (resa * litriSerb >= distanza ){
			rispo = true;
			return rispo;
			}
		
		else{
			rispo = false;
			return rispo;
			}
		}
		
	public void percorri(double distanza){
		if (isPercorribile(distanza)){
			this.litriSerb = litriSerb - (distanza / resa);
			}
		}
		
	public double getAutonomia(){
		double a = resa * litriSerb;
		return a;
		}	
		
	public boolean inRiserva(){
		if(litriSerb <= ((capienza*5)/100)){
			return true;
			}
		
		else{
			return false;
			}
		}
		
	public double faiPieno(double benzAgg){
		if (litriSerb < capienza){
			double a = litriSerb + benzAgg;
			if(a >= capienza){
				this.litriSerb = litriSerb + benzAgg;
				return litriSerb;
				}
			else{
				this.litriSerb = capienza;
				return litriSerb;
				}
			}
		else {
			return litriSerb;
			}	
		}	
	
	public void faRifornimento(double quantita){
		if (litriSerb + quantita > capienza){
			this.litriSerb = capienza;          // rifornimento eccessivo: pieno
			}
		else {
			this.litriSerb = litriSerb + quantita;   // aggiorno il carburante presente
			}
		}

	public boolean consumaMeno(Automobile altra){
		if (this.resa > altra.resa){
			return true;
			}
		else {
			return false;
			}
		}
}


