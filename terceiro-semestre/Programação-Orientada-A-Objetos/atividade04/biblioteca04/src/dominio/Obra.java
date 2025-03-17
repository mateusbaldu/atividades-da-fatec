package dominio;

public class Obra {
    private int codigo;
    private String autores;
    private String titulo;
    private String editora;
    private int ano;
    private String descritivo;
    private int isbn;

    public Obra(int codigo, String autores, String titulo, String editora, int ano, String descritivo, int isbn) {
        this.codigo = codigo;
        this.autores = autores;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.descritivo = descritivo;
        this.isbn = isbn;
    }

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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("autores:" +getAutores());
        System.out.println("titulo: "+getTitulo());
        System.out.println("editora: "+getEditora());
        System.out.println("ano: "+getAno());
        System.out.println("descritivo: "+getDescritivo());
        System.out.println("ISBN: "+getIsbn());
    }
}
