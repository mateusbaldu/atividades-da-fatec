package dominio;

public abstract class Pessoa {
    protected String nome;
    protected String documento;
    protected String email;
    protected String telefone;

    public Pessoa(String nome, String documento, String email, String telefone) {
        setNome(nome);
        setDocumento(documento);
        setEmail(email);
        setTelefone(telefone);
    }

    public Pessoa() {
    }


    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void imprimirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Documento: " + getDocumento());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }
}
