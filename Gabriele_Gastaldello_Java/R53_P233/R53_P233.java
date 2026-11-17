public class R53_P233 {
	
	public static void main (String[] args) {
		s = 0; 
		if (x > 0) {s++; }
		if (y > 0) {s++; }
	//In questo caso Java controlla entrambe le condizioni, indipendentemente l'una dall'altra.
		
		s = 0;
		if (x > 0) {s++; }
		else if (y > 0) {s++; }
	
	//In questo caso le condizioni sono collegate tra loro (if a cascata)
	}
	
}

