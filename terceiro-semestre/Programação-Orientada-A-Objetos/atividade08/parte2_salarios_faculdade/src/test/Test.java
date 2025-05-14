package test;

import domain.*;

public class Test {
    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario();
        estagiario.cargaHoraria(30);
        System.out.println(estagiario.obtemSalario());

        Funcionario funcionario = new Funcionario();
        funcionario.cargaHoraria(50);
        System.out.println(funcionario.obtemSalario());

        ProfessorGraduacao professorGraduacao = new ProfessorGraduacao(80, "Graduacao");
        System.out.println(professorGraduacao.obtemTitulacao());
        System.out.println(professorGraduacao.obtemSalario());

        ProfessorTecnico professorTecnico = new ProfessorTecnico(100, "Tecnico");
        System.out.println(professorTecnico.obtemTitulacao());
        System.out.println(professorTecnico.obtemSalario());
    }
}
