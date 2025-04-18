package test;

import dominio.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Curso cursoUm = new Curso("Python", "Curso de Python", "Portugues",
                "Intermediário", 200);

        Administrador administrador = new Administrador("Norton Barros", "000.111.222.333-44", "nortonExistente@email.com",
                "11944445555", "norton123");

        Aluno aluno = new Aluno("Mateus Balduino", "123.456.789-00", "mateusficticio@email.com",
                "1191234-5678", LocalDate.of(2000,9,27), 80.5);
        aluno.selecionarCurso(cursoUm);

        Matricula matricula = (aluno.realizarMatricula(aluno, administrador, cursoUm, LocalDate.of(2025,4,17),
                "Irregular", true));

        Professor professor = new Professor("Miguel Henrique", "333.666.999-22", "miguelficticio@email.com", "11977778888",
                34000.0, "SQL");

        Tarefa tarefa = (professor.criarNovaTarefa(aluno, professor, LocalDate.of(2025,4,17),
                LocalDate.of(2025,5,17), false));

        Certificado certificado = new Certificado(aluno, administrador, cursoUm, LocalDate.now());

        aluno.acessarMateriais();
        aluno.efetuarPagamento(matricula, false);
        aluno.entregarTarefa(tarefa, true);
        aluno.realizarExameProficiencia();

        administrador.notificarPagamentoPendente(matricula, false);
        administrador.gerenciarSalario(professor);
        administrador.gerarRelatorioMatricula(matricula, aluno);

        professor.registrarNotaDeAluno(tarefa, 9.5);
        Aula aula = (professor.marcarAula(cursoUm, professor, "POO", LocalDate.now(), LocalTime.now()));
        professor.iniciarAula(aula);
        professor.encerrarAula();

        administrador.imprimirInformacoes();
        professor.imprimirInformacoes();
        aluno.imprimirInformacoes();
        aula.imprimirInformacoes();
        tarefa.imprimirInformacoes();
        matricula.imprimirInformacoes();
        certificado.imprimirInformacoes();
    }
}