import java.util.Scanner;

public class URI1066 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int par = 0, imp = 0, pos = 0, neg = 0;

        for (int cont=1; cont <=5; cont++) {
            int valor = teclado.nextInt();
            if ( valor % 2 == 0) {
                par ++;
            } 
            else {
                imp ++;
            }
            if (valor > 0 ) {
                pos ++;
            }
            else if (valor < 0) {
                neg ++;
            }
        }
        System.out.println (par + " valor(es) par(es)");
        System.out.println (imp + " valor(es) impar(es)");
        System.out.println (pos + " valor(es) positivo(s)");
        System.out.println (neg + " valor(es) negativo(s)");
    }
}