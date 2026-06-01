package domain;


abstract class Pedido {
    
    private final String nome;
    private final int tamanho;

    public Pedido(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    
    
}
