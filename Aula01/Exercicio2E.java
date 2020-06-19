import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2E {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float baseMaior, baseMenor, altura, area;
        
        System.out.println ("Digite o valor da base MAIOR do trapezio:");
        baseMaior = teclado.nextFloat();
        
        System.out.println ("Digite o valor da base MENOR do trapezio:");
        baseMenor = teclado.nextFloat();

        System.out.println ("Digite o valor da altura do trapezio:");
        altura = teclado.nextFloat();
        
        area = ((baseMaior + baseMenor) * altura ) /2;
        
        System.out.println ("A area do trapezio eh:" + area);
    }
}