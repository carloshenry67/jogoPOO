void main() {

        // Criamos os objetos do jogo
        Batman batman = new Batman(new Gadget("Batarangue", 5));

        // POLIMORFISMO: a lista é de Personagem, mas guarda vilões diferentes
        Personagem[] viloes = { new Pinguim(), new Coringa() };

        // Uma luta para cada vilão (cada luta é uma "fase")
        for (Personagem vilao : viloes) {
            IO.println("\n=== Batman vs " + vilao.getNome() + " ===");

            // A luta continua enquanto os dois estiverem vivos
            while (batman.estaVivo() && vilao.estaVivo()) {

                IO.println("\nBatman: " + batman.getVida() + " de vida");
                IO.println(vilao.getNome() + ": " + vilao.getVida() + " de vida");
                IO.println("1 - Atacar");
                IO.println("2 - Curar (" + batman.getCuras() + " restantes)");

                // IO.readln mostra a pergunta e espera o jogador digitar
                String opcao = IO.readln("Escolha: ");

                // Vez do jogador
                if (opcao.equals("1")) {
                    batman.atacar(vilao);
                } else if (opcao.equals("2") && batman.getCuras() > 0) {
                    batman.usarCura();
                } else {
                    IO.println("Opção inválida!");
                    continue; // volta ao começo sem o vilão atacar
                }

                // Vez do vilão (só ataca se ainda estiver vivo)
                if (vilao.estaVivo()) {
                    vilao.atacar(batman);
                }
            }

            // Fim da luta: quem ganhou?
            if (batman.estaVivo()) {
                batman.ganharPontos(100);
                IO.println(vilao.getNome() + " foi derrotado! Pontos: " + batman.getPontos());
            } else {
                IO.println("Batman perdeu... Gotham está perdida!");
                return; // termina o jogo
            }
        }

        IO.println("\nGotham está salva! Pontuação final: " + batman.getPontos());
    }
