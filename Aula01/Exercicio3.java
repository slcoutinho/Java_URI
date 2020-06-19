import java.util.Scanner;

public class Exercicio3 {
    public static void main (String args[]) {
    Scanner teclado = new Scanner (System.in);
    float salario, qtdeKW, Val100KW, ValPag, ValKW, desconto, ValComDes;

    System.out.println ("Digite o valor do seu salario minimo:");
    salario = teclado.nextFloat();

    System.out.println ("Digite a quantidade de KW utilizada:");
    qtdeKW = teclado.nextFloat();

    Val100KW = (salario / 7);
    ValKW = Val100KW / 100;
    ValPag = qtdeKW * ValKW;
    desconto = (ValPag * 0.01f);
    ValComDes = ValPag - desconto;

    System.out.printf ("Valor em R$ de cada KW: %.2f\n", ValKW);
    System.out.printf ("Valor em R$ a ser pago: %.2f\n", ValPag);
    System.out.printf ("Valor com desconto de 10%%: %.2f\n", ValComDes);
    }
}