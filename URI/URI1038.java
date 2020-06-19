import java.util.Scanner;

public class URI1038 {
    public static void main (String []args) {
        Scanner teclado = new Scanner (System.in);
        int cod = teclado.nextInt();
        int qtde = teclado.nextInt();
        float valor = 0;

        if (cod == 1) {
            valor = qtde * 4.0f;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }
        else {
            if (cod == 2) {
                valor = qtde * 4.50f;
                System.out.printf ("Total: R$ %.2f\n", valor);
            }
            else {
                if (cod == 3) {
                    valor = qtde * 5.0f;
                    System.out.printf ("Total: R$ %.2f\n", valor);
                }
                else {
                    if (cod == 4) {
                        valor = qtde * 2.0f;
                        System.out.printf ("Total: R$ %.2f\n", valor);
                    }
                    else {
                        if (cod == 5) {
                            valor = qtde * 1.50f;
                            System.out.printf ("Total: R$ %.2f\n", valor);
                        }
                    }
                }
            }
        }
    }
}