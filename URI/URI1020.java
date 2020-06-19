import java.util.Scanner;

public class URI1020 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        
        int idadeDias = teclado.nextInt();
        int anos, meses, dias;
        int resto;

        anos = idadeDias / 365;  // 400 / 365 = 1 - divisão coletando o cociente
        resto = idadeDias % 365; // 400 % 365 = 35 - divisão coletando o resto
        
        meses = resto /30;  // 35 / 30 = 1
        dias = resto % 30;  // 35 % 30 = 5
        
        System.out.println (anos + " ano(s)");
        System.out.println (meses + " mes(es)");
        System.out.println (dias + " dia(s)");
    }
}