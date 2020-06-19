import java.util.Scanner;

public class Exercicio20 {
    public static void main (String []args) {
        int sexo;
        float altura, pesoIdeal;
        Scanner teclado = new Scanner (System.in);

        System.out.println ("Digite sua altura: ");
        altura = teclado.nextFloat();
        System.out.println ("Digite o sexo, sendo '1 = F' e '2 = M': ");
        sexo = teclado.nextInt();

        if (sexo == 1) {
            pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.printf ("Seu peso ideal: %.2f\n", pesoIdeal);
        }
        else {
            pesoIdeal = (72.7f * altura) - 58.0f;
            System.out.printf ("Seu peso ideal: %.2f\n", pesoIdeal);
        }
    }
}