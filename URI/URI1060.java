import java.util.Scanner;

public class URI1060 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int positivos = 0;
        float valores;

        for (int cont=1; cont <=6; cont++) {
            valores = teclado.nextFloat();
            if ( valores > 0) {
                positivos = positivos + 1;
            }
        }
        System.out.println (positivos + " valores positivos");
    }
}