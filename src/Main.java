import java.time.LocalDate;

import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
       Cursos cursoJava = new Cursos();
       Cursos cursoPython = new Cursos();

       String titulo = "Java";
       String descricao = "Orientacao a objetos";
       int cargaHoraria = 150;

       cursoJava.setTitulo(titulo);
       cursoJava.setDescricao(descricao);
       cursoJava.setCargaHoraria(cargaHoraria);
        
       cursoPython.setTitulo("Python");
       cursoPython.setDescricao("Machine Learn");
       cursoPython.setCargaHoraria(60);

       System.out.println(cursoJava.toString());
       System.out.println(cursoPython.toString());


       Mentoria mentoria = new Mentoria();

       mentoria.setTitulo("Mentoria de Java");
       mentoria.setDescricao("Abtraindo bootcamp com orientação a objetos");
       mentoria.setDate(LocalDate.now());

       System.out.println(mentoria.toString());
    }
}
