import java.util.Scanner;

public class URI1041 {
    public static void main (String []args) {
        Scanner teclado = new Scanner (System.in);
        float x = teclado.nextFloat();
        float y = teclado.nextFloat();
        
        if (x == 0.0f && y == 0.0f) {
            System.out.println ("Origem");
        }
        else {
            if (x == 0 && y != 0) {
                System.out.println ("Eixo Y");
            }
            else {
                if (x != 0 && y == 0) {
                System.out.println ("Eixo X");
                }
            }
            if (x > 0.0f && y > 0.0f) {
                System.out.println ("Q1");
            }
            if (x > 0.0f && y < 0.0f) {
                System.out.println ("Q4");
            }
            if (x < 0.0f && y > 0.0f) {
                System.out.println ("Q2");
            }
            if (x < 0.0f && y < 0.0f) {
                System.out.println ("Q3");
            }
        }
    }
}