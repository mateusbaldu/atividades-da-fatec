package dominio;

import DAO.LeitorDAO;
import atributes.Cpf;

public class Leitor extends Pessoa{
    private CategoriaLeitor categoriaLeitor;

    public Leitor(int codigo, String nome, String email, String telefone, Cpf cpf,
                  CategoriaLeitor categoriaLeitor) throws Exception {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCpf(cpf);
        this.setCategoriaLeitor(categoriaLeitor);
    }

    public Leitor(CategoriaLeitor categoriaLeitor) throws Exception {
        this.setCategoriaLeitor(categoriaLeitor);
    }

    


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

    public CategoriaLeitor getCategoriaLeitor() {
        return categoriaLeitor;
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
    }
}
