package dominio;

import java.time.LocalDate;

public class Reserva {
    private int codigo;
    private LocalDate dataReserva;
    private LocalDate dataPrevista;
    private String situacao;
    private Leitor codigoLeitor;
    private Obra codigoObra;

    public Reserva(int codigo, LocalDate dataReserva, LocalDate dataPrevista,
                   String situacao, Leitor codigoLeitor, Obra codigoObra) throws Exception{
        this.setCodigo(codigo);
        this.setDataReserva(dataReserva);
        this.setDataPrevista(dataPrevista);
        this.setSituacao(situacao);
        this.setCodigoLeitor(codigoLeitor);
        this.setCodigoObra(codigoObra);
    }

    public Reserva(){}

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public Leitor getCodigoLeitor() {
        return codigoLeitor;
    }

    public Obra getCodigoObra() {
        return codigoObra;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setDataReserva(LocalDate dataReserva) throws Exception{
        if (dataReserva == null) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataReserva = dataReserva;
        }
    }

    public void setDataPrevista(LocalDate dataPrevista) throws Exception{
        if (dataPrevista == null) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataPrevista = dataPrevista;
        }
    }

    public void setSituacao(String situacao) throws Exception{
        if (situacao == null || situacao.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.situacao = situacao;
        }
    }

    public void setCodigoLeitor(Leitor codigoLeitor) throws Exception{
        if (codigoLeitor.getCodigo() <= 0) {
            throw new Exception("Erro! O código do leitor não pode ser vazio ou zero");
        } else {
            this.codigoLeitor = codigoLeitor;
        }
    }

    public void setCodigoObra(Obra codigoObra) throws Exception{
        if (codigoObra.getCodigo() <= 0) {
            throw new Exception("Erro! O código da obra não pode ser negativo ou zero");
        } else {
            this.codigoObra = codigoObra;
        }
    }

    public void cadastrar() {}
    public void cancelar() {}
    public void retirar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("data da reserva: "+getDataReserva());
        System.out.println("data prevista de retorno: "+getDataPrevista());
        System.out.println("situação: "+getSituacao());
    }
}
