package Client;

import Cenas.*;
import Utils.Utils;
import java.util.Scanner;

public class Opcoes {

    static Scanner sc = new Scanner(System.in);

    public static void iniciarJogo() {
        CenaUm.initCenaUm();
    }

    public static void instrucoes() {
        Utils.escrever(
                "\nO jogo se passa na época de 1939, durante a 2ª guerra mundial, onde você terá que ajudar Alan Turing a resolver o Enigma. \n"
                        + "Uma máquina que foi desenvolvida para criptografar coordenadas e assim, efetuar ataques sem que ninguém saiba onde irão acontecer. \n"
                        + "Você terá escolhas a fazer e dependendo delas, isso influenciará no futuro da guerra.\n");
    }

    public static void creditos() {
        Utils.escrever("Créditos:");

        Utils.escreverNaoPular("Jogo inspirado no filme: Jogo da imitação");
        Utils.escreverNaoPular("Affonso");
        Utils.escreverNaoPular("Kevin");
        Utils.escreverNaoPular("Nathalia");
        Utils.escreverNaoPular("Raian");
        Utils.escreverNaoPular("Vyviane");
    }

    public static void sairDoJogo() {
        Utils.escrever("\nFoi um prazer jogar com vc...");
    }

    public static void mensagemPadraoNaoReconhecido() {
        Utils.escrever("\nHmm... me parece que esse comando não existe :/ \n");
    }

    public static void configuracoes() {

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("\n1 - Velocidade de texto\n");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    Configuracoes.definirVelociade();
                    saiu = true;
                    break;
                default:
                    Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }

        }

    }

    public static void SelecionarCena() {

        boolean saiu = false;
        while (!saiu) {
            Utils.escrever(
                    "1 - 1° Cena\n2 - 2° Cena\n3 - 3° Cena\n4 - 4° Cena\n5 - 5° Cena\n6 - 6° Cena\n7 - 7° Cena\n8 - 8° Cena ");
            String decisao = sc.next();

            
                switch (decisao) {
                    case "1":
                        CenaUm.initCenaUm();
                        saiu = true;
                        break;

                    case "2":
                        Jogador.DefinirNomeJogador();
                        CenaDois.initCenaDois();
                        saiu = true;
                        break;

                    case "3":
                        Jogador.DefinirNomeJogador();
                        CenaTres.initCenaTres();
                        saiu = true;
                        break;

                    case "4":
                        Jogador.DefinirNomeJogador();
                        CenaQuatro.initCenaQuatro();
                        saiu = true;
                        break;

                    case "5":
                        Jogador.DefinirNomeJogador();
                        CenaCinco.initCenaCinco();
                        saiu = true;
                        break;

                    case "6":
                        Jogador.DefinirNomeJogador();
                        CenaSeis.initCenaSeis();
                        saiu = true;
                        break;

                    case "7":
                        Jogador.DefinirNomeJogador();
                        CenaSete.initCenaSete();
                        saiu = true;
                        break;

                    case "8":
                        Jogador.DefinirNomeJogador();
                        CenaOito.initCenaOito();
                        saiu = true;
                        break;

                    default:

                        break;
            }
        }
    }
}
