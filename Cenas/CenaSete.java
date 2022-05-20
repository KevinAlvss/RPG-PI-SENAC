package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.*;

public class CenaSete {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaSete() {

        Utils.escrever(
                "No dia seguinte voltamos para continuar nosso trabalho de sempre ... chegando la vejo o Comandante Denniston na porta de nossa sala acompanhado de dois soldados");
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
                "Questiono sobre o que  está acontecendo...  ele me diz, ontem o pessoal da inteligencia interceptou uma mensagem saída daqui que foi direcionada de Moscou, e acreditamos fortemente que o colega de vocês Alan Turing seja um espião um soviético");

        naoDizerNada();
    }

    private static void naoDizerNada() {
        Utils.escrever(
                " ele entra  começa a revirar as coisas de Alan, Alan chega totalmente confuso com o que estava vendo e o comandante lhe diz que ele está em busca de provas que Turing é um agente soviético porem não encontra nada relevante e sai.\n\n"
                        + "*Dois dias depois*\n horas e mais horas se passam, e eu ja vou ficando sem esperança de fazermos algum avanço... levanto e vou dar uma volta pela sala para espairecer, olho para mesa de Alan e vejo alguns papeis encima da mesa.");

        boolean saiu = false;

        while (!saiu) {
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

        while (!saiu) {
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
                "Como ja não é mais novidade eu tava com fome e fui comer com o pessoal, quase todos nós fomos comer, menos Hugh ele ficou na sala disse que estava terminando de fazer algumas coisas... vemos Hugh indo em direção ao galpão com a maquina de Alan, e vamos atrás dele, Hugh nos diz ``Bom.... não sou muito fã do Alan mas vou fazer isso pela Joan, depois de fazer alguns cálculos percebi que da para otimizar o espaço organizando os fios de uma maneira diferente´´.... vou la falar com ele");
        Utils.escrever(
                "Ele leva ate Alan e mostra pra ele sua ideia, Alan diz que pode funcionar então começamos a arrumar as coisas, Em 3 dias estava pronto, então Alan a ligou.... e ela começou a girar e girar e girar.... por muito tempo ele sempre dizia ``Vai funcionar, temos só que esperar um pouco´´... deixamos a maquina em paz e fomos tomar um café ela girava sem parar decidindo se funcionaria ou não...");
        irTomarCafe();
    }

    private static void analiseAsPlantas() {
        Utils.escrever(
                "Fico na sala, e continuo analisando os papeis e então me dou conta que com tantas conexões e com tantos cabos isso realmente não vai caber la dentro, vou no galpão verificar isso , chegando lá vejo a quantidade de fios jogados no chão, fiz uns cálculos para ver a área que os cabos e fusiveís iriam ocupar  ..os rapazes chegaram no exata momento que cheguei a uma conclusão, então eu disse a eles ``Pessoal eu estava vendo os esquemas da maquina de Alan e percebi que da pra otimizar o espaço da máquina.");
        Utils.escrever(
                "Vou ate Alan e digo o que descobri sobre os fios e ele me responde ``Ehh pode funcionar, vamos tentar´´, então eu, ele e joan vamos ate o galpão e começamos a arrumar as coisas, decidi pedir ajuda ao pessoal, meio relutantes com a ideia eles foram e todos nos começamos agilizar  o projeto de Alan, apos 3 dias... estava pronto, então Alan a ligou.... e ela começou a girar e girar e gira.... por muito tempo ele sempre dizia ``Vai funcionar, temos só que esperar um pouco´´... então decidimos ir tomar um café enquanto a maquina ficava girando os rotores sem parar...");
        irTomarCafe();
    }

    private static void irTomarCafe() {
        Utils.escrever("Estávamos tranquilos tomando cafe ate que escultamos uns barulhos vindos do galpão...");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Sugerir aos rapazes para irmos lá \n2 - Dizer que não é nada demais ");

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
                "John diz ``Sera que devemos ir olhar ?´´, então respondo: acho que deve ser apenas o Alan mexendo na maquina... escutamos mais batidas e gritaria, e hugh diz ``Pessoal acho melhor irmos lá ver oque está acontecendo...´´,hugh e os rapazes foram em direção ao galpão");

        boolean saiu = false;

        while (!saiu) {
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

        System.out.print("\nEu permaneço sentado em minha cadeira, Peter pergunta `` Ué, " + Jogador.GetNomeJogador()
                + " você não vai?´´");

        boolean saiu = false;

        while (!saiu) {
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
        Utils.escrever("Eu repondo que não, o Alan que se vire...., Eles foram ");
        Utils.escrever(
                "Mais tarde eles voltam e me contam o que aconteceu, o comandante disse que a maquina de alan era inutil, mas devido a resistência deles o comandante nos deu 1 mês para finalizar a maquina");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Apoiar o comandante\n2 - Apoiar o pessoal ");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    apoiarComandante();
                    saiu = true;
                    break;

                case "2":
                    Utils.escrever(
                            "Então digo ``Certo, conte comigo... nos vamos terminar essa maquina e fazer ela funcionar !!!´´\n\n");
                    CenaOito.initCenaOito();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void irComOsRapazes() {

        Utils.escrever(
                "Me levanto eu vou com o pessoal, chegando lá, nos encontramos uns soldados segurando Alan e o Comandante  demitindo Alan  por sua maquina ser inútil, então hugh diz `` se ele está demitido ...então eu estou fora´´ e todos o acompanham dizendo a mesma coisa");

        boolean saiu = false;

        while (!saiu) {
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
                "eu digo que concordo com o comandante, que a maquina é inútil e que estamos perdendo tempo.... então todos os rapazes me olham com um olhar de decepcão e dizem... então tudo bem... se você não tem fé no projeto , então não temos fé em você, pedimos encarecidamente que você se retire e vá para sua casa, como todos... fui ao meu dormitório, peguei minhas coisas e voltei para casa, sobre juramento de morte para nunca tocar no assunto..  ");
        Utils.escrever("Fim de Jogo");
        FimDeJogo.creditosFimDeJogo();
    }

    private static void apoiarHugh() {
        Utils.escrever(
                "Eu digo ``tmb estou fora... bom se ele sair todos nós vamos juntos, Mas boa sorte acho que vai ser dificil encontrar um time de gênios como o nosso´´, então o comandante nos olha com cara de deboche diz ...´´Então está certo... vocês tem um mês para me entregar essa maquina funcionando, caso contrario ...estão todos mortos´´... todos nós acenamos com a cabeça dizendo que sim... então ele vai embora, a tensão foi com ele todos soltamos um suspiro de alivio ");
        CenaOito.initCenaOito();
    }
}
