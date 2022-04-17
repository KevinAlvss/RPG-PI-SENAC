package Client;
import Cenas.*;
import Utils.Utils;
public class Opcoes {

    public static void iniciarJogo() {
        CenaUm.init();
    }

    public static void instrucoes() {
        Utils.escrever("\nO jogo se passa na época de 1939, durante a 2ª guerra mundial, onde você terá que ajudar Alan Turing a resolver o Enigma. \n"
        + "Uma máquina que foi desenvolvida para criptografar coordenadas e assim, efetuar ataques sem que ninguém saiba onde irão acontecer. \n"
        + "Você terá escolhas a fazer e dependendo delas, isso influenciará no futuro da guerra.\n");
    }

    public static void creditos() {
        System.out.println("\nCréditos\n");
        System.out.println("Kevin\nAffonso\nRaian\nNathalia\nVyviane\n");
    }

    public static void sairDoJogo() {
        System.out.println("\nFoi um prazer jogar com vc...\n");
    }

    public static void mensagemPadraoNaoReconhecido() {
        System.out.println("\nHmm... me parece que isso não existe\n");
    }    
}
