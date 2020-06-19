public class Oficina{
    private String nome;

    public Oficina(String nome){
        this.nome = nome;
    }

    public void consertar(Carro c){
        System.out.println("***** "+nome+" *****");
        if (c.isQuebrado()){
            System.out.println("Consertando o carro "+c.getMarca());
            c.setQuebrado(false);
        }
        else{
            System.out.println("O carr "+c.getMarca()+" nao ta quebrado chefia.");
        }
    }
}