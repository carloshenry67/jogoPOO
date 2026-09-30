// O Coringa também herda de Personagem.
public class Coringa extends Personagem {

    public Coringa() {
        super("Coringa", 60);
    }

    // POLIMORFISMO: dano do Coringa = 12
    @Override
    public int calcularDano() {
        return 12;
    }
}