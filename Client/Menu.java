package Client;
import java.util.Scanner;


public class Menu {
    public static void exibir() {

        boolean saiu = false;
        Scanner sc =  new Scanner(System.in);   

        while(!saiu){
            System.out.println("\n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n");
        
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
                    Opcoes.creditos();
                    break;
                case "4":
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
