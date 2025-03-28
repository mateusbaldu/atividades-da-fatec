package dominio;

public class InformacoesDeEnvio {
    private int numFrete;
    private String tipoFrete;
    private double precoFrete;
    private int numRegiaoFrete;
    private Pedido pedido;

    public InformacoesDeEnvio(int numFrete, String tipoFrete, double precoFrete,
                              int numRegiaoFrete, Pedido pedido) throws Exception {
        setNumFrete(numFrete);
        setTipoFrete(tipoFrete);
        setNumRegiaoFrete(numRegiaoFrete);
        setPrecoFrete(precoFrete);
        setPedido(pedido);
    }


    public int getNumFrete() {
        return numFrete;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public int getNumRegiaoFrete() {
        return numRegiaoFrete;
    }

    public Pedido getPedido() {
        return pedido;
    }


    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }

    public void setTipoFrete(String tipoFrete) throws Exception {
        if (tipoFrete == null || tipoFrete.isEmpty()) {
            throw new Exception("Erro! O tipo do frete não pode ser vazio");
        } else {
            this.tipoFrete = tipoFrete;
        }
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    public void setNumRegiaoFrete(int numRegiaoFrete) {
        this.numRegiaoFrete = numRegiaoFrete;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public void imprimir(){
        System.out.println("\n-------------------" +
                "\nInformacoes De Envio: " +
                "\nnumFrete= " + numFrete +
                "\ntipoFrete= '" + tipoFrete + '\'' +
                "\nprecoFrete= " + precoFrete +
                "\nnumRegiaoFrete= " + numRegiaoFrete +
                "\nNumero do pedido= " + pedido.getNumPedido());
    }

    public void atualizarInfoFrete(){}
}
