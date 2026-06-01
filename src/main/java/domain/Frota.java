package domain;

public class Frota {
    private String nome;
    private int pessoal;

    public Frota(String nome, int pessoal) {
        this.nome = nome;
        this.pessoal = pessoal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPessoal() {
        return pessoal;
    }

    public void setPessoal(int pessoal) {
        this.pessoal = pessoal;
    }
    
    
}
