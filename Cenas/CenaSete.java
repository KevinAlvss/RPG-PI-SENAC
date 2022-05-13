package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.*;

public class CenaSete {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaSete() {

        Utils.escrever(
                "No dia seguinte fomos ao nosso escritório para começar nosso trabalho de sempre ... porem quando chegamos lá nós nos encostramos com   o Comandante Denniston na porta de nossa sala acompanhado 2 dois soldados");
        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Perguntar oque está acontecendo\n2 - Não dizer nada ");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    perguntarOqueEstaAcontecendo();
                    saiu = true;
                    break;

                case "2":
                    naoDizerNada();
                    saiu = true;
                    break;
                default:
                    break;
            }

        }
    }

    private static void perguntarOqueEstaAcontecendo() {
        Utils.escrever(
                "Ao ver o comandante lá eu descido questioná-lo sobre oque  está acontecendo... e então ele me diz , ontem o pessoal da inteligencia interceptou uma mensagem saída daqui que foi direcionada direto a Moscou, e acreditamos fortemente que o colega de vocês Alan Turing seja um espião um soviético");
        naoDizerNada();
    }

    private static void naoDizerNada() {
        Utils.escrever(
                " ele entra  começa a revirar as coisas de Alan, quando Alan chega ele questiona o oque esta acontecendo e o comandante lhe diz que ele está em busca de provas que Alan é um agente soviético porem não encontra nada relevante, apos isso com o clima meio pesado nos começamos a trabalhar....");
        Utils.escrever(
                "*Dois dias depois *\nApos horas e mais horas , dias e mais dias , eu ja vou ficando sem esperança de fazermos algum avanço... como estou de cebeça cheia, então deicido dar um volta pela sala, e olho para mesa de Alan e vejo alguns papeis encima da mesa.");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - Decido ir olhar os papeis\n2 - Continuar andando ");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    decidoIrOlhar();
                    saiu = true;
                    break;

                case "2":
                    continuarAndandoOuIrComEles();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }

    }

    private static void decidoIrOlhar() {
        Utils.escrever("Vou ate a mesa de Alan e olho os papeis, eram da maquina de turing ");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - Analisar as plantas da maquina\n2 - Continuar andando ");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    analiseAsPlantas();
                    saiu = true;
                    break;

                case "2":
                    continuarAndandoOuIrComEles();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }

    }

    private static void continuarAndandoOuIrComEles() {
        Utils.escrever(
                "Eu  estava com fome então decidi ir comer com o pessoal, quase todos fomos comer menos Hugh ele ficou na sala, disse que estava terminando de fazer algumas coisas... um tempinho se passa e vemos Hugh indo em direção ao galpão com a maquina de Alan, alguns minutos depois vemos ele voltando para  nossa sala... e mais uns minutos depois nos voltamos para nossa sala e Hugh nos dis “Bom.... não sou muito fã do Alan mas vou fazer isso pelo Joan, eu fiz alguns cálculos e percebi que da para otimizar o espaço organizando os fios de uma maneira diferente”.... vou la falar com ele ");
        Utils.escrever(
                "Ele leva ate Alan e mostra pra ele , Alan diz que pode funcionar então ele, Alan e Joan vão ate o galpão e começamos a arrumar as coias, eram muitos fios parar arrumar então Hugh foi nos pedir ajuda, meio relutantes com a ideia nos fomos e todos nos começamos agilizar  o projeto de Alan, apos 3 dias... estava pronto, então Alan a ligou.... e ela começou a girar e girar e gira.... por muito tempo ele sempre dizia “Vai funcionar, temos só que esperar um pouco”... então decidimos ir tomar um café enquanto a maquina ficava girando os rotores sem parar...");
        irTomarCafe();
    }

    private static void analiseAsPlantas() {
        Utils.escrever(
                "Fico na sala , e continuo analisando os papeis e então me dou conta que com tantas conexões e com tantos cabos isso realmente não vai caber la dentro, então eu decido ir lá no galpão verificar isso , chegando lá vejo a quantidade de fios jogados no chão,  apos ver isso volto nossa sala para fazer uns cálculos, como já es medidas já estavam na plantas não precisei medir nada.... alguns minutos se passaram, fiz alguns cálculos para ver a área que os cabos iriam ocupar e que os fusíveis iam ocupar , com a quantidade de cabos que tinha iria ficar difícil de todos os fuzileis caberem lá... mais alguns minutos se passaram e os rapazes chegaram no exstamo momento que cheguei a uma conclusão, então eu disse a eles “Pessoal eu estava vendo os esquemas da maquina de Alan e percebi que ” ");
        Utils.escrever(
                "Vou a ate alan e digo oque descobri sobre os fios e ele me responde “Ehh pode funcionar, vamos tentar”, então eu ele e joan vamos ate o galpão e começamos a arrumar as coias, eram muitos fios parar arrumar então decidi pedir ajuda ao pessoal, meio relutantes com a ideia eles foram e todos nos começamos agilizar  o projeto de Alan, apos 3 dias... estava pronto, então Alan a ligou.... e ela começou a girar e girar e gira.... por muito tempo ele sempre dizia “Vai funcionar, temos só que esperar um pouco”... então decidimos ir tomar um café enquanto a maquina ficava girando os rotores sem parar...");
        irTomarCafe();
    }

    private static void irTomarCafe() {
        Utils.escrever("Estávamos tranquilos tomando cafe ate q escutamos uns barulhos vindos do galpão...");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - Dizer que não é nada de mais \n2 - Sugerir aos rapazes para irmos lá  o ");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irComOsRapazes();
                    saiu = true;
                    break;

                case "2":
                    naoIrComOsRapazes();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void naoIrComOsRapazes() {

        Utils.escrever(
                "John diz “Sera que devemos ir olhar ?”, então respondo não, acho que deve ser apenas o Alan mexendo na maquina... escutamos mais batidas e gritaria, e hugh diz “Pessoal acho melhor irmos lá ver oque está acontecendo...”,hugh e os rapazes foram em direção ao galpão");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - ir junto\n2 - Não ir");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irComOsRapazes();
                    saiu = true;
                    break;

                case "2":
                    naoIrComOsRapazesDois();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }

    }

    private static void naoIrComOsRapazesDois() {

        System.out.print("\nEu permaneço sentado em minha cadeira,Peter pergunta “ue," + Jogador.GetNomeJogador()
                + " você não vai?”");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - ir junto\n2 - Não ir");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irComOsRapazes();
                    saiu = true;
                    break;

                case "2":
                    naoIrDois();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }

    }

    private static void naoIrDois() {
        Utils.escrever("Eu repondo não pessoal, o Alan que se vire lá...., então eles foram ");
        Utils.escrever(
                "Um tempo mais tarde eles voltam e me dizem oque aconteceu, e me falam oque havia acontece , que o comandante disse que a maquina de alan era inutil , mas devido a resistência deles o comandante nos deu 1 mês para finalizar a maquina");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - Apoiar o comandante\n2 - Apoiar o pessoal ");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    apoiarComandante();
                    saiu = true;
                    break;

                case "2":
                    Utils.escrever(
                            "então eu digo “Certo,conte comigo... nos vamos terminar essa maquina e fazer ela funcionar !!!”");
                    apoiarHugh();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void irComOsRapazes() {

        Utils.escrever(
                "Me levanto eu vou com o pessoal, chegando lá, nos encontramos uns soldados segurando Alan e o comandante   falando que Alan está demitido por sua maquina ser inútil, então hugh diz “ se ele está demitido ...então eu estou fora” e todos o acompanham dizendo a mesma coisa");

        boolean saiu = false;

        while (saiu) {
            Utils.escrever("1 - Apoiar o comandante\n2 - Apoiar Hugh ");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    apoiarComandante();
                    saiu = true;
                    break;

                case "2":
                    apoiarHugh();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void apoiarComandante() {
        Utils.escrever(
                "eu digo que concordo com o comandante, que a maquina é inútil e que estamos perdendo tempo.... então todos os rapazes me olham com um olhar de decepcionado e dizem... então tudo bem... se você não tem fé no projeto , então não temos fé em você também, pedimos encarecidamente que você se retire e vá para sua casa, como todos... estevam de acordo com isso eu apenas aceitei...fui ao meu dormitório, peguei minhas coisas e voltei parar cara...  ");
        Utils.escrever("Fim de Jogo");
        Opcoes.creditos();
    }

    private static void apoiarHugh() {
        Utils.escrever(
                "Eu digo  eu “tmb estou fora... bom se ele sair todos nós vamos juntos, você ira demitir todos nós, sabendo que você nunca vai encontrar um time de gênios q nem o nosso?”, então o comandante olha para nos com cara de bravo e diz ...”Então está certo... vocês tem um mês para me entregar essa maquina funcionando, caso contrario ...estão todos demitidos”... todos nós acenamos com a cabeça dizendo que sim... então ele vai em bora, e como se tivéssemos  ensaiado todos soltamos um suspiro de alivio ");
        CenaOito.initCenaOito();
    }
}
