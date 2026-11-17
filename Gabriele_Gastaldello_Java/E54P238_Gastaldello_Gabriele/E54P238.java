import java.util.Scanner;
public class E54P238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
    
        if (CharAt(a, 0) == CharAt(a.length()-1)) {
            System.out.println("prima e ultima lettera uguali");
        } else {
            System.out.println("ultime due lettere diverse");
        }

    }
}
