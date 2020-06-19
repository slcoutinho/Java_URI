import java.util.Scanner;

public class LojaDeConveniencia{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        MaquinaDeRefri m = new MaquinaDeRefri();
        int opcao;
        double valor;
        do{
            System.out.println(m.obterDisplay());
            System.out.println("10 - adicionar credito");
            System.out.println("20 - obter troco");
            opcao = teclado.nextInt();
            switch(opcao){
                case 0:
                case 1:
                case 2:
                case 3:
                    int result = m.comprar(opcao);
                    if (result == 0){
                        System.out.println("Compra efetuada! Aproveite!");
                    }
                    else if (result == 1){
                        System.out.println("Estoque insuficiente");
                    }
                    else if (result == 2){
                        System.out.println("Credito insuficiente");
                    }
                    break;
                case 10:
                    System.out.println("Digite o valor a inserir:");
                    valor = teclado.nextDouble();
                    m.adicionarCredito(valor);
                    break;
                case 20:
                    valor = m.pegarTroco();
                    System.out.println("Seu troco R$ "+valor);
                    break;
                case -1:
                    System.out.println("Ate mais!");
                    break;
                default: 
                    System.out.println("Opcao Invalida");
            }
  
        } while (opcao != -1);
    } 
}