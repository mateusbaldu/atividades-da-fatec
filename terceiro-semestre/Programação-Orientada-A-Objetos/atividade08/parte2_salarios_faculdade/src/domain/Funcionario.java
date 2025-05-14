package domain;

import interfaces.Colaborador;

public class Funcionario implements Colaborador {
    public int cargaHoraria;

    @Override
    public double obtemSalario() {
        return cargaHoraria * valorHora * 2;
    }

    @Override
    public void cargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
