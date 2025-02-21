public class Agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda(String data, String hora, String medico, String paciente) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void mostrar(){
        System.out.println("\n\nhora: "+ getHora());
        System.out.println("data: "+ getData());
        System.out.println("medico: "+ getMedico());
        System.out.println("paciente: "+ getPaciente());
    }
}
