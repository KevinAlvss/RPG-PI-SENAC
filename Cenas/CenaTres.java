package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.FimDeJogo;

public class CenaTres {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaTres() {
        Utils.escrever("3°CENA");
        Utils.escrever(
                "Acordo com o sol batendo na janela, depois de uma longa noite pensando em tudo que aconteceu, olho para o relógio....... A meu Deus estou atrasado!!!!");
        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Passo na padaria para comer algo.\n2 - Corro para o trabalho.");

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
                "Atrasado sim, com fome nunca... a caminho da padaria, um garoto passa por mim com jornais, notas diárias da guerra,  economia... Comprei um para ler enquanto comia. Pedi o de sempre, ovos com bacon e um suco de laranja, quando derrepente algo me prende a atenção naquele jornal. Um anúncio sobre um emprego que dizia ``Cansado de seu emprego medíocre? Se você conseguir resolver essas palavras cruzadas em menos de 10 minutos achará a chave para o proximo passo.... uma grande oportunidade te espera do outro lado.´´.");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever(
                    "1 - Fazer a cruzadinha\n2 - Ignorar e continuar a ler o jornal.");

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
                "Enquanto esperava minha comida, em menos de 10 minutos já estava feito. Um número de telefone em meio as palavras .....");

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
                "Já não suportava mais meu emprego, porque não tentar algo novo? Liguei! no terceiro toque, uma voz seriamente fria diz: ´´Bom dia! Fez uma boa escolha, vamos começar.`` dentre perguntas logicas e pessoais que me fez, termina dizendo´´ Se em 5 dias não receber uma carta, não entre mais em contato");

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
        Utils.escrever(
                "Saio com pressa, corro para atravessar a rua, um som muito estridente de uma ambulância se aproxima em minha direção, quando me dei conta do que estava acontecendo ..... Era tarde de mais para fujir");
        Utils.escrever("Descanse em paz, Game Over! \n\n");

        FimDeJogo.creditosFimDeJogo();
    }
}
