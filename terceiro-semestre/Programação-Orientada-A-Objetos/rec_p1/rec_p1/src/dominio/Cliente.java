package dominio;

import java.time.LocalDate;

public class Cliente extends Usuario{
    private String nomeCliente;
    private String endereco;
    private String email;
    private String infoCartaoCredito;
    private String infoFrete;
    private float saldoConta;
    private CarrinhoDeCompras carrinhoDeCompras;
    private Pedido pedido;

    public Cliente(String numUsuario, String senha, String statusLogin, LocalDate dataRegistro,
                   String nomeCliente, String endereco, String email, String infoCartaoCredito,
                   String infoFrete, float saldoConta, CarrinhoDeCompras carrinhoDeCompras,
                   Pedido pedido) throws Exception{
        super(numUsuario, senha, statusLogin, dataRegistro);
        setNomeCliente(nomeCliente);
        setEndereco(endereco);
        setEmail(email);
        setInfoCartaoCredito(infoCartaoCredito);
        setInfoFrete(infoFrete);
        setSaldoConta(saldoConta);
        setCarrinhoDeCompras(carrinhoDeCompras);
        setPedido(pedido);
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getInfoCartaoCredito() {
        return infoCartaoCredito;
    }

    public String getInfoFrete() {
        return infoFrete;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) throws Exception{
        if (email.length() <= 5 || email.isEmpty() || !email.contains("@")) {
            throw new Exception("Erro! email invalido");
        } else {
            this.email = email;
        }
    }

    public void setInfoCartaoCredito(String infoCartaoCredito) {
        this.infoCartaoCredito = infoCartaoCredito;
    }

    public void setInfoFrete(String infoFrete) {
        this.infoFrete = infoFrete;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }



    @Override
    public String toString() {
        return  "\n-------------------" +
                "\nCLIENTE: " +
                "\nnomeCliente= '" + nomeCliente + '\'' +
                "\nnumUsuario= '" + numUsuario + '\'' +
                "\nendereco= '" + endereco + '\'' +
                "\nemail= '" + email + '\'' +
                "\nsaldoConta= " + saldoConta +
                "\ninfoCartaoCredito= '" + infoCartaoCredito + '\'' +
                "\ninfoFrete= '" + infoFrete + '\'' +
                "\nnumero do carrinho de compras= " + carrinhoDeCompras.getNumCarrinho() +
                "\nnumero do pedido=" + pedido.getNumPedido() +
                "\nsenha= '" + senha + '\'' +
                "\nstatusLogin= '" + statusLogin + '\'' +
                "\ndataRegistro= " + dataRegistro;
    }

    @Override
    public boolean verificarLogin() {
        return false;
    }

    public void registrar(){}
    public void login(){}
    public void atualizarPerfil(){}
}
