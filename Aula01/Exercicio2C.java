import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2C {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float base, altura, area;
        
        System.out.println ("Digite o valor da base do triangulo:");
        base = teclado.nextFloat();
        
        System.out.println ("Digite o valor da altura do triangulo:");
        altura = teclado.nextFloat();
        
        area = (base * altura)/2;
        
        System.out.println ("O valor da area = " + area);
    }
}