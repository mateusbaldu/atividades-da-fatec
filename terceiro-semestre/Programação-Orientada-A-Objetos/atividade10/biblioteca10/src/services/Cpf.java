package services;

public class Cpf {
    private String cpf;

    public Cpf(String document) {
        validateCpf(document);
        concatCpf(document);
        this.cpf = document;
    }

    public void validateCpf(String cpf) {
        if (cpf == null) {
            throw new IllegalArgumentException("Erro! O CPF não pode ser nulo");
        }
        if (cpf.length() != 14) {
            throw new IllegalArgumentException("Erro! CPF invalido");
        }
    }

    public void concatCpf(String input) {
        if (input.contains(".") && input.contains("-")) {
            this.cpf = input.replaceAll("[^0-9]", "");
        }
    }

    public String getValue() {
        concatCpf(this.cpf);
        String parteUm = this.cpf.substring(0,3);
        String parteDois = this.cpf.substring(3,6);
        String parteTres = this.cpf.substring(6,9);
        String parteQuatro = this.cpf.substring(9);

        return parteUm + "." + parteDois + "." + parteTres + "." + parteQuatro;
    }
}
