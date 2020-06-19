import java.util.Scanner;

public class URI1005 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        double a, b, MEDIA;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();

        MEDIA = (a * 3.5 + b * 7.5) / 11;
        System.out.printf ("MEDIA = %.5f\n", MEDIA);
    }
}