package dominio;

import java.time.LocalDate;

public class Pedido {
    private int numPedido;
    private LocalDate dataCriacao;
    private String dataFrete;
    private Cliente cliente;
    private String nomeCliente;
    private String numCliente;
    private String status;
    private String numFrete;
    private InformacoesDeEnvio informacoesDeEnvio;
    private DetalhesDoPedido detalhesDoPedido;

    public Pedido(int numPedido, LocalDate dataCriacao, String dataFrete,
                  String status, String numFrete, InformacoesDeEnvio informacoesDeEnvio,
                  DetalhesDoPedido detalhesDoPedido) throws Exception{
        setNumPedido(numPedido);
        setDataCriacao(dataCriacao);
        setDataFrete(dataFrete);
        setStatus(status);
        setNumFrete(numFrete);
        setInformacoesDeEnvio(informacoesDeEnvio);
        setDetalhesDoPedido(detalhesDoPedido);

        setNomeCliente(); //estao dessa forma para pegar
        setNumCliente(); //essas informacoes diretamente do usuario
    }


    public int getNumPedido() {
        return numPedido;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getDataFrete() {
        return dataFrete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public String getStatus() {
        return status;
    }

    public String getNumFrete() {
        return numFrete;
    }

    public InformacoesDeEnvio getInformacoesDeEnvio() {
        return informacoesDeEnvio;
    }

    public DetalhesDoPedido getDetalhesDoPedido() {
        return detalhesDoPedido;
    }


    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataFrete(String dataFrete) {
        this.dataFrete = dataFrete;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNomeCliente() {
        this.nomeCliente = cliente.getNomeCliente(); //pegando diretamente do cliente
    }

    public void setNumCliente() {
        this.numCliente = cliente.getNumUsuario(); //pegando diretamente do cliente
    }

    public void setStatus(String status) throws Exception {
        if (status == null || status.isEmpty()) {
            throw new Exception("Erro! O status não pode ser vazio");
        } else {
            this.status = status;
        }
    }

    public void setNumFrete(String numFrete) {
        this.numFrete = numFrete;
    }

    public void setInformacoesDeEnvio(InformacoesDeEnvio informacoesDeEnvio) {
        this.informacoesDeEnvio = informacoesDeEnvio;
    }

    public void setDetalhesDoPedido(DetalhesDoPedido detalhesDoPedido) {
        this.detalhesDoPedido = detalhesDoPedido;
    }


    @Override
    public String toString() {
        return  "\n-------------------" +
                "\nPEDIDO: " +
                "\nnumPedido= " + numPedido +
                "\ndataCriacao= " + dataCriacao +
                "\ndataFrete= '" + dataFrete + '\'' +
                "\ncliente= " + cliente +
                "\nnomeCliente= '" + nomeCliente + '\'' +
                "\nnumCliente= '" + numCliente + '\'' +
                "\nstatus= '" + status + '\'' +
                "\nnumFrete= '" + numFrete;
    }

    public void efetuarPedido(){}
}
