import java.util.Random;

public abstract class Sensor {
    private int valor; // Váriavel que será atribuído o valor gerado aleatoriamente pelo Math.Random
    Random random; //

    // Metodo construtor que irá isntâniar a classe Random e irá atribuir 0 ao variável valor
    public Sensor() {
        this.random = new Random();
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Metodo abstrato que irá ler os dados gerados pelo Math.Random
    public abstract int lerDados();

    // Metodo abstrato que irá imprimir os dados gerados pelo outro metodo
    public abstract void exibirDados();
}


