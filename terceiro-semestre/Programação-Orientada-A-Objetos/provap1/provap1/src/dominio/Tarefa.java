package dominio;

import java.time.LocalDate;

public class Tarefa {
    private Aluno aluno;
    private Professor professor;
    private LocalDate data_envio;
    private LocalDate data_conclusao;
    private double nota;
    private boolean foiConcluida;


    public Tarefa(Aluno aluno, Professor professor, LocalDate data_envio,
                  LocalDate data_conclusao, boolean foiConcluida) {
        setAluno(aluno);
        setProfessor(professor);
        setData_envio(data_envio);
        setData_conclusao(data_conclusao);
        setFoiConcluida(foiConcluida);
    }


    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LocalDate getData_envio() {
        return data_envio;
    }

    public LocalDate getData_conclusao() {
        return data_conclusao;
    }

    public double getNota() {
        return nota;
    }

    public boolean isFoiConcluida() {
        if (foiConcluida) {
            System.out.println("A tarefa foi concluida");
            return true;
        } else {
            System.out.println("A tarefa nao foi concluida");
            return false;
        }
    }


    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setData_envio(LocalDate data_envio) {
        this.data_envio = data_envio;
    }

    public void setData_conclusao(LocalDate data_conclusao) {
        this.data_conclusao = data_conclusao;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }


    public void imprimirInformacoes() {
        System.out.println("\n-----TAREFA-----");
        System.out.println("Aluno: " + getAluno().getNome());
        System.out.println("Professor: " + getProfessor().getNome());
        System.out.println("Data de envio: " + getData_envio());
        System.out.println("Data de conclusao: " + getData_conclusao());
        System.out.println("Nota: " + getNota());
        System.out.println("Foi concluida?: " + isFoiConcluida());
    }
}
