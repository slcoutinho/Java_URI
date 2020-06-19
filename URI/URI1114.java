import java.util.Scanner;

public class URI1114 {
    public static void main (String []args) {
        Scanner teclado = new Scanner (System.in);
        int pass;
        
        do {
            pass = teclado.nextInt();
            if (pass != 2002) {
                System.out.println ("Senha Invalida");
            }
            else {
                System.out.println ("Acesso Permitido"); 
            }
        } while (pass != 2002);
    }
}