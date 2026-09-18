public abstract class Personagem {
    private String nome;
    private int vidaMaxima;
    private int vidaAtual;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vidaMaxima, int vidaAtual, int ataque, int defesa){
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void receberDano(int dano){
        vidaAtual -= dano;
        if(vidaAtual < 0){
            vidaAtual = 0;
        }
    }

    public void curar(int quantidade){
        vidaAtual += quantidade;
        if(vidaAtual > vidaMaxima){
            vidaAtual = vidaMaxima;
        }
    }

}
