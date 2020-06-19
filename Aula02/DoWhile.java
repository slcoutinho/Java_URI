import java.util.Scanner;

public class DoWhile {
    public static void main (String []args) {
        int valor = 100;

        do {
            System.out.println ("Valor = " +valor);
            valor = valor + 1;
        } while (valor <= 10);
    }
}