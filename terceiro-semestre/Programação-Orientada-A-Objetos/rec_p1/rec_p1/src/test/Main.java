package test;

import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente clienteUm = new Cliente("450", "Luiz123", "Deslogado", LocalDate.of(2025,3,25),
                    "Luiz Felipe Almeida", "Rua Ficticia, Num 012", "luizfelipeficticio@email.com",
                    "5555.4444.3333.2222", "Insira texto", 200.5);

            Pedido pedidoClienteUm = new Pedido(22, clienteUm ,LocalDate.of(2025, 3,27), "Insira texto",
                    "Sendo embalado", "37");

            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(3,55,2,
                    LocalDate.of(2025,3,26), clienteUm);

            InformacoesDeEnvio informacoesDeEnvio = new InformacoesDeEnvio(32, "Jadlog", 23.5,5,
                    pedidoClienteUm);

            DetalhesDoPedido detalhesDoPedido = new DetalhesDoPedido(pedidoClienteUm, 55, "Abacate",
                    200, 2, 400);

            Admin admin = new Admin("888", "AdminAdmin123", "Deslogado", LocalDate.of(2025,2,1),
                    "Mateus", "mateusadmin@email.com");

            clienteUm.imprimir();
            pedidoClienteUm.imprimir();
            carrinhoDeCompras.imprimir();
            informacoesDeEnvio.imprimir();
            detalhesDoPedido.imprimir();
            admin.imprimir();

            System.out.println("Algoritmo encerrado!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nFinalizado [x]");
        }
    }
}