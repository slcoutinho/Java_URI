public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado e1, e2, e3;

        e1 = new Empregado ("Zeh","Diretor", 40.000);
        e2 = new Empregado ("Jaaao","Gerente", 20.000);
        e3 = new Empregado ("Mary","Coord", 10.000);

        System.out.println (e1.imprimir());
        System.out.println (e2.imprimir());
        System.out.println (e3.imprimir());
        
        e1.aumSalario (50);
        e2.aumSalario (100);
        e3.aumSalario (150);
        
        //System.out.println (e1.nome+" , "+e1.cargo+" ganhou um aumentin de "+e1.aumSalario+" e passara a ganhar a bofunfa de R$: "+e1.salario);
        
        System.out.println (e1.imprimir());
        System.out.println (e2.imprimir());
        System.out.println (e3.imprimir());
    }
}