import java.util.Scanner;
public class Es4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("inserisci un numero intero > 1: ");
        int num = in.nextInt();

        boolean primo = true;
		
		if (num <= 1){
			System.out.println("Numero minore o uguale a 1");
			}
		
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

		if (primo == true){
		   System.out.println("numero primo");
		   }
		
		else{
			System.out.println("numero non primo");
			} 
    }
}

