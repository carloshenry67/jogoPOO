public abstract class Personagem implements Atacavel {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

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

    public abstract int calcularDano();

    @Override
    public void atacar(Personagem alvo) {
        int dano = calcularDano();
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}