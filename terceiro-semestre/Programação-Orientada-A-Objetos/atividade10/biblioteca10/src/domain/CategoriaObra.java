package domain;

import services.Cpf;
import services.Endereco;

public class CategoriaObra extends Categoria{

    public CategoriaObra(int codigo, String tipo) throws Exception{
        this.setCodigo(codigo);
        this.setTipo(tipo);
    }

    public CategoriaObra() throws Exception{}


    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }


    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        } else {
            this.codigo = codigo;
        }
    }

    public void setTipo(String tipo) throws Exception{
        if (tipo == null || tipo.isEmpty()) {
            throw new Exception("Erro! Esse campo não pode ser vazio");
        } else {
            this.tipo = tipo;
        }
    }


    public void guardar() {}
    public void carregar() {}

    public void mostrar() {
        System.out.println("\n-----Categoria da Obra-----");
        System.out.println("codigo: " +getCodigo());
        System.out.println("tipo: " +getTipo());
    }

    public static class Funcionario extends Pessoa {
        private String cargo;

        public Funcionario(long codigo, String nome, String email, String telefone,
                           Cpf cpf, String cargo, Endereco endereco, String senha) throws Exception{
            super(codigo, nome, email, telefone, cpf, endereco, senha);
            this.setCargo(cargo);
        }

        public Funcionario(String cargo) throws Exception {
            this.setCargo(cargo);
        }

        public Funcionario(){}


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

        public String getCargo() {
            return cargo;
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

        public void setCargo(String cargo) throws Exception {
            if (cargo == null || cargo.isEmpty()) {
                throw new Exception("Erro! Esse campo não pode ser vazio");
            } else {
                this.cargo = cargo;
            }
        }

        public void setSenha(String senha) throws Exception {
            if ((senha.length() < 6)) {
                throw new IllegalArgumentException("Erro! A senha deve possuir 6 ou mais caractéres");
            }
            super.setSenha(senha);
        }


        public void mostrar() {
            System.out.println("\n-----Funcionario-----");
            System.out.println("codigo: "+getCodigo());
            System.out.println("nome: "+getNome());
            System.out.println("email: "+getEmail());
            System.out.println("telefone: "+getTelefone());
            System.out.println("Endereco: "+getEndereco().getValue());
            System.out.println("documento: "+ getCpf().getValue());
            System.out.println("cargo: "+getCargo());
            System.out.println("senha: "+getSenha());
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
}
