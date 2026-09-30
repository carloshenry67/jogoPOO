public class Gadget {
    private String nome;
    private int bonus;

    public Gadget(String nome, int bonus) {
        this.nome = nome;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public int getBonus() {
        return bonus;
    }
}