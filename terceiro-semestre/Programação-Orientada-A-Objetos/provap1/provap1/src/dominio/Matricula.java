package dominio;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Administrador administrador;
    private Curso curso;
    private LocalDate data;
    private String status_atual;
    private boolean pagamentoEstaPendente;


    public Matricula(Aluno aluno, Administrador administrador, Curso curso,
                     LocalDate data, String status_atual, boolean pagamentoEstaPendente) {
        setAluno(aluno);
        setAdministrador(administrador);
        setCurso(curso);
        setData(data);
        setStatus_atual(status_atual);
        setPagamentoEstaPendente(pagamentoEstaPendente);
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

    public LocalDate getData() {
        return data;
    }

    public String getStatus_atual() {
        return status_atual;
    }

    public boolean isPagamentoEstaPendente() {
        if (pagamentoEstaPendente) {
            System.out.println("Pagamento esta pendente");
            return true;
        } else {
            System.out.println("Pagamento esta regular");
            return false;
        }
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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus_atual(String status_atual) {
        this.status_atual = status_atual;
    }

    public void setPagamentoEstaPendente(boolean pagamentoEstaPendente) {
        this.pagamentoEstaPendente = pagamentoEstaPendente;
    }


    public void imprimirInformacoes() {
        System.out.println("\n-----MATRICULA-----");
        System.out.println("Aluno: " + getAluno().getNome());
        System.out.println("Administrador: " + getAdministrador().getNome());
        System.out.println("Curso: " + getCurso().getNome());
        System.out.println("Data: " + getData());
        System.out.println("Status: " + getStatus_atual());
        System.out.println("Pagamento: " + isPagamentoEstaPendente());
    }
}
