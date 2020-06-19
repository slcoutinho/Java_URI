import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2D {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float diagonal1, diagonal2, area;
        
        System.out.println ("Digite o valor da 1a diagonal do losango:");
        diagonal1 = teclado.nextFloat();
        
        System.out.println ("Digite o valor da 2a diagonal do losango:");
        diagonal2 = teclado.nextFloat();
        
        area = (diagonal1 * diagonal2);
        
        System.out.println ("A area do losango eh:" + area);
    }
}