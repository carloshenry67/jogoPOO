public class Pinguim extends Personagem {

    public Pinguim() {
        super("Pinguim", 50);
    }

    @Override
    public int calcularDano() {
        return 8;
    }
}