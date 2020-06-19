import java.util.Scanner;

public class Tabuada {
    public static void main (String []args) {
        int num, cont, res;

        num = 6;
        cont = 0;

        while (cont <= 10) {
            res = num * cont;
            System.out.println (num + " x " + cont + " = " +res);
            cont = cont + 1;
        }
    }
}