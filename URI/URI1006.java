import java.util.Scanner;

public class URI1006 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        double a, b, c, MEDIA;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        MEDIA = (a * 2 + b * 3 + c * 5) / 10;
        System.out.printf ("MEDIA = %.1f\n", MEDIA);
    }
}