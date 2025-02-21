public class Consulta {
    private String data;
    private String hora;
    private String paciente;
    private String medico;
    private String motivo;
    private String historico;

    public Consulta(String data, String hora, String paciente, String medico, String motivo, String historico) {
        setData(data);
        setHora(hora);
        setPaciente(paciente);
        setMedico(medico);
        setHistorico(historico);
        setMotivo(motivo);
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

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void marcar(){}
    public void cancelar(){}
    public void consultar(){}
    public void realizar(){}
    public void atualizar(){}

    public void mostrar() {
        System.out.println("\n\ndata: "+ getData());
        System.out.println("hora: "+ getHora());
        System.out.println("paciente: " + getPaciente());
        System.out.println("medico: " + getMedico());
        System.out.println("motivo: "+ getMotivo());
        System.out.println("historico: "+ getHistorico());
    }
}
