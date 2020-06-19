public class Livro_Isidro {
    private String  titulo;
    private String  autor;
    private int     ano;
    private String  categoria;
    private int     posEstante;
    private int     posPrateleira;
    private boolean emprestado;

    public Livro_Isidro (String ti, String au, int an, String ca, int pe, int pp, boolean em){
        this.titulo        = ti;
        this.autor         = au;
        this.ano           = an;
        this.categoria     = ca;
        this.posEstante    = pe;
        this.posPrateleira = pp;
        this.emprestado    = em;
    }

    // gets + sets//

    public String getTitulo(){
        return this.titulo;
    }
    //...
    public boolean isEmprestado(){ // o "boolean" foge ao padrão de GET, sendo usado como IS
        return this.emprestado;
    }

    public void emprestar(){
        emprestado = true;
    }
    public void devolver(){
        emprestado = false;
    }

    public String imprimirInfo(){
        return titulo+"/"+autor+"("+ano+")  "+categoria+" POS:(E:"+posEstante+" P:"+posPrateleira+")"; 
    }
}