package Client;
import java.util.Scanner;


public class Menu {
    public static void menu() {

        System.out.println("\n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n");
        
        Scanner sc =  new Scanner(System.in);   
        String opcao = sc.next();

        switch (opcao) {
            case "1":               
                Opcoes.iniciarJogo();
                Opcoes.creditos();
                menu();
                break;
            case "2":
                Opcoes.instrucoes();
                menu();
                break;
            case "3":
                Opcoes.creditos();
                menu();
                break;
            case "4":
                Opcoes.sairDoJogo();
                break;
            default:
                Opcoes.mensagemPadraoNaoReconhecido();
                menu();
                break;
        }

        sc.close();
    }

}
