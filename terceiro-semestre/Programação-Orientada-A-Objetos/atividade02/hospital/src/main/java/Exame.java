public class Exame {
    private String consulta;
    private String data;
    private String prescritivo;

    public Exame(String consulta, String data, String prescritivo) {
        setConsulta(consulta);
        setData(data);
        setPrescritivo(prescritivo);
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrescritivo() {
        return prescritivo;
    }

    public void setPrescritivo(String prescritivo) {
        this.prescritivo = prescritivo;
    }

    public void mostrar() {
        System.out.println("\n\nconsulta: "+ getConsulta());
        System.out.println("data: "+ getData());
        System.out.println("prescritivo: "+ getPrescritivo());
    }
}
