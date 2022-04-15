import java.util.Scanner;
import cenas.*;
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

        System.out.println("\n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n");

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
                break;
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
        CenaUm.init();
    }

    private static void Instrucoes() {
        System.out.println("\nO jogo se passa na época de 1939, durante a 2ª guerra mundial, onde você terá que ajudar Alan Turing a resolver o Enigma. \n"
        + "Uma máquina que foi desenvolvida para criptografar coordenadas e assim, efetuar ataques sem que ninguém saiba onde irão acontecer. \n"
        + "Você terá escolhas a fazer e dependendo delas, isso influenciará no futuro da guerra.\n");
    }

    private static void Creditos() {
        System.out.println("\nCréditos\n");
        System.out.println("Kevin\nAffonso\nRaian\nNathalia\nVyviane\n");
    }

    private static void SairDoJogo() {
        System.out.println("\nFoi um prazer jogar com vc...\n");
    }

    private static void MensagemPadraoNaoReconhecido() {
        System.out.println("\nHmm... me parece que isso não existe\n");
    }
}
