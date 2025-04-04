package dominio;

import java.time.LocalDate;

public class Receita extends Procedimento{

    public Receita(){}

    public Receita(LocalDate data, String descritivo) {
        super(data, descritivo);
    }


    @Override
    public void mostrar() {
        System.out.println("\n-----RECEITA-----");
        super.mostrar();
    }

    @Override
    public void consultar(){}

    public void preescrever(){}
}
