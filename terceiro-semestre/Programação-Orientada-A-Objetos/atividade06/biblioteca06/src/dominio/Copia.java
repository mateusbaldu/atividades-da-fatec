package dominio;

public class Copia {
    private int codigo;
    private String situacao;
    private String descritivo;
    public Obra obra;

    public Copia(int codigo, String situacao, String descritivo, Obra obra) throws Exception{
        this.setCodigo(codigo);
        this.setSituacao(situacao);
        this.setDescritivo(descritivo);
        this.setObra(obra);
    }

    public Copia() {}


    public int getCodigo() {
        return codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public Obra getObra() {
        return obra;
    }


    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setSituacao(String situacao) throws Exception{
        if (situacao == null || situacao.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.situacao = situacao;
        }
    }

    public void setDescritivo(String descritivo) throws Exception{
        if (descritivo == null || descritivo.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void setObra(Obra obra) throws Exception{
        if (obra.getCodigo() <= 0) {
            throw new Exception("Erro! O codigo da obra não pode ser negativo ou zero");
        }
        this.obra = obra;
    }


    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\n-----Copia-----");
        System.out.println("\nNome da obra: " + obra.getTitulo());
        System.out.println("codigo: "+getCodigo());
        System.out.println("situação: "+getSituacao());
        System.out.println("descritivo: "+getDescritivo());
    }
}
