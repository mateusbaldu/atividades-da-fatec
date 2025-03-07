public class Reserva {
    private int codigo;
    private String dataReserva;
    private String dataPrevista;
    private String situacao;

    public Reserva(int codigo, String dataReserva, String dataPrevista, String situacao) {
        this.setCodigo(codigo);
        this.setDataReserva(dataReserva);
        this.setDataPrevista(dataPrevista);
        this.setSituacao(situacao);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
