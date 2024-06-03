import java.time.LocalDate;

import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JavaScript");
        cursoJs.setDescricao("Descrição do curso js");
        cursoJs.setCargaHoraria(5);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição da mentoria java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoJs);
        System.out.println(mentoriaJava);
    }
}
