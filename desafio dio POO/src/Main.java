import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Python");
        curso1 .setDescricao("Descrição do curso Python");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso SQL");
        curso2.setDescricao("Descrição do curso SQL");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());


        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Analista de Dados");
        bootcamp.setDescricao("Descrição Bootcamp Analista de Dados");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudoInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Carlos:" + devCarlos.getConteudoConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudoInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Maria:" + devMaria.getConteudoConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }

}
