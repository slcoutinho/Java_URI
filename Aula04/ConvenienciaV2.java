import javax.swing.JOptionPane;
public class ConvenienciaV2{
    public static void main(String args[]){
        MaquinaDeRefri m = new MaquinaDeRefri();
        int opcao;
        double valor;
        do{
            String txtOpcao = JOptionPane.showInputDialog(m.obterDisplay()+"\n"+"10 - adicionar credito"+"\n"+"20 - obter troco");
            //System.out.println(m.obterDisplay());
            //System.out.println("10 - adicionar credito");
            //System.out.println("20 - obter troco");
            opcao = Integer.parseInt(txtOpcao);
            switch(opcao){
                case 0:
                case 1:
                case 2:
                case 3:
                    int result = m.comprar(opcao);
                    if (result == 0){
                        JOptionPane.showMessageDialog(null,"Compra efetuada! Aproveite!");
                    }
                    else if (result == 1){
                        JOptionPane.showMessageDialog(null,"Estoque insuficiente");
                    }
                    else if (result == 2){
                        JOptionPane.showMessageDialog(null,"Credito insuficiente");
                    }
                    break;
                case 10:
                    String txtValor = JOptionPane.showInputDialog("Digite o valor a inserir:");
                    //System.out.println("Digite o valor a inserir:");
                    valor = Double.parseDouble(txtValor);
                    m.adicionarCredito(valor);
                    break;
                case 20:
                    valor = m.pegarTroco();
                    JOptionPane.showMessageDialog(null,"Seu troco R$ "+valor);
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null,"Ate mais!");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"Opcao Invalida");
            }
  
        } while (opcao != -1);
    } 
}