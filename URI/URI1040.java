import java.util.Scanner;

public class URI1040 {
    public static void main (String []args) {
        Scanner teclado = new Scanner (System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float n3 = teclado.nextFloat();
        float n4 = teclado.nextFloat();
        float med, medFinal;

        med = (n1*2 + n2*3 + n3*4 + n4*1) / 10;

        if (med < 5.0f) {
            System.out.printf ("Media: %.1f\n", med);
            System.out.println ("Aluno reprovado.");
        }
        else {
            if (med >= 5.0f && med <= 6.9f) {
                float nExame = teclado.nextFloat();
                System.out.printf ("Media: %.1f\n", med);
                System.out.println ("Aluno em exame.");
                System.out.printf ("Nota do exame: %.1f\n", nExame);
                medFinal = (med + nExame) / 2;
                
                if (nExame >= 5.0f) {
                    System.out.println ("Aluno aprovado.");
                    System.out.printf ("Media final: %.1f\n", medFinal);
                }
                else {
                    System.out.printf ("Media: %.1f\n", med);
                    System.out.println ("Aluno reprovado.");
                    System.out.printf ("Media final: %.1f\n", medFinal);
                }
            }
            else {
                if (med >= 7.0f) {
                    System.out.printf ("Media: %.1f\n", med);
                    System.out.println ("Aluno aprovado.");
                }
            }       
        }
    }
}