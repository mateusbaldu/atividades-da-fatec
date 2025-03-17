package dominio;

public class Leitor {
    private int codigo;
    private String nome;
    private String email;
    private double telefone;
    private String documento;

    public Leitor(int codigo, String email, String nome, double telefone, String documento) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
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

    public double getTelefone() {
        return telefone;
    }

    public String getDocumento() {
        return documento;
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

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("nome: "+getNome());
        System.out.println("email: "+getEmail());
        System.out.println("telefone: "+getTelefone());
        System.out.println("documento: "+getDocumento());
    }
}
