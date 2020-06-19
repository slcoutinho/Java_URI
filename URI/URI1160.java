import java.util.Scanner;

public class URI1160 {
    public static void main (String []args) {
        Scanner teclado = new Scanner (System.in);
        int pa, pb, anos;
        double g1, g2;
        int t;
        
        t = teclado.nextInt();
        for (int cont=1; cont <=t; cont++) {
            anos = 0;
            pa = teclado.nextInt();
            pb = teclado.nextInt();
            g1 = teclado.nextDouble();
            g2 = teclado.nextDouble();
               
            do {
                pa = (int) (pa + pa*g1/100);
                pb = (int) (pb + pb*g2/100);
                anos++;
                if (anos > 100) {
                    break;
                }
            } while (pa <= pb);
            if (anos > 100) {
                System.out.println ("Mais de 1 seculo.");
            }
            else {
                System.out.println (anos + " anos.");
            }
        }
    }
}