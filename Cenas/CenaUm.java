package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;

public class CenaUm {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaUm() {
        Utils.escrever(
                "Baseado em uma história real, 1951, Manchester, Inglaterra");
        Utils.escrever( 
                "Está prestando atenção? Que bom! Se não prestar bastante atenção perderá os detalhes, detalhes importantes." 
                + "\nEu não vou parar, não vou me repetir e o senhor não vai me interromper. Acha que só porque está onde está e porque eu estou onde eu estou o senhor está no controle dos acontecimentos?"
                + "\nO senhor está errado, eu estou no controle. Porque eu sei de coisas que o senhor não sabe."
                + "\nO que eu quero do senhor agora é comprometimento. O senhor vai prestar atenção e não vai me julgar até o terminar."
                + "\nSe não fosse dedicar a isso por favor saia daqui, mas se escolher ficar lembre-se de que foi uma escolha sua."
                + "\nO que acontecer daqui para a frente não é de minha responsabilidade, é sua, preste atenção!");
        Utils.escrever(
                "Tudo o que fizer, cada decisão que tomar a partir de agora, abrirá portas para o futuro.");
        Utils.escrever(
                "Lembre-se disso enquanto estiver jogando, cada escolha afetará o seu destino.");
        Utils.escrever(
                "Eu sou apenas um jovem e o mundo já está em guerra, e não é uma guerra qualquer, é a segunda guerra mundial, todos os meus amigos foram para o campo de batalha, e eu aqui continuo trabalhando como matemático, sinto que a cada dia eu deixo de contribuir para o meu país, talvez eu tenha nascido na época errada, mas eu sei que através dos meus conhecimentos eu posso vencer essa guerra.... e essa é a minha história");
        Utils.escrever(
                "Eu estou voltando para casa da padaria, de repente vejo policiais na frente da casa de um conhecido meu chamado Alan Turing, e vou lá ver");
        decisaoPoliciais();
    }

    private static void decisaoPoliciais() {

        boolean saiu = false;

        while (!saiu) {

            // da para colocar um 3 opção ignorar e ir emborar para casa
            Utils.escrever("1 - Passo direto pelos policiais\n2 - Pergunto oq está acontecendo");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    passarDiretoPelosPoliciais();
                    saiu = true;
                    break;
                case "2":
                    perguntarOqueEstaAcontecendo();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void passarDiretoPelosPoliciais() {
        Utils.escrever("Um policial bateu no meu peito e me disse: 'EI JOVEM, ESSA AREA É RESTRITA'");
        decisaoPoliciaisDois();
    }

    private static void perguntarOqueEstaAcontecendo() {
        Utils.escrever("O policial me pergunta: 'Porque eu deveria te contar??'");
        decidirSuaRelacaoComAlan();
    }

    private static void decisaoPoliciaisDois() {
        boolean saiu = false;

        while (!saiu) {
            // da para colocar um 3 opção ignorar e ir emborar para casa
            Utils.escrever("1 - Digo que o alan é meu amigo\n2 - Pergunto o que está acontecendo");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    explicarAoPolicialSuaRelacaoComAlan();
                    saiu = true;
                    break;
                case "2":
                    perguntarOqueEstaAcontecendo();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void decidirSuaRelacaoComAlan() {
        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Digo que o alan é meu amigo\n2 - Digo que o alan é meu irmão\n3 - Digo que o alan é meu primo\n4 - Digo que moro aqui perto e estou curioso");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                case "2":
                case "3":
                case "4":
                    explicarAoPolicialSuaRelacaoComAlan();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void explicarAoPolicialSuaRelacaoComAlan() {

        Utils.escrever("Então senhor policial o Alan é meu...");
        Utils.escrever(
                "De repente um outro policial sai de dentro da casa visivelmente irritado dizendo para o seu companheiro: 'Vamos embora, não tem nada aqui, isso foi uma viagem perdida'");
        interacaoComAlan();
    }

    private static void interacaoComAlan() {
        boolean saiu = false;

        Utils.escrever("Enquanto os policiais estão indo embora vejo o Alan através de uma janela");
        while (!saiu) {
            Utils.escrever("1 - Ignoro ele, e vou para casa\n2 - Levanto a voz e pergunto oq aconteceu");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irParaCasa();
                    saiu = true;
                    break;
                case "2":
                    alanIgnora();
                    saiu = true;
                    break;

                default:
                    break;
            }
        }
    }

    private static void alanIgnora() {
        boolean saiu = false;

        Utils.escrever("Percebo que ele me ignora");

        while (!saiu) {
            Utils.escrever("1 - Ignoro ele, e vou para casa\n2 - Tento novamente");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irParaCasa();
                    saiu = true;
                    break;
                case "2":
                    AlanResponde();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void AlanResponde() {
        boolean saiu = false;

        Utils.escrever("Ele levanta a cabeça e me diz: 'Já que está aí, pega essa vassoura que está do seu lado?'");
        while (!saiu) {
            Utils.escrever("1 - Pego a vassoura\n2 - Não pego a vassoura");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    pegoAVassoura();
                    saiu = true;
                    break;
                case "2":
                    Utils.escrever("O alan me diz:'ok, já que não está para ajudar, vá embora'");
                    irParaCasa();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }

    }

    private static void pegoAVassoura() {
        boolean saiu = false;
        Utils.escrever(
                "Eu pego a vassoura, levo até ele, e chegando lá ele me diz: 'Você me parece familiar,eu te conheço de algum lugar?'");
        while (!saiu) {
            Utils.escrever("1 - Digo que sim \n2 - Digo que não");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    Utils.escrever(
                            "Sim! eu sou primo de um velho amigo seu, o Christopher\nO Alan me disse: 'Ah... sim... por isso te achei familiar..., seu nome é ...'");
                    agradecimentoAlan();
                    saiu = true;
                    break;
                case "2":
                    Utils.escrever("O alan me diz: 'ah... então me diga qual seu nome'");
                    agradecimentoAlan();
                    saiu = true;
                    break;

                default:
                    break;
            }
        }
    }

    private static void agradecimentoAlan() {
        Jogador.DefinirNomeJogador();

        Utils.escrever("\nAlan diz: 'ISSO MESMO! como pude esquecer o nome da pessoa que salvou minha vida?");
        Utils.escrever(
                "Bom " + Jogador.GetNomeJogador() + " muito obrigado por aquilo e muito obrigado pela vassoura.'");
        irParaCasa();

    }

    private static void irParaCasa() {
        try {
            Utils.escrever("Após isso fui embora para casa seguir minha rotina");
            Thread.sleep(2000);
            CenaDois.initCenaDois();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
