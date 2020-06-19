import java.util.Scanner;

public class URI1008 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner (System.in);
        int numero_func, horas_trab;
        double val_hora, salario;

        numero_func = teclado.nextInt();
        horas_trab = teclado.nextInt();
        val_hora = teclado.nextDouble();

        salario = horas_trab * val_hora;
        System.out.println ("NUMBER = " + numero_func);
        System.out.printf ("SALARY = U$ %.2f\n", salario);
    }
}