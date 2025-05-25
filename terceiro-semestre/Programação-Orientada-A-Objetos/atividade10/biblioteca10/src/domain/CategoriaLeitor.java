package domain;

public class CategoriaLeitor extends Categoria{
    public int dias;

    public CategoriaLeitor(int codigo) throws Exception{
        setCodigo(codigo);
        validarCategoria();
    }

    public CategoriaLeitor() throws Exception{}


    public int getCodigo() {
        return codigo;
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


    public void validarCategoria() throws Exception{
        switch (getCodigo()) {
            case (1):
                setTipo("Aluno");
                setDias(3);
                break;

            case (2):
                setTipo("Professor");
                setDias(4);
                break;

            case (3):
                setTipo("Visitante");
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
