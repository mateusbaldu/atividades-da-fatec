public class Main {
    public static void main(String[] args) {
        Paciente maria = new Paciente("Maria da Silva", "12345678900", "11940028922", "Feminino", 45, "Maria1234");
        maria.mostrar();

        Paciente jose = new Paciente("Jose da Silva","12345698700","11953301234","Masculino",42,"Jose1234");
        jose.mostrar();

        Recepcionista luiza = new Recepcionista("luiza rocha","11909876543","22233344455","luiza1234#");
        luiza.mostrar();

        Agenda agendamento = new Agenda("20/02/2025","20:00","Claudemir","Maria");
        agendamento.mostrar();

        Consulta consulta = new Consulta("20/02/2025","19:00","Mateus","Claudemir","retorno de consulta","não possui histórico");
        consulta.mostrar();

        Receita mateus = new Receita("20/02 19:00","20/02","premidisolona 3x por dia uma semana");
        mateus.mostrar();

        Exame mateusexame = new Exame("20/02 19:00","20/02","prescrever paracetamol 2x dia por 5 dias");
        mateusexame.mostrar();
    }
}
