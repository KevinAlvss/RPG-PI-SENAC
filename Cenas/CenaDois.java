package Cenas;

import java.util.Scanner;
import Utils.Utils;

public class CenaDois {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaDois() {
        Utils.escrever("Uma semana depois...");
        Utils.escrever(
                "Depois de um dia de trabalho,  descansando em minha cama me pego pensando no dia em que conheci o Alan. Eu estava sentado no refeitório da escola junto com o meu primo Christopher e vejo um garoto separando os alimentos por cores...  Christopher então, decide ir ao patio, quando de repente 5 garotos jogam o prato de comida de Alan para cima e começam a zombar dele.");
        Utils.escrever(
                "Alan sai correndo para se livrar dos valentões");

        boolean saiu = false;

        while (!saiu) {

            Utils.escrever("1 - Corro atrás dos garotos para ajudar Alan\n2 - Não faço nada");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    corroAtrasDosAgressores();
                    saiu = true;
                    break;
                case "2":
                    naoFacoNada();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void corroAtrasDosAgressores() {
        Utils.escrever(
                "Persigo eles até que param em uma sala e começam a bater nele");
        chamarChristopher();
    }

    private static void naoFacoNada() {
        Utils.escrever(
                "O sinal do intervalo bate e vou para minha sala e vejo os agressores batendo no Alan");
        chamarChristopher();
    }

    private static void chamarChristopher() {
        Utils.escrever("1 - Chamar Christopher.");

        String decisao = sc.next();

        switch (decisao) {
            case "1":
                Utils.escrever(
                        "O Christopher chega e chuta os Valentões pra longe salvando Alan");
                Utils.escrever(
                        "Por um piscar de olhos volto daquele flashback e pego no sono..");
            default:
                break;
        }

        CenaTres.initCenaTres();

    }
}