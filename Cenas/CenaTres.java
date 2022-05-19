package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.FimDeJogo;
public class CenaTres {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaTres() {
        Utils.escrever("3°CENA");
        Utils.escrever(
                "Após o sonho que eu nem chamaria de sonho e sim de flashback, nossa eu nem lembrava do que tinha acontecido aquele dia, mas bom tenho que fazer minhas coisas. Eu me levanto e vou fazer minha rotina matinal, escovo os dentes, tomo um banho, troco de roupa e vou a cozinha para tomar um café da manhã, porém quando chego na cozinha percebo que não tinha quase nada para comer, eu não havia feito compras essa semana pois o dinheiro estava curto. Percebo que tambem estou muito atrasado para o trabalho.");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Vou a padaria comer algo.\n2 - Vou correndo rapidamente ao trabalho.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    comprarJornal();
                    saiu = true;
                    break;
                case "2":
                    sairComPressa();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void comprarJornal() {
        Utils.escrever(
                "Após ir em direção a padaria vejo um garoto com alguns jornais com notas diárias da guerra e economia, e então comprei um para ler enquanto comia. Chegando a padaria eu peço o de sempre, ovos com bacon e um suco de laranja, após a garçonete levar meu pedido a cozinha eu começo a ler o jornal e me deparo com um anúncio sobre um emprego aonde dizia ``Se você conseguir resolver essas palavras cruzadas em menos de 10 minutos ligue para ..... para uma ótima oportunidade de emprego´´.");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Decido fazer a cruzadinha\n2 - Ignoro e leio o jornal.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    testeCruzadinha();
                    saiu = true;
                    break;
                case "2":
                    sairComPressa();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void testeCruzadinha() {
        Utils.escrever(
                "Então enquanto eu esperava minha comida eu fazia a cruzadinha..... em menos de 10 minutos já estava feito.....");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Ligo para o número.\n2 - Não ligo para o número.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    ligacaoTeste();
                    saiu = true;
                    break;
                case "2":
                    naoLigarParaNumero();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void ligacaoTeste() {
        Utils.escrever(
                "Como eu consegui realizar o feito de de fazer a cruzadinha em menos de 10 minutos e também já estava saturado de meu emprego eu decidi me entregar para oportunidade então liguei para o número.... Uma moça me atendeu e disse que ainda não poderia me passar muitas informações sobre a vaga e me disse que aquela já seria uma fase do processo, ela me fez várias perguntas pessoais, algumas perguntas de lógica e por fim meus dados pessoais para que possam entrar em contato e antes de desligar ela me disse que, se eu não recebesse nenhuma carta em 5 dias era para desconsiderar a ligação... Então sigo em direção ao trabalho, porém não estava com vontade alguma de ir, penso em acelerar um pouco o passo quando escuto o som de uma ambulância chegando cada vez mais perto e em questão de segundos ela passa em minha frente em uma velocidade extremamente rápida, talvez isso tenha sido  uma sinal par ir com calma. Então desisto da idéia de chegar a tempo no trabalho e vou andando com calma.....");

        CenaQuatro.initCenaQuatro();

    }

    private static void naoLigarParaNumero() {
        Utils.escrever(
                "Li o jornal inteiro, e nada da minha comida chegar, e quando olho para o relógio da parede perto da cozinha eu estou muitíssimo atrasado para o trabalho, porém vejo que minha comida esta chegando.");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Desisto da idéia de chegar a tempo ao trabalho e decido ligar para o número.\n2 - Saio correndo.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    ligacaoTeste();
                    saiu = true;
                    break;
                case "2":
                    sairComPressa();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void sairComPressa() {
        Utils.escrever("Saio com pressa, vou correndo em direção ao outro lado da rua e como estava com muita pressa não olho para os lados. Sem prestar atenção no ambiente algo me chama atenção, um som muito estridente de uma ambulância vindo em minha direção e quando me dei conta do que estava acontecendo ..... já era tarde de mais para fujir");
        Utils.escrever("Fim de jogo.");

        FimDeJogo.creditosFimDeJogo();    
    }
}
