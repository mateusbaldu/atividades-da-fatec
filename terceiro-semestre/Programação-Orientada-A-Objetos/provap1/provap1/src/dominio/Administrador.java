package dominio;

public class Administrador extends Pessoa {
    protected String senha;

    public Administrador(String nome, String documento,
                         String email, String telefone, String senha) {
        super(nome, documento, email, telefone);
        setSenha(senha);
    }


    public String getSenha() {
        return "****************";
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void gerarRelatorioMatricula() {
        System.out.println("Insira texto");
    }

    public void notificarPagamentoPendente(Matricula matricula, boolean pagamentoEstaPendente) {
        if (pagamentoEstaPendente) {
            System.out.println("Pagamento esta pendente! Matricula esta irregular");
        } else {
            System.out.println("Pagamento esta totalmente regular!");
        }
    }

    public void gerenciarSalario(Professor professor) {
        System.out.println("Salario do professor: " + professor.getSalario());
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\n-----ADMINISTRADOR-----");
        super.imprimirInformacoes();
        System.out.println("Senha: " + getSenha());
    }
}
