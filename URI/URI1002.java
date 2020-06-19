import java.util.Scanner; //Biblioteca Scanner

public class URI1002 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        double n, area, raio;
        
        n = 3.14159;
        raio = teclado.nextDouble();
        area = (n * (raio * raio));
        
        System.out.printf ("A=%.4f\n", area);
    }
}