package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aula {
    private Curso curso;
    private Professor professor;
    private String materia;
    private LocalDate data;
    private LocalTime hora;

    public Aula(Curso curso, Professor professor, String materia,
                LocalDate data, LocalTime hora) {
        setCurso(curso);
        setProfessor(professor);
        setMateria(materia);
        setData(data);
        setHora(hora);
    }


    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getMateria() {
        return materia;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }


    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }


    public void imprimirInformacoes() {
        System.out.println("\n-----AULA-----");
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Materia: " + materia);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }
}
