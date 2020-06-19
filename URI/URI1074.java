import java.util.Scanner;

public class URI1074 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int n = teclado.nextInt();

        for (int cont=1; cont <= n; cont++) {
            int x = teclado.nextInt();
            if (x % 2 == 0 && x > 0) {
                System.out.println ("EVEN POSITIVE");
            }
            else if (x % 2 == 0 && x < 0) {
                System.out.println ("EVEN NEGATIVE");
            }
            else if (x % 2 != 0 && x > 0) {
                System.out.println ("ODD POSITIVE");
            }
            else if (x % 2 != 0 && x < 0) {
                System.out.println ("ODD NEGATIVE");
            }
            else if (x == 0) {
                System.out.println ("NULL");
            }
        }
    }
}