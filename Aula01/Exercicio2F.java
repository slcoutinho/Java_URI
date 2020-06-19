import java.util.Scanner; //Biblioteca Scanner

public class Exercicio2F {
    public static void main (String arg[]){

        Scanner teclado = new Scanner (System.in);
        float volume, altura, largura, profundidade;
        
        System.out.println ("Digite o valor da ALTURA:");
        altura = teclado.nextFloat();
        
        System.out.println ("Digite o valor da LARGURA:");
        largura = teclado.nextFloat();

        System.out.println ("Digite o valor da PROFUNDIDADE:");
        profundidade = teclado.nextFloat();
        
        volume = altura * largura * profundidade;
        
        System.out.println ("O volume do PARALELEPIPEDO eh:" + volume);
    }
}