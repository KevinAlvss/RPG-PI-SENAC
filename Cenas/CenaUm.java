package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;

public class CenaUm {

    static Scanner sc = new Scanner(System.in);
    
    public static void initCenaUm() {
        Utils.escrever("1°CENA");
        Utils.escrever(
                "Eu sou apenas um jovem e o mundo já está em guerra, e não é uma guerra qualquer, é a segunda guerra mundial, todos os meus amigos foram para o campo de batalha, e eu aqui continuo trabalhando como matemático, sinto que a cada dia eu deixo de contribuir para o meu país, talvez eu tenha nascido na época errada, mas eu sei que através dos meus conhecimentos eu posso vencer essa guerra.... e essa é a minha história");
        Utils.escrever(
                "Voltando da padaria, me deparo com policiais na frente da casa do meu vizinho, chamado Alan Turing, como bom curioso que sou decido ir la ver o que está acontecendo");
        decisaoPoliciais();
    }

    private static void decisaoPoliciais() {

        boolean saiu = false;

        while (!saiu) {

            // da para colocar um 3 opção ignorar e ir emborar para casa
            Utils.escrever("1 - Observo de longe os policiais\n2 - Pergunto o que está acontecendo");

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
        Utils.escrever("O policial bateu no meu peito e disse: 'EI JOVEM, ESSA AREA É RESTRITA'");
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
            Utils.escrever("1 - Dizer que o Alan é meu amigo\n2 - Pergunto o que está acontecendo");

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
                    "\n1 - Digo que o Alan é meu amigo\n2 - Digo que o Alan é meu irmão\n3 - Digo que o Alan é meu primo\n4 - Digo que moro perto e sou curioso");
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

        Utils.escrever("Senhor, o Alan é meu...");
        Utils.escrever(
                "De repente outro policial sai de dentro da casa visívelmente irritado, dizendo para o seu companheiro: 'Vamos embora, não tem nada aqui, isso foi uma viagem perdida'");
        interacaoComAlan();
    }

    private static void interacaoComAlan() {
        boolean saiu = false;

        Utils.escrever("Enquanto os policiais estão indo embora, vejo o Alan através de uma janela");
        while (!saiu) {
            Utils.escrever("1 - Ignoro ele, e vou para casa\n2 - Levanto a voz e pergunto o que houve");
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
                "Eu pego a vassoura, levo até ele, e me diz: 'Você me parece familiar, te conheço de algum lugar?'");
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
                    Utils.escrever(" Alan me diz: 'ah... então me diga qual seu nome?'");
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
                "Bom " + Jogador.GetNomeJogador() + " Muito obrigado por aquilo e obrigado pela vassoura.'");
        irParaCasa();

    }

    private static void irParaCasa() {
        try {
            Utils.escrever("Voltei para casa perplexo, porém decidi cuidar da minha vida.. ");
            Thread.sleep(2000);
            CenaDois.initCenaDois();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
