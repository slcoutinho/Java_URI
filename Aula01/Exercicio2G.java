import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2G {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float volume, lado;
        
        System.out.println ("Digite o valor do lado do cubo:");
        lado = teclado.nextFloat();
        
        volume = lado * lado * lado;
        System.out.println ("O volume do CUBO eh:" + volume);
    }
}