package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.Menu;

public class CenaCinco {

    static Scanner sc = new Scanner(System.in);

    static double pontos;

    public static void initCenaCinco() {

        Utils.escrever(
                "\nApós mais ou menos uns 20 minutos, Alan começa a falar sobre a prova que iremos fazer... e assim q ele começa a falar uma mulher entra na sala, mas o guarda na porta não ah deixa entrar e sentar, mesmo ela dizendo que ela tinha recebido a carta, Alan vai até eles e pede para moça se sentar pera ele continuar a explicação da prova....\n"
                        + "\nEntão ele diz: “Senhores e senhora, vocês têm 6 minutos para completar as tarefas em sua frente”.\n"
                        + "\nAo terminar de passar as instruções começamos a fazer a prova.\n");

        Utils.escrever("\n1) Descubra a lógica e complete o próximo elemento:\n");

        Utils.escrever("\na) 1, 3, 5, 7...?\n");
        double respostaA = sc.nextDouble();

        if (respostaA == 9) {
            pontos += 1.5;
        }

        Utils.escrever("\nb) 2, 4, 8, 16, 32, 64...?\n");
        double respostaB = sc.nextDouble();

        if (respostaB == 128) {
            pontos += 1.5;
        }

        Utils.escrever("\nc) 0, 1, 4, 9, 16, 25, 36...?\n");
        double respostaC = sc.nextDouble();

        if (respostaC == 49) {
            pontos += 1.5;
        }

        Utils.escrever("\nd) 4, 16, 36, 64...?\n");
        double respostaD = sc.nextDouble();

        if (respostaD == 100) {
            pontos += 1.5;
        }

        Utils.escrever(
                "\n2) Jogar baralho é uma atividade que estimula o raciocínio. Um jogo tradicional é a Paciência, que utiliza 52 cartas. Inicialmente são formadas sete colunas com as cartas. A primeira coluna tem uma carta, a segunda tem duas cartas, a terceira tem três cartas, a quarta tem quatro cartas, e assim sucessivamente até a sétima coluna, a qual tem sete cartas, e o que sobra forma o monte, que são as cartas não utilizadas nas colunas.\n"
                        + "\nA quantidade de cartas que forma o monte é:\n");

        Utils.escrever("a) 21");
        Utils.escrever("b) 24");
        Utils.escrever("c) 26");
        Utils.escrever("d) 28");
        Utils.escrever("e) 31");
        String respostaE = sc.next();

        if (respostaE.equals("b")) {
            pontos += 1.5;
        }

        Utils.escrever(
                "\n3) Duas tartarugas estavam juntas e começaram a caminhar em linha reta em direção a um lago distante. A primeira tartaruga percorreu 30 metros por dia e demorou 16 dias para chegar ao lago. A segunda tartaruga só conseguiu percorrer 20 metros por dia e, portanto, chegou ao lago alguns dias depois da primeira. Quando a primeira tartaruga chegou ao lago, o número de dias que ela teve que esperar para a segunda tartaruga chegar foi:\n");

        Utils.escrever("a) 8");
        Utils.escrever("b) 9");
        Utils.escrever("c) 10");
        Utils.escrever("d) 12");
        Utils.escrever("e) 15");
        String respostaF = sc.next();

        if (respostaF.equals("a")) {
            pontos += 1.5;
        }

        Utils.escrever(
                "\n4) Alguns consideram que a cidade de Florianópolis foi fundada no dia 23 de março de 1726, que caiu em um sábado. Após 90 dias, no dia 21 de junho, a data assinalou o início do inverno, quando a noite é a mais longa do ano. Esse dia caiu em uma:\n");

        Utils.escrever("a) segunda-feira");
        Utils.escrever("b) terça-feira");
        Utils.escrever("c) quarta-feira");
        Utils.escrever("d) quinta-feira");
        Utils.escrever("e) sexta-feira ");
        String respostaG = sc.next();

        if (respostaG.equals("e")) {
            pontos += 1.5;
        }

        resultado();

    }

    private static void resultado() {

        Utils.escrever(
                "\nEntão no momento que vou levantar a mão para entregar a prova, a moça que chegou atrasada levanta a mão e diz que já terminou, junto com ela eu levanto a mão e nós entregamos a prova e ficamos e nossos lugares esperando.\n"
                        + "\nApós 6 minutos de prova, Alan dispensa a todos e diz para os que entregaram a prova, para esperar 10 min... após esse tempo ele aparece na porta e diz agora vamos os aprovados, éramos em 5 na esper a\n");

        if (pontos >= 6) {
            aprovado();
            CenaSeis.initCenaSeis();
        } else {
            reprovado();
        }
    }

    private static void aprovado() {

        Utils.escrever("\nEle chama a 1° pessoa\n"
                + "\n Joan Clarke....\n"
                + "\na segunda pessoa\n"
                + "\nJack Good\n"
                + "\nE antes de chamar a terceira ele diz “Bom não estávamos esperando 3 pessoas mas como foram ótimos resultados\n"
                + "\nparabéns" + Jogador.GetNomeJogador() + "você ficou com a vaga extra\n");

        Utils.escrever(
                "\nEntão Alan nos chama para dentro da sala novamente e explica, e antes que Alan comece a dizer algo um rapaz chamado Sr.Stewart nos diz “Meus parabéns sejam bem vindos ao serviço de vossa majestade...Se falarem qualquer coisa que eu dizer aqui, serão executados por traição, mentiram para amigos, família e para qualquer um sobre o que fazem”\n "
                        + "\nJoan pergunta: “e o que vamos fazer?”\n"
                        + "\nAlan nos diz:\n"
                        + "\nVamos quebrar um código nazista inquebrável e vencer a guerra, existe uma máquina alemã chamada enigma, aonde ela manda mensagens criptografadas todos os dias para a suas tropas, nós conseguimos a interceptá-las e até temos um exemplar na máquina, porém o problema é essa criptografia tem uma chave que muda todo dia, então mesmo que nós conseguiremos decifra-las nós não teríamos tempo para avisar aos aliando antes que eles mudassem a chave novamente, então nossa missão e descobrir como obter essa chave\n");
    }

    private static void reprovado() {

        Utils.escrever("\nEle chama a 1° pessoa \n"
                + "\nJoan Clarke....\n"
                + "\na segunda pessoa \n"
                + "\nJack Good\n"
                + "\ne por fim Alan diz\n"
                + "\nparabéns aos que chegaram até aqui, mas não iremos precisar de  vossos serviços, muito obrigado pela colaboração\n");

        Utils.escrever(
                "\nInfelizmente eu não passei na prova, e estava perdido, não sabia mais o que fazer e nem o que pensar, então minha única saída para ajudar meu pais era me alistar no exército....\n");

        Utils.escrever("Fim de jogo.");

        Menu.exibir();
    }

}
