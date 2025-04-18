package dominio;

import java.time.LocalDate;

public class Certificado {
    private Aluno aluno;
    private Administrador administrador;
    private Curso curso;
    private LocalDate data_emissao;

    public Certificado(Aluno aluno, Administrador administrador, Curso curso, LocalDate data_emissao) {
        setAluno(aluno);
        setAdministrador(administrador);
        setCurso(curso);
        setData_emissao(data_emissao);
    }


    public Aluno getAluno() {
        return aluno;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getData_emissao() {
        return data_emissao;
    }


    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setData_emissao(LocalDate data_emissao) {
        this.data_emissao = data_emissao;
    }


    public void imprimirInformacoes(){
        System.out.println("\n-----CERTIFICADO-----");
        System.out.println("Aluno: " + getAluno().getNome());
        System.out.println("Administrador: " + getAdministrador().getNome());
        System.out.println("Curso: " + getCurso().getNome());
        System.out.println("Data de emissao: " + getData_emissao());
    }
}
