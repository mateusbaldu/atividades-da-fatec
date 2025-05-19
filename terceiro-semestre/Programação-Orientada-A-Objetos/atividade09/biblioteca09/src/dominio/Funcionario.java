package dominio;

import atributes.Cpf;

public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(int codigo, String nome, String email, String telefone,
                       Cpf cpf, String cargo) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCpf(cpf);
        this.setCargo(cargo);
    }

    public Funcionario(String cargo) throws Exception {
        this.setCargo(cargo);
    }

    public Funcionario() throws Exception{}


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }


    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) throws Exception{
        if (nome == null || nome.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public void setEmail(String email) throws Exception{
        if (email == null || email.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.email = email;
        }
    }

    public void setTelefone(String telefone) throws Exception{
        if (telefone == null || telefone.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.telefone = telefone;
        }
    }

    public void setCpf(Cpf cpf) throws Exception{
        if (cpf == null || cpf.getValue().isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.cpf = cpf;
        }
    }

    public void setCargo(String cargo) throws Exception{
        if (cargo == null || cargo.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.cargo = cargo;
        }
    }


    public void mostrar() {
        System.out.println("\n-----Funcionario-----");
        System.out.println("codigo: "+getCodigo());
        System.out.println("nome: "+getNome());
        System.out.println("email: "+getEmail());
        System.out.println("telefone: "+getTelefone());
        System.out.println("documento: "+ getCpf().getValue());
        System.out.println("cargo: "+getCargo());
    }

    public void gerenciaObra(CategoriaObra categoriaObra) throws Exception{
        Obra HunterXHunter = new Obra();
        HunterXHunter.setCodigo(55);
        HunterXHunter.setTitulo("Hunter X Hunter");
        HunterXHunter.setAutores("Yoshihiro Togashi");
        HunterXHunter.setEditora("Shounen Jump");
        HunterXHunter.setAno(1998);
        HunterXHunter.setDescritivo("Melhor mangá da história");
        HunterXHunter.setIsbn("1998445000123");
        HunterXHunter.setCodigoCategoriaObra(categoriaObra);
        HunterXHunter.mostrar();
    }

    public Leitor gerenciarLeitor(CategoriaLeitor categoriaLeitor) throws Exception {
        Leitor Vinicius = new Leitor();
        Cpf cpf = new Cpf("445.776.001-55");
        Vinicius.setCodigo(7);
        Vinicius.setNome("Vinicius Moraes");
        Vinicius.setEmail("viniciusficticio@gmail.com");
        Vinicius.setTelefone("956733321");
        Vinicius.setCpf(cpf);
        Vinicius.setCategoriaLeitor(categoriaLeitor);
        Vinicius.mostrar();

        return Vinicius;
    }

    public Copia criarNovaCopia(Obra HunterXHunter) throws Exception {
        Copia HxH = new Copia();
        HxH.setCodigo(557);
        HxH.setSituacao("Indisponível");
        HxH.setDescritivo("Emprestada");
        HxH.setObra(HunterXHunter);
        HxH.mostrar();
        return HxH;
    }

    public void carregar() {}
    public void guardar() {}
    public void devolver() {}
    public void listar() {}
}
