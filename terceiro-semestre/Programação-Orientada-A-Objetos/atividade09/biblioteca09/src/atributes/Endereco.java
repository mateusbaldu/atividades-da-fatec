package atributes;

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

    public void validateCep(String cep) {
        if ((cep.length() != 8) && (!cep.contains("-"))) {
            throw new IllegalArgumentException("Erro! CEP invalido");
        }
        this.cep = cep;
    }

    public String getValue() {
        return "logradouro: " + logradouro + " | " +
                "cidade: " + cidade + " | " +
                "cep: " + cep;
    }
}

