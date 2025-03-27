package test;

import dominio.*;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Paciente jose = new Paciente("jose da silva","434343","6842184","masculino",32);

        Medico lucas = new Medico("Lucas Vinicius", "654651654", "684216548", "cardiologista", "8941");

        Recepcionista bastos = new Recepcionista("Guilherme Bastos", "12312312398", "68945648974", "1234");

        Receita receita = new Receita(LocalDate.of(2025,6,28), "Novalgina");

        Exame exame = new Exame(LocalDate.of(2025,6,28), "Insira texto");

        Consulta consulta = new Consulta(LocalDate.of(2025,6,22), "20:00", lucas, jose, "Dores de cabeça fortes", "Sem histórico", receita, exame);


        jose.mostrar();
        lucas.mostrar();
        bastos.mostrar();
        receita.mostrar();
        exame.mostrar();
        consulta.mostrar();
    }

}
