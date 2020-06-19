import java.util.Scanner;

public class URI1010 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner (System.in);
        
        int cod1, num1, cod2, num2; 
        double valuni1, valuni2, valor;
        
        cod1 = teclado.nextInt();
        num1 = teclado.nextInt();
        valuni1 = teclado.nextDouble();

        cod2 = teclado.nextInt();
        num2 = teclado.nextInt();
        valuni2 = teclado.nextDouble();
        
        valor = num1 * valuni1 + num2 * valuni2;

        System.out.printf ("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}