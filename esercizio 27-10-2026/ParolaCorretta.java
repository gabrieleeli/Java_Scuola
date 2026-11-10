public class ParolaCorretta {
	
	private String parola;
	//~ private String pcar;
	//~ private String ucar;
	//~ private String centrale;
	//~ private String invertita;
	//~ private String key;
	//~ private String cifrata;
	
	public ParolaCorretta(String p){
		parola = p;
		}
	
	public void setParola(String c){
		parola = c;
		}
		
	public String getParola(){
		return parola;
		}
	
	public String toString(){
		return "Parola = " + parola;
		}
		
	public char getFirstChar(){
		char pcar;
		pcar = parola.charAt(0);
		return pcar;
		}
		
	public char getLastChar(){
		char ucar;
		ucar = parola.charAt(parola.length() - 1);
		return ucar;
		}
		
	public String getCenter(){
		int lunghezza = parola.length();
		String centrale;
		
		if (lunghezza % 2 == 0){
			int inizio = (lunghezza / 2) - 1;
			int fine = (lunghezza / 2) + 1;
			
			centrale = parola.substring(inizio, fine);
			}
		
		else {
			int indice = lunghezza / 2;
			centrale = parola.substring(indice, indice + 1);
		}
		
		return centrale;
		}
		
		public void concString(String conc){
			parola = parola + conc;
			}
		
		public String invertiParola(){
			String invertita = "";
			for (int i = parola.length() - 1; i >= 0; i--){
				invertita =invertita + parola.charAt(i); 
				}
			return invertita;
			}
			
		public String cifrarioDiCesare(int k){
			
			String s = "";
			
			for (int i = 0; i < parola.length(); i++){
				char c = s.charAt(i);
				char t = (char)(c + k);
				s = s + t;
				}
				
			return s;
			
			}
}			

