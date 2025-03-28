package dominio;

import java.time.LocalDate;

public abstract class Usuario {
    protected String numUsuario;
    protected String senha;
    protected String statusLogin;
    protected LocalDate dataRegistro;

    public Usuario(String numUsuario, String senha, String statusLogin,
                   LocalDate dataRegistro) throws Exception {
        setNumUsuario(numUsuario);
        setSenha(senha);
        setStatusLogin(statusLogin);
        setDataRegistro(dataRegistro);
    }
    public Usuario() {
    }

    public String getNumUsuario() {
        return numUsuario;
    }

    public String getSenha() {
        return "*************";
    }

    public String getStatusLogin() {
        return statusLogin;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setNumUsuario(String numUsuario) throws Exception{
        if (numUsuario == null || numUsuario.isEmpty()) {
            throw new Exception("Erro! O número do usuário não pode ser vazio");
        }
        this.numUsuario = numUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setStatusLogin(String statusLogin) {
        this.statusLogin = statusLogin;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }


    public abstract boolean verificarLogin();
}
