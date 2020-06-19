
public class AppQueUsaCarro{
    public static void main(String args[]){
        
        Oficina o = new Oficina("OFICINA DO ZE");
        Carro c1 = new Carro("Vokis",1978, false);
        Carro c2 = c1;
    
        System.out.println(c1.obterInfo());

        c1.setQuebrado(true); /// poootz quebrei o fuscao.
         
        System.out.println(c1.obterInfo());

        o.consertar(c1);

        System.out.println(c1.obterInfo());
        
    }
}