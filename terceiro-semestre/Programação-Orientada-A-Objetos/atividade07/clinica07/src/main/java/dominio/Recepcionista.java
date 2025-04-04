package dominio;

public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista(){}

    public Recepcionista(String cpf) {
        setCpf(cpf);
    }

    public Recepcionista(String nome, String telefone, String senha, String cpf) {
        super(nome, telefone, senha);
        setCpf(cpf);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public void mostrar() {
        System.out.println("\n-----RECEPCIONISTA-----");
        super.mostrar();
        System.out.println("CPF: " +getCpf());
    }

    @Override
    public void acessar(){}

    public void cadastrarPaciente() {}

    public void marcarConsulta(){}
}
