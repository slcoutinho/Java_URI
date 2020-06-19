import java.util.Scanner;

public class URI1065 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int qtdePares = 0;
        int num;

        for (int cont=1; cont <=5; cont++) {
            num = teclado.nextInt();
            if (num % 2 == 0) {
                qtdePares = qtdePares +1;
            }
        }
        System.out.println (qtdePares + " valores pares");
    }
}