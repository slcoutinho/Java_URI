public class Livro {
    private String titulo, autor, categoria;
    private int numEstante, numPrateleira, anoPub;
    private boolean emprestado;

    public Livro (String tit, String aut, int ano, String cat, int est, int pra, boolean emp) {
        this.titulo         = tit;  
        this.autor          = aut; 
        this.anoPub         = ano;
        this.categoria      = cat; 
        this.numEstante     = est; 
        this.numPrateleira  = pra;
        this.emprestado     = emp;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor (String autor) {
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setNumEstante (int numEstante) {
        this.numEstante = numEstante;
    }
    public int getNumEstante(){
        return numEstante;
    }
    public void setNumPrateleira (int numPrateleira) {
        this.numPrateleira = numPrateleira;
    }
    public int getNumPrateleira(){
        return numPrateleira;
    }
    public void setAnoPub (int anoPub) {
        this.anoPub = anoPub;
    }
    public int getAnoPub(){
        return anoPub;
    }
    public void setEmprestado (boolean emprestado) {
        this.emprestado = emprestado;
    }
    public boolean getEmprestado(){
        return emprestado;
    }

    public String imprimir(){
        return titulo+"/"+autor+"("+anoPub+")  "+categoria+" POS:(E:"+numEstante+" P:"+numPrateleira+")"; 
    }
}