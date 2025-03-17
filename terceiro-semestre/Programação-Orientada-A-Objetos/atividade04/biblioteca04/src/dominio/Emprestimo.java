package dominio;

public class Emprestimo {
    private int codigo;
    private String dataEmprestimo;
    private String dataPrevista;
    private String dataDevolvida;
    private double multa;
    private String situacao;

    public Emprestimo(int codigo, String dataEmprestimo, String dataPrevista, String dataDevolvida, double multa, String situacao) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
        this.dataDevolvida = dataDevolvida;
        this.multa = multa;
        this.situacao = situacao;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public void setDataDevolvida(String dataDevolvida) {
        this.dataDevolvida = dataDevolvida;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
