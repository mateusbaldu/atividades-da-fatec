public class Main {
    public static void main(String[] args) {
        CategoriaObra categoriaObra = new CategoriaObra(1234, "numerico");
        categoriaObra.mostrar();

        Obra obraUm = new Obra(333, "Mauricio de Souza","Turma da Monica","Panini",2012,"Turma da Monica", 2012557);
        obraUm.mostrar();

        Copia turmaDaMonica = new Copia(3335,"Reservada","Insira texto");
        turmaDaMonica.mostrar();

        Leitor Mateus = new Leitor(20240533,"Mateus Balduino","mateusficticio@email.com",912344321,"142.123.198-00");
        Mateus.mostrar();

        Reserva turmaDaMonicaUm = new Reserva(3335142,"21/02/2024","21/03/2024","Insira texto");
        turmaDaMonicaUm.mostrar();

        
    }
}