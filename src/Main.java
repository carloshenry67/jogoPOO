void main() {
        Batman batman = new Batman(new Gadget("Batarangue", 5));

        Personagem[] viloes = { new Pinguim(), new Coringa() };

        for (Personagem vilao : viloes) {
            IO.println("\n=== Batman vs " + vilao.getNome() + " ===");

            while (batman.estaVivo() && vilao.estaVivo()) {

                IO.println("\nBatman: " + batman.getVida() + " de vida");
                IO.println(vilao.getNome() + ": " + vilao.getVida() + " de vida");
                IO.println("1 - Atacar");
                IO.println("2 - Curar (" + batman.getCuras() + " restantes)");

                String opcao = IO.readln("Escolha: ");

                if (opcao.equals("1")) {
                    batman.atacar(vilao);
                } else if (opcao.equals("2") && batman.getCuras() > 0) {
                    batman.usarCura();
                } else {
                    IO.println("Opção inválida!");
                    continue;
                }

                if (vilao.estaVivo()) {
                    vilao.atacar(batman);
                }
            }

            if (batman.estaVivo()) {
                batman.ganharPontos(100);
                IO.println(vilao.getNome() + " foi derrotado! Pontos: " + batman.getPontos());
            } else {
                IO.println("Batman perdeu... Gotham está perdida!");
                return;
            }
        }

        IO.println("\nGotham está salva! Pontuação final: " + batman.getPontos());
    }
