import java.util.Scanner;

public class URI1073 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int n = teclado.nextInt();
        int x = 0, in = 0, out = 0;

        for (int cont=1; cont <= n; cont++) {
            if (cont % 2 == 0) {
                int pot = (int) Math.pow (cont,2);
                System.out.println (cont+ "^2 = " +pot);
            }
        }
    }
}