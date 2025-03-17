package dominio;

public class Copia {
    private int codigo;
    private String situação;
    private String descritivo;

    public Copia(int codigo, String situação, String descritivo) {
        this.setCodigo(codigo);
        this.setSituação(situação);
        this.setDescritivo(descritivo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSituação() {
        return situação;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("situação: "+getSituação());
        System.out.println("descritivo: "+getDescritivo());
    }
}
