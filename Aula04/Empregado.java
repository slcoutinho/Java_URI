public class Empregado {
    private String nome, cargo;      
    private double salario;

    public Empregado (String no, String ca, double sa){
        nome      = no;
        cargo     = ca;
        salario   = sa;
    }

    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setCargo(String ca){
        cargo = ca;
    }
    public String getCargo(){
        return cargo;
    }
    public void setSalario(double sa){
        salario = 0;
    }
    public double getSalario(){
        return salario;
    }
    public String imprimir(){
        return nome+" , "+cargo+", com salario de R$: "+salario;
    }
    public void aumSalario(double percentual){
        salario = salario + (salario * percentual) / 100;
    }
}