package test;

import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            InformacoesDeEnvio informacoesDeEnvio = new InformacoesDeEnvio(32, "Jadlog", 23.5,5,
                    pedidoClienteUm);
            Pedido pedidoClienteUm = new Pedido(22,LocalDate.of(2025, 3,26), "Insira texto",
                    "Sendo embalado", );
            Cliente clienteUm = new Cliente("450", "Luiz123", "Deslogado", LocalDate.of(2025,3,26),
                    "Luiz Felipe Almeida", "Rua Ficticia, Num 012", "luizfelipeficticio@email.com",
                    "5555.4444.3333.2222", "Insira texto", 200.5, pedidoClienteUm);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finalizado [x]");
        }
    }
}