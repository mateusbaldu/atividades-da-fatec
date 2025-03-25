package dominio;

public abstract class Pessoa {
    protected int codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String documento;

    public Pessoa(int codigo, String nome, String email, String telefone, String documento) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setDocumento(documento);
    }

    public Pessoa() throws Exception{}


    public int getCodigo() {
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

    public String getDocumento() {
        return documento;
    }


    public void setCodigo(int codigo) throws Exception{
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

    public void setDocumento(String documento) throws Exception{
        this.documento = documento;
    }

    public abstract void mostrar();
}
