package domain;

import services.*;

public class Leitor extends Pessoa{
    private CategoriaLeitor categoriaLeitor;

    public Leitor(long codigo, String nome, String email, String telefone, Cpf cpf,
                  Endereco endereco, String senha, CategoriaLeitor categoriaLeitor) throws Exception {
        super(codigo, nome, email, telefone, cpf, endereco, senha);
        this.setCategoriaLeitor(categoriaLeitor);
    }

    public Leitor(CategoriaLeitor categoriaLeitor) throws Exception {
        this.setCategoriaLeitor(categoriaLeitor);
    }

    public Leitor(){
    }


    public long getCodigo() {
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

    public Endereco getEndereco() {
        return super.getEndereco();
    }

    public String getSenha() {
        return super.getSenha();
    }

    public CategoriaLeitor getCategoriaLeitor() {
        return categoriaLeitor;
    }


    public void setCodigo(long codigo) throws Exception{
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
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        if (!email.matches(regex)) {
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

    public void setEndereco(Endereco endereco) throws Exception {
        if (endereco == null || endereco.getValue().isEmpty()) {
            throw new IllegalArgumentException("Erro! Esse campo não pode ser vazio");
        }
        super.setEndereco(endereco);
    }

    public void setSenha(String senha) throws Exception {
        if ((senha.length() < 6)) {
            throw new IllegalArgumentException("Erro! A senha deve possuir 6 ou mais caractéres");
        }
        this.senha = senha;
    }

    public void setCategoriaLeitor(CategoriaLeitor categoriaLeitor) throws Exception{
        if (categoriaLeitor == null) {
            throw new Exception("Erro! A categoria do leitor não pode ser vazio ou zero");
        } else {
            this.categoriaLeitor = categoriaLeitor;
        }
    }


    public void guardar() {}
    public void carregar() {}
    public void listar() {}

    public void mostrar() {
        System.out.println("\n-----Leitor-----");
        System.out.println("codigo: "+getCodigo());
        System.out.println("nome: "+getNome());
        System.out.println("email: "+getEmail());
        System.out.println("telefone: "+getTelefone());
        System.out.println("documento: "+getCpf().getValue());
        System.out.println("Categoria do Leitor: " +categoriaLeitor.getTipo());
        System.out.println("senha: "+getSenha());
    }
}
