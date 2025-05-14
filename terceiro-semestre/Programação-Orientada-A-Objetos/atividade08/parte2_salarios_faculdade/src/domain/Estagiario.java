package domain;

import interfaces.Colaborador;

public class Estagiario implements Colaborador {
    public int cargaHoraria;

    @Override
    public double obtemSalario() {
        return cargaHoraria * valorHora;
    }

    @Override
    public void cargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
