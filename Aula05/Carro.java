public class Carro{
    private String  marca;
    private int     ano;
    private boolean quebrado;

    public Carro(String marca, int ano, boolean quebrado){
        this.marca    = marca;
        this.ano      = ano;
        this.quebrado = quebrado;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    public void setQuebrado(boolean quebrado){
        this.quebrado = quebrado;
    }
    public boolean isQuebrado(){
        return quebrado;
    }

    public String obterInfo(){
        return marca+"("+ano+")  Quebrado? "+quebrado;
    }
    
}