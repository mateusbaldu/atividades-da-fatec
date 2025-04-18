package dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Professor extends Pessoa {
    protected Double salario;
    protected String especialidade;

    public Professor(String nome, String documento, String email, String telefone,
                     Double salario, String especialidade) {
        super(nome, documento, email, telefone);
        setSalario(salario);
        setEspecialidade(especialidade);
    }


    public Double getSalario() {
        return salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public Tarefa criarNovaTarefa(Aluno aluno, Professor professor,
                                  LocalDate data_envio, LocalDate data_conclusao, boolean foiConcluida) {
        return new Tarefa(aluno, professor, data_envio, data_conclusao, false);
    }

    public void registrarNotaDeAluno(Tarefa tarefa, double nota) {
        tarefa.setNota(nota);
        tarefa.setFoiConcluida(true);
        System.out.println("A nota foi registrada!!");
    }

    public void fornecerFeedback() {
        System.out.println("Insira texto");
    }

    public Aula marcarAula(Curso curso, Professor professor, String materia, LocalDate data, LocalTime hora) {
        return new Aula(curso, professor, materia, data, hora);
    }

    public void iniciarAula(Aula aula) {
        System.out.println("Aula iniciada as " + aula.getHora());
    }

    public void encerrarAula(){
        LocalTime agora = LocalTime.now();
        System.out.println("Aula encerrada as " + agora);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\n-----PROFESSOR-----");
        super.imprimirInformacoes();
        System.out.println("Salario: " + getSalario());
        System.out.println("Especialidade: " + getEspecialidade());
    }
}
