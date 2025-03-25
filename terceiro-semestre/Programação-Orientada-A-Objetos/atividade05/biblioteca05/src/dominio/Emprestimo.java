package dominio;

import java.time.LocalDate;

public class Emprestimo {
    private int codigo;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolvida;
    private double multa;
    private String situacao;
    private Copia codigoCopia;
    private Leitor codigoLeitor;
    private Funcionario codigoFuncionario;

    public Emprestimo(int codigo, LocalDate dataEmprestimo, LocalDate dataPrevista,
                      LocalDate dataDevolvida, double multa, String situacao,
                      Copia codigoCopia, Leitor codigoLeitor, Funcionario codigoFuncionario) throws Exception{
        this.setCodigo(codigo);
        this.setDataEmprestimo(dataEmprestimo);
        this.setDataPrevista(dataPrevista);
        this.setDataDevolvida(dataDevolvida);
        this.setMulta(multa);
        this.setSituacao(situacao);
        this.setCodigoCopia(codigoCopia);
        this.setCodigoLeitor(codigoLeitor);
        this.setCodigoFuncionario(codigoFuncionario);
    }

    public Emprestimo(){}

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

    public Funcionario getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public Leitor getCodigoLeitor() {
        return codigoLeitor;
    }

    public Copia getCodigoCopia() {
        return codigoCopia;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) throws Exception{
        if (dataEmprestimo == null) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataEmprestimo = dataEmprestimo;
        }
    }

    public void setDataPrevista(LocalDate dataPrevista) throws Exception{
        if (dataPrevista == null) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataPrevista = dataPrevista;
        }
    }

    public void setDataDevolvida(LocalDate dataDevolvida) throws Exception{
        if (dataDevolvida == null) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataDevolvida = dataDevolvida;
        }
    }

    public void setMulta(double multa) throws Exception{
        if (multa < 0) {
            throw new Exception("Erro! O valor da multa não pode ser negativo");
        } else {
            this.multa = multa;
        }
    }

    public void setSituacao(String situacao) throws Exception{
        if (situacao == null || situacao.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.situacao = situacao;
        }
    }

    public void setCodigoCopia(Copia codigoCopia) throws Exception{
        if (codigoCopia.getCodigo() <= 0) {
            throw new Exception("Erro! O código da cópia não pode ser negativo ou zero");
        } else {
            this.codigoCopia = codigoCopia;
        }
    }

    public void setCodigoLeitor(Leitor codigoLeitor) throws Exception{
        if (codigoLeitor.getCodigo() <= 0) {
            throw new Exception("Erro! O código do leitor não pode ser negativo ou zero");
        } else {
            this.codigoLeitor = codigoLeitor;
        }
    }

    public void setCodigoFuncionario(Funcionario codigoFuncionario) throws Exception{
        if (codigoFuncionario.getCodigo() <= 0) {
            throw new Exception("Erro! O código do funcionário não pode ser negativo ou zero");
        } else {
            this.codigoFuncionario = codigoFuncionario;
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
