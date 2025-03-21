package dominio;

public class Funcionario {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private String cargo;

    public Funcionario(int codigo, String email, String nome, String telefone, String documento, String cargo) throws Exception{
        this.setCodigo(codigo);
        this.setEmail(email);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setDocumento(documento);
        this.setCargo(cargo);
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

    public String getTelefone() {
        return telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new IllegalArgumentException("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) throws Exception{
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public void setEmail(String email) throws Exception{
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.email = email;
        }
    }

    public void setTelefone(String telefone) throws Exception{
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.telefone = telefone;
        }
    }

    public void setDocumento(String documento) throws Exception{
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.documento = documento;
        }
    }

    public void setCargo(String cargo) throws Exception{
        if (cargo == null || cargo.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.cargo = cargo;
        }
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
