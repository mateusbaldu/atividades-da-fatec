import org.w3c.dom.ls.LSOutput;

public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return "******************";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar(){}
    public void mostrar() {
        System.out.println("\n\nnome: "+ getNome());
        System.out.println("crm: "+ getCrm());
        System.out.println("telefone: "+ getTelefone());
        System.out.println("especialidade: "+ getEspecialidade());
        System.out.println("senha: "+ getSenha());
    }
}
