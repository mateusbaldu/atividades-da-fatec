public class CategoriaObra {
    private int codigo;
    private String tipo;

    public CategoriaObra(int codigo, String tipo) {
        this.setCodigo(codigo);
        this.setTipo(tipo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void guardar() {}
    public void carregar() {}

    public void mostrar() {
        System.out.println("\ncodigo: " +getCodigo());
        System.out.println("tipo: " +getTipo());
    }
}
