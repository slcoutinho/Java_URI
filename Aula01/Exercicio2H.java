import java.util.Scanner;

public class Exercicio2H {
    public static void main (String []arg) {
        
        Scanner teclado = new Scanner (System.in);
        float pi = 3.14f;
        float raio, altura, volume;

        System.out.println ("Digite o valor do raio:");
        raio = teclado.nextFloat();
        
        System.out.println ("Digite o valor do altura:");
        altura = teclado.nextFloat();
        
        volume = pi * raio * raio * altura;
        //System.out.println ("O volume do CILINDRO eh:" + volume);
        System.out.printf ("O volume do CILINDRO eh: %.2f\n", volume);
    }

}