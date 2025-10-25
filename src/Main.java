import br.com.islno.desafio.dio.Curso;
import br.com.islno.desafio.dio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso01 = new Curso();
    curso01.setTitulo("Curso 1");
    curso01.setDescricao("sapatenis ao molho");

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria 1");
        mentoria01.setDescricao("Descrição da mentoria");

        System.out.println(curso01);
        System.out.println(mentoria01);
    }
}