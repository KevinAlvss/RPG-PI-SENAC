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
        Utils.escrever("\nCréditos\n");
        Utils.escrever("Kevin");
        Utils.escrever("\nAffonso");
        Utils.escrever("\nRaian");
        Utils.escrever("\nNathalia");
        Utils.escrever("\nVyviane\n");
    }

    public static void sairDoJogo() {
        Utils.escrever("\nFoi um prazer jogar com vc...\n");
    }

    public static void mensagemPadraoNaoReconhecido() {
        Utils.escrever("\nHmm... me parece que isso não existe\n");
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
                    break;
            }

        }

    }
}
