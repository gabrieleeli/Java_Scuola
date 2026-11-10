import java.util.Random;

public class Salvadanaio {
	private int denaro;
	private String nome;
	private boolean intero; 
	
	public Salvadanaio(String s){
		denaro = 0;
		nome = s;
		intero = true;
		}
	
	public String toString(){
		return "Salvadanaio di: " + nome + "Con: " + denaro + " è riparato: " + intero;
		} 
		
	public void setDenaro(int sold){
		if (intero == true){denaro += sold;}
		}
	
	public int getDenaro(){
		return denaro;
		}
		
	public String getProprietario(){
		return nome;
		}
		
	public int scuoti(){
		if (intero == true){
		Random r = new Random();
		denaro -= r.nextInt(denaro) + 1;
		return denaro;
		}
		else {
			return 0;
			}
		}
		
	public int rompi(){
		if (intero == true){
			intero = false;
			return denaro; 
			}
		
		else{
			return 0;
			}
		}
	
	public void ripara(){
		if(intero == false){
			intero = true;
			denaro = 0;
			}
		}
	
	public void trasferisci(Salvadanaio p){
		if (this.intero==true){
			if (p.intero == true){
				p.denaro += this.denaro;
				this.denaro = 0;
				}
		}
}
}

