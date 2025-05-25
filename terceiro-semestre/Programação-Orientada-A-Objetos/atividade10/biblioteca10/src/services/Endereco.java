package services;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String cidade, String cep) {
        this.validateCep(cep);
        this.setCidade(cidade);
        this.setLogradouro(logradouro);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void validateCep(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Erro: CPF invalido!");
        }
        if (input.contains(".") && input.contains("-")) {
            this.cep = input.replaceAll("[^0-9]", "");
        }
    }


    public String getValue() {
        return "logradouro: " + logradouro + " | " +
                "cidade: " + cidade + " | " +
                "cep: " + cep;
    }
}

