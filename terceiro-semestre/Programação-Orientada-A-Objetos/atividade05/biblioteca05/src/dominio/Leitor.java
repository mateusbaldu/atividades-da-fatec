package dominio;

public class Leitor {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private CategoriaLeitor categoriaLeitor;

    public Leitor(int codigo, String nome, String email, String telefone,
                  String documento, CategoriaLeitor categoriaLeitor) throws Exception{
        this.setCodigo(codigo);
        this.setEmail(email);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setDocumento(documento);
        this.setCategoriaLeitor(categoriaLeitor);
    }

    public Leitor(){}

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

    public CategoriaLeitor getCategoriaLeitor() {
        return categoriaLeitor;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) throws Exception{
        if (nome == null || nome.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public void setEmail(String email) throws Exception{
        if (email == null || email.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.email = email;
        }
    }

    public void setTelefone(String telefone) throws Exception{
        if (telefone == null || telefone.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.telefone = telefone;
        }
    }

    public void setDocumento(String documento) throws Exception{
        if (documento == null || documento.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.documento = documento;
        }
    }

    public void setCategoriaLeitor(CategoriaLeitor categoriaLeitor) throws Exception{
        if (categoriaLeitor == null) {
            throw new Exception("Erro! A categoria do leitor não pode ser vazio ou zero");
        } else {
            this.categoriaLeitor = categoriaLeitor;
        }
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
