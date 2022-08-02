package dominio;

public class Curso extends Conteudo {

    public double calcularXp(){
        return XP_PADRAO*cargaHoraria;
    }

    private int cargaHoraria;

    public Curso(){

    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargahoraria(int cargaHorari){
        this.cargaHoraria = cargaHorari;
    }

    public String toString(){
        return "Curso{" +
           "título='" + getTítulo() + "\'" +
           ", descrição=" + getDescricao() + "\'" +
           ", cargaHoraria=" + cargaHoraria +
           '}';
    }
}
