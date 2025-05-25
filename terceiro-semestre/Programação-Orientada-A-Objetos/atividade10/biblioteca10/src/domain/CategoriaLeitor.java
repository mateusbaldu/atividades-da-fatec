package domain;

public class CategoriaLeitor extends Categoria{
    public int dias;

    public CategoriaLeitor(String tipo) throws Exception{
        setTipo(tipo);
        validarCategoria(tipo);
    }

    public CategoriaLeitor() throws Exception{}


    public int getCodigo() {
        return this.codigo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setCodigo(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("Erro! O código não pode ser negativo ou zero");
        } else {
            this.codigo = codigo;
        }
    }

    public void setDias(int dias) throws Exception{
        this.dias = dias;
    }


    public void validarCategoria(String tipo) throws Exception{
        switch (getTipo()) {
            case ("Aluno"):
                setCodigo(1);
                setDias(3);
                break;

            case ("Professor"):
                setCodigo(2);
                setDias(4);
                break;

            case ("Visitante"):
                setCodigo(3);
                setDias(5);
                break;

            default:
                break;
        }
    }

    public void guardar() {}
    public void carregar() {}

    public void mostrar() {
        System.out.println("\n-----Categoria do Leitor-----");
        System.out.println("codigo: " +getCodigo());
        System.out.println("tipo: " +getTipo());
    }
}
