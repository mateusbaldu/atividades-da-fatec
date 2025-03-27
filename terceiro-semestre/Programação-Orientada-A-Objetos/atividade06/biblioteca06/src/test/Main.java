package test;

import dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            CategoriaObra categoriaObraUm = new CategoriaObra(1, "Romance");
            categoriaObraUm.mostrar();

            CategoriaObra categoriaObraDois = new CategoriaObra(2,"Comédia");
            categoriaObraDois.mostrar();

            CategoriaLeitor categoriaLeitorUm = new CategoriaLeitor(3, "Estudante");
            categoriaLeitorUm.mostrar();

            Funcionario Miguel = new Funcionario(202502, "Miguel Silva", "miguelficticio@email.com",
                    "912345678", "123.456.789-00", "desenvolvedor");
            Miguel.mostrar();

            Obra obraUm = new Obra(333, "Mauricio de Souza","Turma da Monica","Panini",
                    2012,"Turma da Monica", "2012557000123", categoriaObraDois);
            obraUm.mostrar();

            Copia turmaDaMonica = new Copia(3335,"Reservada","Insira texto", obraUm);
            turmaDaMonica.mostrar();

            Leitor Mateus = new Leitor(20240533,"Mateus Balduino","mateusficticio@email.com",
                    "912344321","142.123.198-00", categoriaLeitorUm);
            Mateus.mostrar();

            Reserva turmaDaMonicaUm = new Reserva(3335142,LocalDate.of(2025,2,21),
                    LocalDate.of(2025,3,21),"Insira texto", Mateus, obraUm);
            turmaDaMonicaUm.mostrar();

            Emprestimo emprestimo = new Emprestimo(3335142, LocalDate.of(2025,5,13),
                    LocalDate.of(2025,6,13), LocalDate.of(2025,6,22),
                    18.0, "INSIRA TEXTO", turmaDaMonica, Mateus, Miguel);
            emprestimo.mostrar();

            System.out.println("\nAlgoritmo encerrado!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nFinalizado [x]");
        }
    }
}