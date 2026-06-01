package domain;


public class Roteiro {
    
    private final String nome;
    private final float distancia;
    
    public Roteiro(String nome, float distancia) {
        this.nome = nome;
        this.distancia = distancia;

    }

    public String getNome() {
        return nome;
    }

    public float getDistancia() {
        return distancia;
    }  
    
}
