import java.util.Scanner;

public class URI1009 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner (System.in);
        String nome;
        double salfixo, totalvendas, comissao, totalreceber;

        nome = teclado.nextLine();
        salfixo = teclado.nextDouble();
        totalvendas = teclado.nextDouble();
        
        comissao = totalvendas * 0.15;
        totalreceber = salfixo + comissao;

        System.out.printf ("TOTAL = R$ %.2f\n", totalreceber);
    }
}