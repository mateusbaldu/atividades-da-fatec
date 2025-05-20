package DAO;

import domain.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LeitorDAO {
    public void inserir(Leitor leitor) throws Exception {
        Connection conn = ConnectionTest.getConnection();

        String comandoSql = """
            INSERT INTO leitor (
                nome, documento, email, telefone,
                cidade, logradouro, cep, senha, categorialeitor
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        PreparedStatement stmt = conn.prepareStatement(comandoSql);
        stmt.setString(1, leitor.getNome());
        stmt.setString(2, leitor.getCpf().getValue());
        stmt.setString(3, leitor.getEmail());
        stmt.setString(4, leitor.getTelefone());
        stmt.setString(5, leitor.getEndereco().getCidade());
        stmt.setString(6, leitor.getEndereco().getLogradouro());
        stmt.setString(7, leitor.getEndereco().getCep());
        stmt.setString(8, leitor.getSenha());
        stmt.setInt(9, leitor.getCategoriaLeitor().getCodigo());

        stmt.execute();
        stmt.close();
        conn.close();
    }
}
