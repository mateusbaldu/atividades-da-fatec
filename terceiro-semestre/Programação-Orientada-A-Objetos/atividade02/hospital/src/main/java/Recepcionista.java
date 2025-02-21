public class Recepcionista {
    private String nome;
    private String telefone;
    private String cpf;
    private String senha;

    public Recepcionista(String nome, String telefone, String cpf, String senha) {
        setNome(nome);
        setTelefone(telefone);
        setCpf(cpf);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return "************";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("\n\nnome: "+ getNome());
        System.out.println("telefone: "+ getTelefone());
        System.out.println("cpf: "+ getCpf());
        System.out.println("senha: "+ getSenha());
    }
}
