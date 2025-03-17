package dominio;

public class Funcionario {
    private int codigo;
    private String nome;
    private String email;
    private long telefone;
    private String documento;
    private String cargo;

    public Funcionario(int codigo, String email, String nome, long telefone, String documento, String cargo) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void carregar() {}
    public void guardar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("nome: "+getNome());
        System.out.println("email: "+getEmail());
        System.out.println("telefone: "+getTelefone());
        System.out.println("documento: "+getDocumento());
        System.out.println("cargo: "+getCargo());
    }
}
