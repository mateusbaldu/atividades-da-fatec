package domain;

import interfaces.*;

public class ProfessorTecnico implements Professor {
    public double adicional;
    public int cargaHoraria;
    public String titulacao;

    public ProfessorTecnico(int cargaHoraria, String titulacao) {
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String obtemTitulacao() {
        if (titulacao.equals("Tecnico")) {
            this.adicional = 1.0;
        }
        if (titulacao.equals("Graduacao")) {
            this.adicional = 1.0;
        }
        if (titulacao.equals("Mestrado")) {
            this.adicional = 1.2;
        }
        if (titulacao.equals("Doutorado")) {
            this.adicional = 1.5;
        }
        return this.titulacao;
    }

    public double obtemSalario() {
        return this.cargaHoraria * this.valorHora * 3 * this.adicional;
    }
}
