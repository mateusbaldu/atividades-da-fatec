package dominio;

public abstract class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario(String nome, String telefone, String senha) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setSenha(senha);
    }

    public Funcionario() {
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return "***********";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void mostrar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Senha: " + getSenha());
    }

    public abstract void acessar();
}
