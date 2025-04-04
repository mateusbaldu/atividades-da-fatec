package dominio;

import java.time.LocalDate;

public abstract class Procedimento {
    private LocalDate data;
    private String descritivo;

    public Procedimento() {
    }

    public Procedimento(LocalDate data, String descritivo) {
        setData(data);
        setDescritivo(descritivo);
    }


    public LocalDate getData() {
        return data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }


    public abstract void consultar();

    public void mostrar(){
        System.out.println("Data: " +getData());
        System.out.println("Descritivo: " +getDescritivo());
    }
}
