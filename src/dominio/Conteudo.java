package dominio;

public abstract class Conteudo {
   
    protected static final double XP_PADRAO = 10d;
    private String título;
    private String descrição;
    
    public abstract double calcularXp();

    public String getTítulo(){
        return título;
    }

    public void setTítulo(String título){
        this.título = título;
    }

    public String getDescricao(){
        return descrição;
    }

    public void setDescrição(String descricao){
        this.descrição = descricao;
    }

}
