import java.util.Scanner;

public class initGame {

    static Scanner sc = new Scanner(System.in);

    public static class Jogador {
        public String nome;
    };

    static Jogador jogador = new Jogador();

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {

        System.out.print("1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n");

        String opcao = sc.next();

        switch (opcao) {
            case "1":
                IniciarJogo();
                Creditos();
                Menu();
                break;
            case "2":
                Instrucoes();
                Menu();
            case "3":
                Creditos();
                Menu();
                break;
            case "4":
                SairDoJogo();
                break;
            default:
                MensagemPadraoNaoReconhecido();
                Menu();
                break;
        }

    }

    private static void IniciarJogo() {
        System.out.print("Olá jovem gafanhoto! Diga-me o seu nome:\nSeu nome:");

        String nomeDoJogador = sc.next();
        jogador.nome = nomeDoJogador;

        System.out.print("Hmm... " + jogador.nome
                + "... esse nome me parece familiar... mas mesmo assim vamos começar nosso jogo\n");
    }

    private static void Instrucoes() {
        System.out.print("Instruções que o affonso vai fazer");
    }

    private static void Creditos() {
        System.out.print("Kevin\nAffonso\nRaian\nNathalia\nVyviane\n");
    }

    private static void SairDoJogo() {
        System.out.print("Foi um prazer jogar com vc...\n");
    }

    private static void MensagemPadraoNaoReconhecido() {
        System.out.print("Hmm... me parece que isso não existe\n");
    }
}
