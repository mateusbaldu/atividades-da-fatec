package dominio;

import java.time.LocalDate;



public class Aluno extends Pessoa {
    protected LocalDate data_de_nascimento;
    protected double percentual_frequencia;
    protected Curso curso;

    public Aluno(String nome, String documento, String email,
                 String telefone, LocalDate data_de_nascimento, double percentual_frequencia) {
        super(nome, documento, email, telefone);
        setData_de_nascimento(data_de_nascimento);
        setPercentual_frequencia(percentual_frequencia);
    }


    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }

    public double getPercentual_frequencia() {
        return percentual_frequencia;
    }

    public Curso getCurso() {
        return curso;
    }


    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public void setPercentual_frequencia(double percentual_frequencia) {
        this.percentual_frequencia = percentual_frequencia;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    public void selecionarCurso(Curso curso) {
        System.out.println("Selecionando curso: " + curso.getNome());
        setCurso(curso);
    }

    public Matricula realizarMatricula(Aluno aluno, Administrador administrador,
                                       Curso curso, LocalDate data, String status_atual, boolean pagamentoEstaPendente) {
        return new Matricula(aluno, administrador, curso, data, status_atual, true);
    }

    public void efetuarPagamento(Matricula matricula, boolean pagamentoEstaPendente) {
        if (!pagamentoEstaPendente) {
            matricula.setStatus_atual("Regularizada");
            System.out.println("Pagamento efetuado: " + matricula.getStatus_atual());
        } else {
            System.out.println("Pagamento não efetuado: " + matricula.getStatus_atual());
        }
    }

    public void entregarTarefa(Tarefa tarefa, boolean foiConcluida) {
        if (foiConcluida) {
            System.out.println("Tarefa entregue com sucesso!");
        } else {
            System.out.println("Tarefa não foi concluida!");
        }
    }

    public void realizarExameProficiencia() {
        System.out.println("Exame realizado com sucesso!");
    }

    public void acessarMateriais() {
        System.out.println("Materiais: insira texto");
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\n-----ALUNO-----");
        super.imprimirInformacoes();
        System.out.println("Data de nascimento: " + getData_de_nascimento());
        System.out.println("Percentual de frequencia do aluno: " + getPercentual_frequencia());
        System.out.println("Curso: " + curso.getNome());
    }
}