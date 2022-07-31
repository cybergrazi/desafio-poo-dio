import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGrazielle = new Dev();
        devGrazielle.setNome("Grazielle");
        devGrazielle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Grazielle" + devGrazielle.getConteudosInscritos());

        devGrazielle.progredir();
        devGrazielle.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Grazielle" + devGrazielle.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Grazielle" + devGrazielle.getConteudosConcluidos());
        System.out.println("XP: " + devGrazielle.calcularTotalXP());

        System.out.println("----------");

        Dev devCarolina = new Dev();
        devCarolina.setNome("Carolina");
        devCarolina.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Carolina" + devCarolina.getConteudosInscritos());

        devCarolina.progredir();
        devCarolina.progredir();
        devCarolina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carolina" + devCarolina.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Carolina" + devCarolina.getConteudosConcluidos());
        System.out.println("XP: " + devCarolina.calcularTotalXP());



    }
}
