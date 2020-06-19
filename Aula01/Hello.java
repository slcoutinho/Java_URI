import java.util.Scanner; //Biblioteca Scanner

public class Hello {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        int a,b,c;
        
        System.out.println ("Digite o valor de A:");
        a = teclado.nextInt();
        System.out.println ("Digite o valor de B:");
        b = teclado.nextInt();
        c = a + b;
        
        System.out.println ("Valor de A = " + a);
        System.out.println ("Valor de B = " + b);
        System.out.println ("Soma de A e B = C, que é:" + c);

        System.out.println ("Digite o valor de D:");
        double d = teclado.nextDouble();
        System.out.println ("Valor de d = " + d);
       

        System.out.println ("Treinamento DOTI");
        System.out.println ("#TOP");
    }
}