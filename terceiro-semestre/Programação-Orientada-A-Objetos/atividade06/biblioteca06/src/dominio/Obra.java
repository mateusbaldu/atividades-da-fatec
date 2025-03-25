package dominio;

public class Obra {
    private int codigo;
    private String autores;
    private String titulo;
    private String editora;
    private int ano;
    private String descritivo;
    private int isbn;
    private CategoriaObra codigoCategoriaObra;

    public Obra(int codigo, String autores, String titulo,
                String editora, int ano, String descritivo,
                int isbn, CategoriaObra codigoCategoriaObra) throws Exception{
        this.setCodigo(codigo);
        this.setAutores(autores);
        this.setTitulo(titulo);
        this.setEditora(editora);
        this.setAno(ano);
        this.setDescritivo(descritivo);
        this.setIsbn(isbn);
        this.setCodigoCategoriaObra(codigoCategoriaObra);
    }

    public Obra(){}


    public int getCodigo() {
        return codigo;
    }

    public String getAutores() {
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public int getIsbn() {
        return isbn;
    }

    public CategoriaObra getCodigoCategoriaObra() {
        return codigoCategoriaObra;
    }


    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setAutores(String autores) throws Exception{
        if (autores == null || autores.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        }
        this.autores = autores;
    }

    public void setTitulo(String titulo) throws Exception{
        if (titulo == null || titulo.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.titulo = titulo;
        }
    }

    public void setEditora(String editora) throws Exception{
        if (editora == null || editora.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.editora = editora;
        }
    }

    public void setAno(int ano) throws Exception{
        if (ano <= 0) {
            throw new Exception("Erro! O ano não pode ser zero ou negativo");
        } else {
            this.ano = ano;
        }
    }

    public void setDescritivo(String descritivo) throws Exception{
        if (editora == null || editora.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void setIsbn(int isbn) throws Exception{
        if (isbn <= 0) {
            throw new Exception("Erro! O isbn não pode ser zero ou negativo");
        } else {
            this.isbn = isbn;
        }
    }

    public void setCodigoCategoriaObra(CategoriaObra codigoCategoriaObra) throws Exception{
        if (codigoCategoriaObra.getCodigo() <= 0) {
            throw new Exception("Erro! O código da categoria da obra não pode ser negativo ou zero");
        }else {
            this.codigoCategoriaObra = codigoCategoriaObra;
        }
    }


    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("-----Obra-----");
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("autores:" +getAutores());
        System.out.println("titulo: "+getTitulo());
        System.out.println("editora: "+getEditora());
        System.out.println("ano: "+getAno());
        System.out.println("descritivo: "+getDescritivo());
        System.out.println("ISBN: "+getIsbn());
    }
}
