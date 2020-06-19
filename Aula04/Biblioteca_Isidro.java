import java.util.Scanner;
public class Biblioteca_Isidro {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        Livro_Isidro acervo[]; // acervo agora é um conjunto (array) de Livros
        acervo = new Livro_Isidro[5]; // meu acervo agora é um array de 5 posições de livros
                               // equivale a: l1, l2, l3, l4, l5

        acervo[0] = new Livro_Isidro("Java Basico   ","Isidro",2020,"Terror",1,2,false);
        acervo[1] = new Livro_Isidro("Java Web      ","Isidro",2020,"Terror Pesado",1,3,false);
        acervo[2] = new Livro_Isidro("Java Avançado ","Isidro",2020,"Vish!!",1,4,false);
        acervo[3] = new Livro_Isidro("Banco de Dados","Pedro ",2020,"Auto Ajuda",2,1, false);
        acervo[4] = new Livro_Isidro("Churrasco pq essa vida me cansa","Zé da Couve",2020,"Crescimento Pessoal", 2, 4, false);                         
 
        do{
            for (int pos=0; pos<acervo.length; pos++){
                if (!acervo[pos].isEmprestado()){
                   System.out.println(acervo[pos].imprimirInfo());
                }
            }
            System.out.println("Digite o codigo (0-4) do livro a emprestar!");
            opcao = teclado.nextInt();
            if (opcao >= acervo.length  || opcao < 0){
                System.out.println("Ow! Opcao invalida");
            }
            else{
                //Livro l = acervo[opcao];
                if (acervo[opcao].isEmprestado()){
                    System.out.println("Lamento, o livro "+acervo[opcao].getTitulo()+" esta emprestado!");
                }
                else{
                    acervo[opcao].emprestar();
                    System.out.println("Emprestimo realizado com sucesso!");
                }
            }
        } while (opcao != -1);       
    }
}