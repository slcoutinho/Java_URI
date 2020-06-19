public class PessoaTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Pessoa p1, p2, p3;

        // aqui vou criar os objetos
        p1 = new Pessoa("Isidro","Massetto", 41, 'M');
        p2 = new Pessoa("Izildinha","Massetto", 65,'F');
        p3 = new Pessoa("Ivair","Massetto", 72,'M');

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(p3.imprimir());
    }
}