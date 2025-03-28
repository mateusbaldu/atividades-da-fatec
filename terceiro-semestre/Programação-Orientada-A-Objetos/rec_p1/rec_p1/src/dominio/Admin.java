package dominio;

import java.time.LocalDate;

public class Admin extends Usuario{
    private String nomeAdmin;
    private String email;

    public Admin(String numUsuario, String senha, String statusLogin, LocalDate dataRegistro,
                 String nomeAdmin, String email) throws Exception {
        super(numUsuario, senha, statusLogin, dataRegistro);
        setNomeAdmin(nomeAdmin);
        setEmail(email);
    }


    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public String getEmail() {
        return email;
    }


    public void setNomeAdmin(String nomeAdmin) throws Exception{
        if (nomeAdmin == null || nomeAdmin.isEmpty()) {
            throw new Exception("Erro! o nome do admin não pode ser vazio");
        } else {
            this.nomeAdmin = nomeAdmin;
        }
    }

    public void setEmail(String email) throws Exception {
        if (email.length() <= 5 || email.isEmpty() || !email.contains("@")) {
            throw new Exception("Erro! O email foi informado incorretamente");
        } else {
            this.email = email;
        }
    }


    public void imprimir() {
        System.out.println(  "\n-------------------" +
                "\nADMIN: " +
                "\nnomeAdmin= '" + nomeAdmin + '\'' +
                "\nemail= '" + email + '\'' +
                "\nnumUsuario= '" + numUsuario + '\'' +
                "\nsenha= '" + "*******************" + '\'' +
                "\nstatusLogin= '" + statusLogin + '\'' +
                "\ndataRegistro= " + dataRegistro);
    }

    @Override
    public boolean verificarLogin() {
        return false;
    }

    public boolean atualizarCatalogo(){
        return false;
    }
}
