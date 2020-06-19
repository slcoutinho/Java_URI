import java.util.Scanner;

public class URI1007 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        int a, b, c, d, DIFERENCA;
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        DIFERENCA = (a * b - c * d);
        System.out.println ("DIFERENCA = "+ DIFERENCA);
    }
}