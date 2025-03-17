public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;
    private String senha;

    public Paciente(String nome, String cpf, String telefone, String genero, int idade, String senha) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
        setSenha(senha);
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public String getSenha() { return "*************"; }

    public void setSenha(String senha) { this.senha = senha; }

    public void cadastrar(){}
    public void consultar(){}
    public void mostrar() {
        System.out.println("\n\nnome: "+ getNome());
        System.out.println("cpf: "+ getCpf());
        System.out.println("senha: "+ getSenha());
        System.out.println("genero: "+ getGenero());
        System.out.println("telefone: "+ getTelefone());
        System.out.println("idade: "+ getIdade());
    }
}
