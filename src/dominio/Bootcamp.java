package dominio;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bootcamp {
    private String nome;
    private String descrição;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);
    private Set<Dev> davsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescrição(){
        return descrição;
    }

    public void setDescrição(String descrição){
        this.descrição = descrição;
    }

    public LocalDate getdatainicial(){
        return datainicial;
    }

    public LocalDate getdatafinal(){
        return datafinal;
    }

    public Set<Dev> getDevInscritos(){
        return davsInscritos;
    }

    public void setDevInscritos(Set<Dev> davsInscritos ){
         this.davsInscritos = davsInscritos;
    }

    public Set<Conteudo> getConteudo(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
   }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
        result = prime * result + ((datainicial == null) ? 0 : datainicial.hashCode());
        result = prime * result + ((davsInscritos == null) ? 0 : davsInscritos.hashCode());
        result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        if (datafinal == null) {
            if (other.datafinal != null)
                return false;
        } else if (!datafinal.equals(other.datafinal))
            return false;
        if (datainicial == null) {
            if (other.datainicial != null)
                return false;
        } else if (!datainicial.equals(other.datainicial))
            return false;
        if (davsInscritos == null) {
            if (other.davsInscritos != null)
                return false;
        } else if (!davsInscritos.equals(other.davsInscritos))
            return false;
        if (descrição == null) {
            if (other.descrição != null)
                return false;
        } else if (!descrição.equals(other.descrição))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

   

   


}
