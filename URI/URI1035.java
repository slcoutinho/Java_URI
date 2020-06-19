import java.util.Scanner;

public class URI1035 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int soma1 = c + d;
        int soma2 = a + b;

        if ((b > c && d > a) && (soma1 > soma2) && (c > 0 && d > 0) && (a % 2 == 0)) {
            System.out.println ("Valores aceitos");
        }
        else {
            System.out.println ("Valores nao aceitos");
        }
    }
}