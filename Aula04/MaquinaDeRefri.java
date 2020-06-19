public class MaquinaDeRefri{
    private double credito;
    private Refrigerante lista[];

    public MaquinaDeRefri(){
        this.credito = 0.0;
        this.lista = new Refrigerante[4];
        this.lista[0] = new Refrigerante("Coca Cola", 2.50, 5);
        this.lista[1] = new Refrigerante("Fanta    ", 2.00, 5);
        this.lista[2] = new Refrigerante("Sprite   ", 2.00, 5);
        this.lista[3] = new Refrigerante("Pepsi    ", 1.80, 5);
    }

    public void adicionarCredito(double valor){
        this.credito += valor;
    }

    public double pegarTroco(){
        double troco = this.credito;
        this.credito = 0.0;
        return troco;
    }

    public String obterDisplay(){
        return "CREDITO R$ "+this.credito+"\n"+
                 "[0] - "+lista[0].getNome()+"  R$"+lista[0].getPreco()+"\n"+
                 "[1] - "+lista[1].getNome()+"  R$"+lista[1].getPreco()+"\n"+
                 "[2] - "+lista[2].getNome()+"  R$"+lista[2].getPreco()+"\n"+
                 "[3] - "+lista[3].getNome()+"  R$"+lista[3].getPreco()+"\n";
    }

    /*
     criei uma convencao para:
         0 - consegui comprar (tem estoque e tem credito suficiente)
         1 - não tem estoque
         2 - não tem crédito
    */
    public int comprar(int num){
        if (this.credito >= lista[num].getPreco()){
            if (lista[num].getQtde() > 0){
                this.credito -= lista[num].getPreco(); // subtraio o credito
                lista[num].tirarEstoque();             // tiro do estoque
                return 0; // compra ok - sem erros
            }
            else{
                return 1; // erro por nao ter estoque
            }
        }
        else{
            return 2; // erro por nao ter credito
        }
    }
}