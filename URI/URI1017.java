import java.util.Scanner;

public class URI1017 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        int tempo, velocidade;
        double distancia;
       
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        distancia = (tempo * velocidade) / 12f;
        System.out.printf ("%.3f\n", distancia);
    }
}