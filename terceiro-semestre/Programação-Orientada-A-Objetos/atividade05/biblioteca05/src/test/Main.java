package test;

import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            CategoriaObra categoriaObra = new CategoriaObra(1, "Romance");
            categoriaObra.mostrar();

            Obra obraUm = new Obra(333, "Mauricio de Souza","Turma da Monica","Panini",2012,"Turma da Monica", 2012557);
            obraUm.mostrar();

            Copia turmaDaMonica = new Copia(3335,"Reservada","Insira texto");
            turmaDaMonica.mostrar();

            Leitor Mateus = new Leitor(20240533,"Mateus Balduino","mateusficticio@email.com","912344321","142.123.198-00");
            Mateus.mostrar();

            Reserva turmaDaMonicaUm = new Reserva(3335142,LocalDate.of(2025,2,21),LocalDate.of(2025,3,21),"Insira texto");
            turmaDaMonicaUm.mostrar();

            Emprestimo emprestimo = new Emprestimo(3335142, LocalDate.of(2025,5,13), LocalDate.of(2025,6,13), LocalDate.of(2025,6,22), 18.0, "INSIRA TEXTO");
            emprestimo.mostrar();

            Funcionario miguel = new Funcionario(202502, "Miguel Silva", "miguelficticio@email.com", "912345678", "123.456.789-00", "desenvolvedor");
            miguel.mostrar();

            System.out.println();
            System.out.println("Algoritmo encerrado!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println();
            System.out.println("Finalizado [x]");
        }
    }
}