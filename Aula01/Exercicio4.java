import java.util.Scanner;

public class Exercicio4 {
    public static void main (String args[]) {

    Scanner teclado = new Scanner (System.in);
    float salL, salB, v_hora, q_hora, per_inss, des_inss;

    System.out.println ("Digite o valor da hora trabalhada:");
    v_hora = teclado.nextFloat();

    System.out.println ("Digite a quantidade de horas trabalhadas:");
    q_hora = teclado.nextFloat();

    System.out.println ("Digite o percentual % de desconto do INSS:");
    per_inss = teclado.nextFloat();

    des_inss = per_inss / 100f;
    salB = q_hora * v_hora;
    salL = salB - salB * des_inss;

    System.out.printf ("Calculo do salario bruto: %.2f\n", salB);
    System.out.printf ("Calculo do salario liquido: %.2f\n", salL);
    }
}