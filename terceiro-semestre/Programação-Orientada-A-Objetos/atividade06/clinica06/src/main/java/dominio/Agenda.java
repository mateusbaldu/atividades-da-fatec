package dominio;

import java.time.LocalDate;

public abstract class Agenda {
    private LocalDate data;
    private String hora;

    public Agenda(LocalDate data, String hora) {
        setData(data);
        setHora(hora);
    }

    public Agenda() {
    }


    public LocalDate getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public void mostrar(){
        System.out.println("Data: " +getData());
        System.out.println("Hora: " +getHora());
    }

    public abstract void consultar();
}
