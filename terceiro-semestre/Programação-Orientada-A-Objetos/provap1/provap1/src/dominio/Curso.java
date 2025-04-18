package dominio;

public class Curso {
    private String nome;
    private String descricao;
    private String idioma;
    private String nivel;
    private int carga_horaria;

    public Curso(String nome, String descricao, String idioma,
                 String nivel, int carga_horaria) {
        setNome(nome);
        setDescricao(descricao);
        setIdioma(idioma);
        setNivel(nivel);
        setCarga_horaria(carga_horaria);
    }



    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }


    public void imprimirInformacoes() {
        System.out.println("\n-----CURSO-----");
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Idioma: " + getIdioma());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Carga Horaria: " + getCarga_horaria() + " horas");
    }
}
