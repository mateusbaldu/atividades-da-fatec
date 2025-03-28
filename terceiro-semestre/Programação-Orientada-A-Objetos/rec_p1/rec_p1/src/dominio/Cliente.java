package dominio;

import java.time.LocalDate;

public class Cliente extends Usuario{
    private String nomeCliente;
    private String endereco;
    private String email;
    private String infoCartaoCredito;
    private String infoFrete;
    private double saldoConta;
    private CarrinhoDeCompras carrinhoDeCompras;
    private Pedido pedido;

    public Cliente(String numUsuario, String senha, String statusLogin, LocalDate dataRegistro,
                   String nomeCliente, String endereco, String email, String infoCartaoCredito,
                   String infoFrete, double saldoConta) throws Exception{
        super(numUsuario, senha, statusLogin, dataRegistro);
        setNomeCliente(nomeCliente);
        setEndereco(endereco);
        setEmail(email);
        setInfoCartaoCredito(infoCartaoCredito);
        setInfoFrete(infoFrete);
        setSaldoConta(saldoConta);
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

    public double getSaldoConta() {
        return saldoConta;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public Pedido getPedido() {
        return pedido;
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

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }



    public void imprimir(){
        System.out.println(  "\n-------------------" +
                "\nCLIENTE: " +
                "\nnomeCliente= '" + nomeCliente + '\'' +
                "\nnumUsuario= '" + numUsuario + '\'' +
                "\nendereco= '" + endereco + '\'' +
                "\nemail= '" + email + '\'' +
                "\nsaldoConta= " + saldoConta +
                "\ninfoCartaoCredito= '" + infoCartaoCredito + '\'' +
                "\ninfoFrete= '" + infoFrete + '\'' +
                "\nsenha= '" + senha + '\'' +
                "\nstatusLogin= '" + statusLogin + '\'' +
                "\ndataRegistro= " + dataRegistro);
    }

    @Override
    public boolean verificarLogin() {
        return false;
    }

    public void registrar(){}
    public void login(){}
    public void atualizarPerfil(){}
}
