package dominio;

public class Emprestimo {
    private int codigo;
    private String dataEmprestimo;
    private String dataPrevista;
    private String dataDevolvida;
    private double multa;
    private String situacao;

    public Emprestimo(int codigo, String dataEmprestimo, String dataPrevista, String dataDevolvida, double multa, String situacao) throws Exception{
        this.setCodigo(codigo);
        this.setDataEmprestimo(dataEmprestimo);
        this.setDataPrevista(dataPrevista);
        this.setDataDevolvida(dataDevolvida);
        this.setMulta(multa);
        this.setSituacao(situacao);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public String getDataDevolvida() {
        return dataDevolvida;
    }

    public double getMulta() {
        return multa;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new IllegalArgumentException("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        if (dataEmprestimo == null || dataEmprestimo.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataEmprestimo = dataEmprestimo;
        }
    }

    public void setDataPrevista(String dataPrevista) throws Exception{
        if (dataPrevista == null || dataPrevista.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataPrevista = dataPrevista;
        }
    }

    public void setDataDevolvida(String dataDevolvida) throws Exception{
        if (dataDevolvida == null || dataDevolvida.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataDevolvida = dataDevolvida;
        }
    }

    public void setMulta(double multa) throws Exception{
        if (multa < 0) {
            throw new IllegalArgumentException("Erro! O valor da multa não pode ser negativo");
        } else {
            this.multa = multa;
        }
    }

    public void setSituacao(String situacao) {
        if (situacao == null || situacao.isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.situacao = situacao;
        }
    }

    public void cadastrar() {}
    public void carregar() {}
    public void devolver() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("data do empréstimo: "+getDataEmprestimo());
        System.out.println("data prevista para devolução: "+getDataPrevista());
        System.out.println("data da devolução: "+getDataDevolvida());
        System.out.println("multa: "+getMulta());
        System.out.println("situação: "+getSituacao());
    }
}
