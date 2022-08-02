import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras= new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2); 
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java DEveloper");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devMatheus.getNome() +" "+ devMatheus.getConteudoInscritos());
        devMatheus.progredir();
        System.out.println("-------------");
        System.out.println("Conteúdos Inscritos de " + devMatheus.getNome() +" "+ devMatheus.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de " + devMatheus.getNome() +" "+ devMatheus.getConteudoConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());


        System.out.println("#################");


        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devCarol.getNome() +" "+ devCarol.getConteudoInscritos());
        devCarol.progredir();
        System.out.println("-------------");
        System.out.println("Conteúdos Inscritos de " + devMatheus.getNome() +" "+ devMatheus.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de " + devCarol.getNome() +" "+ devCarol.getConteudoConcluidos());
        System.out.println("XP:" + devCarol.calcularTotalXp());

    }
}
