package DAO;

import domain.CategoriaObra;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FuncionarioDAO {
    public void inserir(CategoriaObra.Funcionario funcionario) throws Exception {
        Connection conn = ConnectionTest.getConnection();

        String comandoSQL = """
            INSERT INTO funcionario (
                nome, documento, email, telefone,
                cidade, logradouro, cep, senha, cargo
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        PreparedStatement stmt = conn.prepareStatement(comandoSQL);
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getCpf().getValue());
        stmt.setString(3, funcionario.getEmail());
        stmt.setString(4, funcionario.getTelefone());
        stmt.setString(5, funcionario.getEndereco().getCidade());
        stmt.setString(6, funcionario.getEndereco().getLogradouro());
        stmt.setString(7, funcionario.getEndereco().getCep());
        stmt.setString(8, funcionario.getSenha());
        stmt.setString(9, funcionario.getCargo());

        stmt.execute();
        stmt.close();
        conn.close();
    }
}