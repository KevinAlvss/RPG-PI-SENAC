package Cenas;

import java.util.Scanner;

import Client.Jogador;
import Utils.Utils;

public class CenaCinco {
    static Scanner sc = new Scanner(System.in);

    public static void initCenaCinco() {
        Utils.escrever(
                "Apos mais ou menos uns 20 minutos , Alan começa a falar sobre a prova que iremos fazer... e assim q ele começa a falar uma mulher entra na sala , mas o guarda na porta não ah deixa entrar e sentar , mesmo ela dizendo que ela tinha recebido a carta, Alan vai ate eles e pede para moça se sentar pera ele continuar a explicação da prova....+\n+Então ele diz 'Senhores e senhora vocês tem 6 minutos para completar as tarefas em sua frente' +\n + Ao terminar de passar as instruções começamos a fazer a prova");

        double nota = prova();
        Utils.escrever(
                "Então no memento que vou levantar a mão para entregar a prova , a moça que chegou atrasada  levanta a mão e diz que já terminou, junto com ela eu levanto a mão  e nos entregamos a prova e ficamos e nossos lugares esperando");
        Utils.escrever(
                "após 6 min de prova , Alan dispensa a todos e diz para os que entregaram a prova , para esperar 10 min... após esse tempo ele aparece na porta e diz agora vamos os aprovados,  éramos em 5 na espera ");

        if (nota >= 7.5) {
            aprovado();
        } else {
            reprovado();
        }
    }

    public static double prova() {

        double pontuacao = 0;

        Utils.escrever("Descubra a lógica e complete o próximo elemento:");
        Utils.escrever("a) 1, 3, 5, 7, ___"); // 9
        Utils.escrever("Insira a resposta: ");
        double respostaA = sc.nextDouble();
        if (respostaA == 9)
            pontuacao += 2.5;

        Utils.escrever("b) 2, 4, 8, 16, 32, 64, ____"); // 128
        Utils.escrever("Insira a resposta: ");
        double respostaB = sc.nextDouble();
        if (respostaB == 128)
            pontuacao += 2.5;

        Utils.escrever("c) 0, 1, 4, 9, 16, 25, 36,____");// 49
        Utils.escrever("Insira a resposta: ");
        double respostaC = sc.nextDouble();
        if (respostaC == 49)
            pontuacao += 2.5;

        Utils.escrever("d) 4, 16, 36, 64,____");// 100
        Utils.escrever("Insira a resposta: ");
        double respostaD = sc.nextDouble();
        if (respostaD == 100)
            pontuacao += 2.5;

        return pontuacao;
    }

    public static void aprovado() {
        Utils.escrever("Ele chama a 1° pessoa"
                + "\n" + "Joan Clarke...."
                + "\n" + "a segunda pessoa"
                + "\n" + "Jack Good"
                + "\n"
                + "E antes de chamar a terceira ele diz 'Bom não estávamos esperando 3 pessoas mas como foram ótimos resultados'"
                + "\n" + "parabéns" + Jogador.GetNomeJogador() + "você ficou com a vaga extra");

        Utils.escrever(
                "Então Alan nos chama para dentro da sala novamente e explica, e antes que Alan comesse a dizer algo um rapaz chamado Sr.Stewart nos diz ‘Meus parabéns sejam bem vindos ao serviço de vossa majestade...Se falarem qualquer coisa q eu dizer aqui , serão executados por traição, mentirão para amigos, família e para qualquer um sobre oque fazem’Joan pergunta 'e o que vamos fazer?''Alan nos diz, ‘Vamos quebrar um código nazista inquebrável e vencer a guerra, existe uma maquina alemã chamada enigma , aonde ela manda mensagens criptografadas todos os dias para a suas tropas, nos conseguimos a interceptá-las e ate temos um exemplar na maquina, porem o problema é essa criptografia tem uma chave que muda todo dia , então mesmo que nos conseguiremos desifra-las nos não teríamos tempo para avisar aos aliando antes que eles mudassem a chave  novamente, então nossa missão e descobrir como obter essa chave ‘");
        CenaSeis.initCenaSeis();
    }

    public static void reprovado() {
        Utils.escrever("Ele chama a 1° pessoa"
                + "\n" + "Joan Clarke...."
                + "\n" + "a segunda pessoa"
                + "\n" + "Jack Good"
                + "\n" + "e por fim Alan diz"
                + "\n"
                + "‘parabéns aos que chegaram ate aqui mas não iremos precisar de  vossos serviços, muito obrigado pela colaboração’");

        Utils.escrever(
                "Infelizmente eu não passei na prova, e estava perdido , não sabia mais oque fazer nem oque pensar , então minha unica saída para ajudar meu pais era me alistar no exercito....");
    }
}
