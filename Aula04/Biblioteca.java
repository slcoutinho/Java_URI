import java.util.Scanner;

public class Biblioteca {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        Livro acervo[];
        acervo = new Livro [5];
        acervo[0] = new Livro ("Fritando o cerebro",   "Isidro", 2020, "TI", 1, 5, true);
        acervo[1] = new Livro ("Detonando no Java",    "Isidro", 2000, "TI", 2, 4, true);
        acervo[2] = new Livro ("Java para cabacos",    "Isidro", 1999, "TI", 3, 3, false);
        acervo[3] = new Livro ("Java como programar 2","Isidro", 1985, "TI", 3, 2, true);
        acervo[4] = new Livro ("Javaiiiiii",           "Isidro", 2003, "TI", 4, 1, false); 
        
        /* Livro l1, l2, l3, l4, l5;
        l1 = new Livro ("Fritando o cerebro",   "Isidro", 2020, "TI", 1, 5, true);
        l2 = new Livro ("Detonando no Java",    "Isidro", 2000, "TI", 2, 4, true);
        l3 = new Livro ("Java para cabacos",    "Isidro", 1999, "TI", 3, 3, false);
        l4 = new Livro ("Java como programar 2","Isidro", 1985, "TI", 3, 2, true);
        l5 = new Livro ("Javaiiiiii",           "Isidro", 2003, "TI", 4, 1, false);
        
        System.out.println (l1.imprimir());
        System.out.println (l2.imprimir());
        System.out.println (l3.imprimir());
        */

        for (int pos=0; pos<acervo.length; pos++) {
            System.out.println (acervo[0].imprimir()));
        }

        do {
            System.out.println ("Digite o codigo (0-4) do livro a emprestar:");
            opcao = teclado.nextInt();
            if (opcao > 4 || opcao <0) {
                System.out.println ("Opcao invalida!");
            }
            else {
                if (acervo [opcao].emprestado()) {
                    System.out.println ("Lamento, o livro "+acervo[opcao].getTitulo()+" esta emprestado");
                }
                else {
                    acervo[opcao].emprestar();
                    System.out.println ("Emprestimo realizado com sucesso!");
                }
            }
        } while (opcao != -1);
    }
}