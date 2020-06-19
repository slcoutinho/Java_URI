import java.util.Scanner;

public class URI1064 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int positivo = 0;
        float med = 0;
        float soma = 0;

        for (int cont=1; cont <=6; cont++) {
            float valores = teclado.nextFloat();
            if ( valores > 0) {
                positivo = positivo + 1;
                soma = soma + valores;
            }
        }
        med = soma / positivo;
        System.out.println (positivo + " valores positivos");
        System.out.printf ("%.1f\n", med);
    }
}