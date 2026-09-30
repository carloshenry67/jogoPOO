// HERANÇA: "extends Personagem" = o Batman ganha tudo que o Personagem tem
// (nome, vida, atacar, receberDano...) sem precisar escrever de novo.
public class Batman extends Personagem {

    // COMPOSIÇÃO: o Batman TEM UM Gadget (um objeto dentro do outro).
    private Gadget gadget;
    private int curas = 3;
    private int pontos = 0;

    public Batman(Gadget gadget) {
        super("Batman", 100); // chama o construtor do Personagem
        this.gadget = gadget;
    }

    // POLIMORFISMO: o Batman calcula o dano do JEITO DELE (15 + bônus do gadget).
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
