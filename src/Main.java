import br.com.islno.desafio.dio.Bootcamp;
import br.com.islno.desafio.dio.Curso;
import br.com.islno.desafio.dio.Dev;
import br.com.islno.desafio.dio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Introdução ao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Orientação a Objetos");
        curso2.setDescricao("Conceitos de OO com Java");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Sessão de dúvidas e boas práticas");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Treinamento completo de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIslno = new Dev();
        devIslno.setNome("Islno");
        devIslno.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos Islno: " + devIslno.getConteudosInscritos());
        devIslno.progredir();
        devIslno.progredir();
        System.out.println("Concluídos Islno: " + devIslno.getConteudosConcluidos());
        System.out.println("XP Islno: " + devIslno.calcularXP());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria: " + devMaria.calcularXP());

    }
}