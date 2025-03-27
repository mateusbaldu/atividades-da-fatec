package dominio;

import java.time.LocalDate;

public class Exame extends Procedimento{

    public Exame(){}

    public Exame(LocalDate data, String descritivo) {
        super(data, descritivo);
    }


    @Override
    public void mostrar() {
        System.out.println("\n-----EXAME-----");
        super.mostrar();
    }

    @Override
    public void consultar(){}

    public void solicitar(){}
}
