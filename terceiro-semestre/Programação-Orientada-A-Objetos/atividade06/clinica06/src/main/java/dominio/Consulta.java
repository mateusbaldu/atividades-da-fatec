package dominio;

import java.time.LocalDate;

public class Consulta extends Agenda{
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;
    private Receita receita;
    private Exame exame;

    public Consulta(){}

    public Consulta(Medico medico, Paciente paciente, String motivo, String historico) {
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public Consulta(LocalDate data, String hora, Medico medico, Paciente paciente, String motivo, String historico, Receita receita, Exame exame) {
        super(data, hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
        setReceita(receita);
        setExame(exame);
    }


    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public Receita getReceita() {
        return receita;
    }

    public Exame getExame() {
        return exame;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }


    @Override
    public void consultar(){}

    public void marcar(){}
    public void cancelar(){}
    public void realizar(){}
    public void atualizar(){}

    @Override
    public void mostrar() {
        System.out.println("\n-----CONSULTA-----");
        super.mostrar();
        System.out.println("Nome do medico: " +medico.getNome());
        System.out.println("Nome do paciente: " +paciente.getNome());
        System.out.println("Descritivo da receita: " +receita.getDescritivo());
        System.out.println("Descritivo do exame: " +exame.getDescritivo());
        System.out.println("Motivo: " +getMotivo());
        System.out.println("Historico: " +getHistorico());
    }
}
