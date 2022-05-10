package Client;

import java.util.Scanner;
import Utils.Utils;

public class Menu {
    public static void exibir() {

        boolean saiu = false;
        Scanner sc = new Scanner(System.in);

        while (!saiu) {
            Utils.escrever("\n1 - Jogar\n2 - Instruções\n3 - Selecionsar Cena\n4 - Configurações \n5 - Créditos\n6 - Sair\n");

            String opcao = sc.next();

            switch (opcao) {
                case "1":
                    Opcoes.iniciarJogo();
                    Opcoes.creditos();
                    break;
                case "2":
                    Opcoes.instrucoes();
                    break;
                case "3":
                    Opcoes.SelecionarCena();
                    break;
                case "4":
                    Opcoes.configuracoes();
                    break;
                case "5":
                    Opcoes.creditos();
                    break;
                case "6":
                    Opcoes.sairDoJogo();
                    saiu = true;
                    break;
                default:
                    Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }

        sc.close();
    }

}
