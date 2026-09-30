public class Batman extends Personagem {

    private Gadget gadget;
    private int curas = 3;
    private int pontos = 0;

    public Batman(Gadget gadget) {
        super("Batman", 100);
        this.gadget = gadget;
    }

    @Override
    public int calcularDano() {
        return 15 + gadget.getBonus();
    }

    public int getCuras() {
        return curas;
    }

    public int getPontos() {
        return pontos;
    }

    public void ganharPontos(int p) {
        pontos = pontos + p;
    }

    public void usarCura() {
        curas = curas - 1;
        curar(25);
        System.out.println("Batman se curou e recuperou 25 de vida.");
    }
}
