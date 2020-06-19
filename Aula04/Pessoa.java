// definição da classe pessoa
public class Pessoa{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String nome;      
    private String sobrenome;
    private int    idade;
    private char   sexo;

    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 4 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Pessoa(String no, String so, int id, char se){
        nome      = no;
        sobrenome = so;
        idade     = id;
        sexo      = se;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String so){
        sobrenome = so;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setIdade(int id){
        idade = id;
    }
    public int getIdade(){
        return idade;
    }
    public void setSexo(char se){
        sexo = se;
    }
    public char getSexo(){
        return sexo;
    }

    // perfumaria do ISIDRO
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return nome+" "+sobrenome+" ("+sexo+") idade: "+idade;
    }

}