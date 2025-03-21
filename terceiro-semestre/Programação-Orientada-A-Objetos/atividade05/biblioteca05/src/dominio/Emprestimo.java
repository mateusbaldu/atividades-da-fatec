package dominio;

import java.time.LocalDate;

public class Emprestimo {
    private int codigo;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolvida;
    private double multa;
    private String situacao;

    public Emprestimo(int codigo, LocalDate dataEmprestimo, LocalDate dataPrevista, LocalDate dataDevolvida, double multa, String situacao) throws Exception{
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

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public LocalDate getDataDevolvida() {
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

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        if (dataEmprestimo == null) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataEmprestimo = dataEmprestimo;
        }
    }

    public void setDataPrevista(LocalDate dataPrevista) throws Exception{
        if (dataPrevista == null) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataPrevista = dataPrevista;
        }
    }

    public void setDataDevolvida(LocalDate dataDevolvida) throws Exception{
        if (dataDevolvida == null) {
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
