package dominio;

import atributes.Cpf;
import atributes.Endereco;

public abstract class Pessoa {
    protected long codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    protected Cpf cpf;
    protected Endereco endereco;

    public Pessoa(long codigo, String nome, String email, String telefone, Cpf cpf, Endereco endereco) throws Exception{
        this.setEndereco(endereco);
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCpf(cpf);
    }

    public Pessoa() throws Exception{}


    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public void setCodigo(long codigo) throws Exception{
        this.codigo = codigo;
    }

    public void setNome(String nome) throws Exception{
        this.nome = nome;
    }

    public void setEmail(String email) throws Exception{
        this.email = email;
    }

    public void setTelefone(String telefone) throws Exception{
        this.telefone = telefone;
    }

    public void setCpf(Cpf cpf) throws Exception{
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public abstract void mostrar();
}
