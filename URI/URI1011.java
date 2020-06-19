import java.util.Scanner;

public class URI1011 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner (System.in);
        double raio, volume, pi = 3.14159;
        
        raio = teclado.nextDouble();
        volume = (4.0/3) * pi * raio * raio * raio;

        System.out.printf ("VOLUME = %.3f\n", volume);
    }
}