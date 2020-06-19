import java.util.Scanner;

public class URI1072 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int n = teclado.nextInt();       // quantidade de inteiros
        int x = 0, in = 0, out = 0;      // valor dos inteiros

        //Math.pow (base, expoente);
        //int pot = (int) Math.pow (10,7);

        for (int cont=1; cont <= n; cont++) {
            x = teclado.nextInt();
            if (x >= 10 && x <= 20) {
                in ++;
            } 
            else {
                out ++;
            }
        }
        System.out.println (in + " in");
        System.out.println (out + " out");
    }
}