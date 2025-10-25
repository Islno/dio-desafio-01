import br.com.islno.desafio.dio.Curso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Curso curso01 = new Curso();
    curso01.setTitulo("Curso 1");
    curso01.setDescricao("sapatenis ao molho");


        System.out.printf(curso01.toString());
    }
}