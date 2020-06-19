import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2A {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float lado, area;
        
        System.out.println ("Digite o valor do lado do quadrado:");
        lado = teclado.nextFloat();
        
        area = lado * lado;
        
        System.out.println ("O valor da area = " + area);
    }
}