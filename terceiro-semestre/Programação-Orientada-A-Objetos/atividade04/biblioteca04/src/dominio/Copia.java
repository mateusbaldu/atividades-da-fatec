package dominio;

public class Copia {
    private int codigo;
    private String situacao;
    private String descritivo;

    public Copia(int codigo, String situacao, String descritivo) throws Exception{
        this.setCodigo(codigo);
        this.setSituacao(situacao);
        this.setDescritivo(descritivo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new IllegalArgumentException("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setSituacao(String situacao) throws Exception{
        if (situacao == null || situacao.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.situacao = situacao;
        }
    }

    public void setDescritivo(String descritivo) throws Exception{
        if (descritivo == null || descritivo.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("situação: "+getSituacao());
        System.out.println("descritivo: "+getDescritivo());
    }
}
