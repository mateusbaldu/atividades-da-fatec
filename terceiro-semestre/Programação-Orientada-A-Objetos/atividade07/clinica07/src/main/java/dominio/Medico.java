package dominio;

public class Medico extends Funcionario{
    private String crm;
    private String especialidade;

    public Medico(){}

    public Medico(String crm, String especialidade) {
        this.setCrm(crm);
        this.setEspecialidade(especialidade);
    }

    public Medico(String nome, String telefone, String senha, String crm, String especialidade) {
        super(nome, telefone, senha);
        this.setCrm(crm);
        this.setEspecialidade(especialidade);
    }


    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public void mostrar() {
        System.out.println("\n-----MEDICO-----");
        super.mostrar();
        System.out.println("CRM: " +getCrm());
        System.out.println("Especialidade: " +getEspecialidade());
    }

    @Override
    public void acessar(){}
}
