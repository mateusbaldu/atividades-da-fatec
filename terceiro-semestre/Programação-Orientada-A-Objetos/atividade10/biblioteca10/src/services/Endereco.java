package services;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String cidade, String cep) {
        this.setCep(cep);
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


    public void setCep(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Erro: CEP inválido!");
        }
        String cepConcatenado = input.replaceAll("[^0-9]", "");
        if (cepConcatenado.length() != 8) {
            throw new IllegalArgumentException("Erro: CEP deve ter 8 dígitos.");
        }
        this.cep = cepConcatenado;
    }


    public String getValue() {
        return "logradouro: " + logradouro + " | " +
                "cidade: " + cidade + " | " +
                "cep: " + cep;
    }
}

