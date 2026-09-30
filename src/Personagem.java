public abstract class Personagem implements Atacavel {
    //encapsulamento
    private String nome;
    private int vida;

    //construtor
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida = vida - dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void curar(int valor) {
        vida = vida + valor;
        if (vida > 100) {
            vida = 100;
        }
    }

    // MÉTODO ABSTRATO: sem corpo. Cada filho é obrigado a escrever o seu.
    public abstract int calcularDano();

    // Todo personagem ataca do mesmo jeito: calcula o dano e tira vida do alvo.
    @Override
    public void atacar(Personagem alvo) {
        int dano = calcularDano();
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}