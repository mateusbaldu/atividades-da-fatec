package dominio;

public class CategoriaObra {
    private int codigo;
    private String tipo;

    public CategoriaObra(int codigo, String tipo) throws Exception{
        this.setCodigo(codigo);
        this.setTipo(tipo);
    }

    public CategoriaObra(){}

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        } else {
            this.codigo = codigo;
        }
    }

    public void setTipo(String tipo) throws Exception{
        if (tipo == null || tipo.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.tipo = tipo;
        }
    }

    public void guardar() {}
    public void carregar() {}

    public void mostrar() {
        System.out.println("\ncodigo: " +getCodigo());
        System.out.println("tipo: " +getTipo());
    }
}
