import java.util.Scanner;

public class Exercicio5 {
    public static void main (String args[]) {

    Scanner teclado = new Scanner (System.in);
    float tempo, velmed, distancia, consumo;

    System.out.println ("Digite o tempo gasto da viagem (em minutos):");
    tempo = teclado.nextFloat();

    System.out.println ("Digite a velocidade media:");
    velmed = teclado.nextFloat();

    distancia = velmed * tempo;
    consumo = distancia / 12;

    //System.out.printf ("A quantidade de litros de combustivel gasto: %.3f\n", consumo);
    System.out.printf ("Voce percorreu %.3f km a uma velocidade de %.3f Km/h e consumiu %.3f litros\n", distancia, velmed, consumo);
    }
}