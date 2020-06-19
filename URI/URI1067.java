import java.util.Scanner;

public class URI1067 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int X = teclado.nextInt();
        int imp;

        for (imp = 1; imp <= X; imp = imp + 2) {
            System.out.println (imp);    
        }
    }
}