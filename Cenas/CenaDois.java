package Cenas;

import java.util.Scanner;
import Utils.Utils;

public class CenaDois {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaDois() {
        System.out.println("\nUma semana depois...\n");
        Utils.escrever(
                "Após mais um dia de trabalho eu decido ir dormir... zzz... zzz... zzz... E percebo que estou sonhando com o dia em que conheci o Alan. Eu estava sentado no refeitório da escola junto com o meu primo Christopher e vejo um garoto separando os alimentos por cores... O Christopher então, decide ir ao patio, quando de repente 5 garotos jogam o prato de comida de Alan para cima e começam a zombar com ele.");
        Utils.escrever(
                "Alan decide sair correndo para se livrar dos agressores");

        boolean saiu = false;

        while (!saiu) {

            System.out.println("\n1 - Corro atrás dos agressores para ajudar Alan\n2 - Não faço nada\n");

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

    public static void corroAtrasDosAgressores() {
        Utils.escrever(
                "Eu persigo eles até pararem em uma sala e começarem a bater nele");
        chamarChristopher();
    }

    public static void naoFacoNada() {
        Utils.escrever(
                "O sinal do intervalo bate e vou para minha sala e vejo os agressores batendo no Alan");
        chamarChristopher();
    }

    public static void chamarChristopher() {
        System.out.println("\n1 - Chamar Christopher.\n");

        String decisao = sc.next();

        switch (decisao) {
            case "1":
                Utils.escrever(
                        "O Christopher chega e bate nos agressores e salva Alan");
                Utils.escrever(
                        "Percebo que acordo assustado com tudo que sonhei");
            default:
                break;
        }

        CenaTres.initCenaTres();

    }
}