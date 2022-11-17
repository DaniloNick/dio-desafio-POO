import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargaHoraria(4);



    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.inscreverBootcamp(bootcamp);
        System.out.println("COnteudos Inscritos Danilo" + devDanilo.getConteudosIncritos());
        devDanilo.progredir();
        System.out.println("________");
        System.out.println("COnteudos Inscritos Danilo" + devDanilo.getConteudosIncritos());
        System.out.println("COnteudos Concluidos Danilo" + devDanilo.getConteudosConcluidos());
        System.out.println("XP:" + devDanilo.calcularTotalXp());

        System.out.println("_______________________");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("COnteudos Inscritos Joao" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        System.out.println("________");
        System.out.println("COnteudos Inscritos Joao" + devJoao.getConteudosIncritos());
        System.out.println("COnteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}