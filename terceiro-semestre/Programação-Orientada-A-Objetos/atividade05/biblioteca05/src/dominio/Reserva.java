package dominio;

import java.time.LocalDate;

public class Reserva {
    private int codigo;
    private LocalDate dataReserva;
    private LocalDate dataPrevista;
    private String situacao;

    public Reserva(int codigo, LocalDate dataReserva, LocalDate dataPrevista, String situacao) throws Exception{
        this.setCodigo(codigo);
        this.setDataReserva(dataReserva);
        this.setDataPrevista(dataPrevista);
        this.setSituacao(situacao);
    }

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

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new IllegalArgumentException("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setDataReserva(LocalDate dataReserva) throws Exception{
        LocalDate dataInicial = LocalDate.of(0,0,0);
        if (dataReserva == null || dataReserva.isBefore(dataInicial)) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataReserva = dataReserva;
        }
    }

    public void setDataPrevista(LocalDate dataPrevista) throws Exception{
        LocalDate dataInicial = LocalDate.of(0,0,0);
        if (dataPrevista == null || dataPrevista.isBefore(dataInicial)) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        } else {
            this.dataPrevista = dataPrevista;
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
    public void cancelar() {}
    public void retirar() {}

    public void mostrar() {
        System.out.println("\ncodigo: "+getCodigo());
        System.out.println("data da reserva: "+getDataReserva());
        System.out.println("data prevista de retorno: "+getDataPrevista());
        System.out.println("situação: "+getSituacao());
    }
}
