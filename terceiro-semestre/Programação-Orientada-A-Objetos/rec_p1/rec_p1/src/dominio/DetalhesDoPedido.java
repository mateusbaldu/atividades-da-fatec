package dominio;

public class DetalhesDoPedido {
    private Pedido pedido;
    private int numPedido;
    private int numProduto;
    private String nomeProduto;
    private int quantidade;
    private float precoUnidade;
    private float subtotal;

    public DetalhesDoPedido(Pedido pedido, int numProduto, String nomeProduto,
                            int quantidade, float precoUnidade, float subtotal) throws Exception{
        setPedido(pedido);
        setNumProduto(numProduto);
        setNomeProduto(nomeProduto);
        setQuantidade(quantidade);
        setPrecoUnidade(precoUnidade);
        setSubtotal(subtotal);

        setNumPedido();
    }


    public Pedido getPedido() {
        return pedido;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPrecoUnidade() {
        return precoUnidade;
    }

    public float getSubtotal() {
        return subtotal;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setNumPedido() {
        this.numPedido = pedido.getNumPedido(); //tirando a informacao diretamente do pedido
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnidade(float precoUnidade) throws Exception{
        if (precoUnidade <= 0) {
            throw new Exception("Erro! O preço da unidade não pode ser negativo ou zero");
        } else {
            this.precoUnidade = precoUnidade;
        }
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }


    public void imprimir(){
        System.out.println("\n-------------------" +
                "\nDetalhes Do Pedido: " +
                "\nNumero do pedido= " + pedido.getNumPedido() +
                "\nnumPedido= " + numPedido +
                "\nnumProduto= " + numProduto +
                "\nnomeProduto= '" + nomeProduto + '\'' +
                "\nquantidade= " + quantidade +
                "\nprecoUnidade= " + precoUnidade +
                "\nsubtotal= " + subtotal);
    }

    public float calcularPreco(){
        return this.quantidade * this.precoUnidade;
    }
}
