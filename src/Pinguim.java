// O Pinguim também herda de Personagem.
public class Pinguim extends Personagem {

    public Pinguim() {
        super("Pinguim", 50);
    }

    // POLIMORFISMO: dano do Pinguim = 8 (diferente do Coringa)
    @Override
    public int calcularDano() {
        return 8;
    }
}