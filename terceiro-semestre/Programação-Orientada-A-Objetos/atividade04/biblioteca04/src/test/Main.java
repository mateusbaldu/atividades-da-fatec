package test;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        CategoriaObra categoriaObra = new CategoriaObra(1234, "numerico");
        categoriaObra.mostrar();

        Obra obraUm = new Obra(333, "Mauricio de Souza","Turma da Monica","Panini",2012,"Turma da Monica", 2012557);
        obraUm.mostrar();

        Copia turmaDaMonica = new Copia(3335,"Reservada","Insira texto");
        turmaDaMonica.mostrar();

        Leitor Mateus = new Leitor(20240533,"Mateus Balduino","mateusficticio@email.com",912344321,"142.123.198-00");
        Mateus.mostrar();

        Reserva turmaDaMonicaUm = new Reserva(3335142,"21/02/2024","21/03/2024","Insira texto");
        turmaDaMonicaUm.mostrar();

        Emprestimo emprestimo = new Emprestimo(3335142, "13/05/2025", "13/06/2025", "22/06/2025", 18.0, "INSIRA TEXTO");
        emprestimo.mostrar();

        Funcionario miguel = new Funcionario(202502, "Miguel Silva", "miguelficticio@email.com", 912345678, "123.456.789-00", "desenvolvedor");
        miguel.mostrar();
    }
}