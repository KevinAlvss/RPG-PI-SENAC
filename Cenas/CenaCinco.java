package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.FimDeJogo;

public class CenaCinco {

    static Scanner sc = new Scanner(System.in);

    static double pontos;
    static double resposta;
    static String respostaEscolha;

    public static void initCenaCinco() {
        Utils.escrever("5°CENA");

        Utils.escrever(
                "\n Em seguida vira-se para nos e começa a falar sobre a prova que iremos fazer, quando foi interrompindo por uma mulher que gritava na porta ´´Eu também recebi a carta deixe me entrar `` O guarda tenta a imperdir, até que Alan vai na porta permitindo que a mesma também participasse e continuou....\n"
                        + "\n ``Senhores e senhora, vocês têm 6 minutos para completar as tarefas em sua frente, 5 questoes, 2 pontos cada, vocês precisam no monimo de 9 pontos para passar...´´.\n"
                        + "\nAo terminar de passar as instruções começamos a fazer a prova.\n");

        Utils.escrever("\n1) Descubra a lógica e complete o próximo elemento:\n");

        Utils.escrever("\na) 1, 3, 5, 7...?\n");
        resposta = sc.nextDouble();

        if (resposta == 9) {
            pontos += 0.5;
        }

        Utils.escrever("\nb) 2, 4, 8, 16, 32, 64...?\n");
        resposta = sc.nextDouble();

        if (resposta == 128) {
            pontos += 0.5;
        }

        Utils.escrever("\nc) 0, 1, 4, 9, 16, 25, 36...?\n");
        resposta = sc.nextDouble();

        if (resposta == 49) {
            pontos += 0.5;
        }

        Utils.escrever("\nd) 4, 16, 36, 64...?\n");
        resposta = sc.nextDouble();

        if (resposta == 100) {
            pontos += 0.5;
        }

        Utils.escrever(
                "\n2) Jogar baralho é uma atividade que estimula o raciocínio. Um jogo tradicional é a Paciência, que utiliza 52 cartas. Inicialmente são formadas sete colunas com as cartas. A primeira coluna tem uma carta, a segunda tem duas cartas, a terceira tem três cartas, a quarta tem quatro cartas, e assim sucessivamente até a sétima coluna, a qual tem sete cartas, e o que sobra forma o monte, que são as cartas não utilizadas nas colunas.\n"
                        + "\nA quantidade de cartas que forma o monte é:\n");

        Utils.escrever("a) 21\nb) 24\nc) 26\nd) 28\ne) 31");

        respostaEscolha = sc.next();

        if (respostaEscolha.equals("b") || respostaEscolha.equals("B")) {
            pontos += 2;
        }

        Utils.escrever(
                "\n3) Duas tartarugas estavam juntas e começaram a caminhar em linha reta em direção a um lago distante. A primeira tartaruga percorreu 30 metros por dia e demorou 16 dias para chegar ao lago. A segunda tartaruga só conseguiu percorrer 20 metros por dia e, portanto, chegou ao lago alguns dias depois da primeira. Quando a primeira tartaruga chegou ao lago, o número de dias que ela teve que esperar para a segunda tartaruga chegar foi:\n");

        Utils.escrever("a) 8\nb) 9\nc) 10\nd) 12\ne) 15");
        respostaEscolha = sc.next();

        if (respostaEscolha.equals("a") || respostaEscolha.equals("A")) {
            pontos += 2;
        }

        Utils.escrever(
                "4)Duas tartarugas estavam juntas e começaram a caminhar em linha reta em direção a um lago distante. A primeira tartaruga percorreu 30 metros por dia e demorou 16 dias para chegar ao lago. A segunda tartaruga só conseguiu percorrer 20 metros por dia e, portanto, chegou ao lago alguns dias depois da primeira. Quando a primeira tartaruga chegou ao lago, o número de dias que ela teve que esperar para a segunda tartaruga chegar foi:");

        Utils.escrever("a) 8\nb) 10\nc) 9\nd) 12\ne) 15");
        respostaEscolha = sc.next();

        if (respostaEscolha.equals("a") || respostaEscolha.equals("A")) {
            pontos += 2;
        }

        Utils.escrever(
                "\n5) Alguns consideram que a cidade de Florianópolis foi fundada no dia 23 de março de 1726, que caiu em um sábado. Após 90 dias, no dia 21 de junho, a data assinalou o início do inverno, quando a noite é a mais longa do ano. Esse dia caiu em uma:\n");

        Utils.escrever("a) segunda-feira\nb) terça-feira\nc) quarta-feira\nd) quinta-feira\ne) sexta-feira ");
        respostaEscolha = sc.next();

        if (respostaEscolha.equals("e") || respostaEscolha.equals("E")) {
            pontos += 2;
        }

        resultado();

    }

    private static void resultado() {

        Utils.escrever(
                "\n Acabei Levanto a mão para entregar a prova, a moça que chegou atrasada levanta junto a mim, e nós entregamos a prova retornando aos nossos lugares\n"
                        + "\nApós 6 minutos, Alan dispensa a todos, os cinco que restaram pede que aguarde o resultado \n");

        if (pontos >= 9) {
            aprovado();
            CenaSeis.initCenaSeis();
        } else {
            reprovado();
        }
    }

    private static void aprovado() {

        Utils.escrever(
                "\n 1° Lugar Joan Clarke \n"
                        + "\n\n"
                        + "\n2° Jack Good\n"
                        + "\nE antes de chamar a terceira ele diz ``Bom não estávamos esperando 3 pessoas\n"
                        + "\nparabéns " + Jogador.GetNomeJogador() + " com a nota " + pontos
                        + ", a vaga que não existia agora é sua\n");

        Utils.escrever(
                "\nEntão Alan nos chama para dentro da sala novamente e explica, antes que Alan comece a dizer algo um rapaz chamado Sr.Stewart nos diz ``Meus parabéns sejam bem vindos ao serviço de vossa majestade...Se falarem qualquer coisa que eu dizer aqui, serão executados por traição, mentiram para amigos, família e para qualquer um sobre o que fazem´´\n "
                        + "\nJoan pergunta: ``e o que vamos fazer?´´\n"
                        + "\nAlan nos diz:\n"

                        + "\nTemos que decifrar um código nazista indecifravel que pode nos ajudar vencer a guerra, existe uma máquina alemã chamada enigma, aonde ha troca de mensagens criptografadas todos os dias para a suas tropas, nós conseguimos interceptá-las, até temos um exemplar da máquina, porém o problema é a criptografia. Tem uma chave que muda todo dia, então mesmo que nós consigamos decifra-las não teríamos tempo para avisar aos aliados antes que eles mudassem a chave novamente, então nossa missão é descobrir como obter essa chave\n");

        CenaSeis.initCenaSeis();
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
        FimDeJogo.creditosFimDeJogo();
    }

}
