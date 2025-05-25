package domain;

public abstract class Categoria {
    protected int codigo;
    protected String tipo;

    public Categoria(int codigo, String tipo) throws Exception{
        this.setCodigo(codigo);
        this.setTipo(tipo);
    }

    public Categoria(int codigo) {
        this.codigo = codigo;
    }

    public Categoria(String tipo) {
        this.tipo = tipo;
    }

    public Categoria() throws Exception{
    }


    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }


    public void setCodigo(int codigo) throws Exception{
        this.codigo = codigo;
    }

    public void setTipo(String tipo) throws Exception {
        this.tipo = tipo;
    }

    public abstract void mostrar();
}