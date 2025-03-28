package dominio;

import java.time.LocalDate;

public class CarrinhoDeCompras {
    private int numCarrinho;
    private int numProduto;
    private int quantidade;
    private LocalDate dataAdicionado;
    private Cliente cliente;

    public CarrinhoDeCompras(int numCarrinho, int numProduto, int quantidade,
                             LocalDate dataAdicionado, Cliente cliente) throws Exception{
        setNumCarrinho(numCarrinho);
        setNumProduto(numProduto);
        setQuantidade(quantidade);
        setDataAdicionado(dataAdicionado);
        setCliente(cliente);
    }


    public int getNumCarrinho() {
        return numCarrinho;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataAdicionado() {
        return dataAdicionado;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setNumCarrinho(int numCarrinho) {
        this.numCarrinho = numCarrinho;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public void setQuantidade(int quantidade) throws Exception {
        if (quantidade <= 0) {
            throw new Exception("Erro! A quantidade não pode ser zero ou negativa");
        } else {
            this.quantidade = quantidade;
        }
    }

    public void setDataAdicionado(LocalDate dataAdicionado) {
        this.dataAdicionado = dataAdicionado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return  "\n-------------------" +
                "\nCARRINHO DE COMPRAS: " +
                "\nnumCarrinho= " + numCarrinho +
                "\nnumProduto= " + numProduto +
                "\nquantidade= " + quantidade +
                "\ndataAdicionado= " + dataAdicionado +
                "\ncliente= " + cliente.getNomeCliente();
    }

    public void atualizarQuantidade(int quantidade){}
    public void adicionarItemCarrinho(){}
    public void verDetalhesCarrinho(){}
    public void finalizarPedido(){}
}
