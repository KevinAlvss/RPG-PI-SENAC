package Client;

import java.util.Scanner;

public class Jogador {

    static Scanner sc = new Scanner(System.in);
    private static String nomeJogador;

    public static String GetNomeJogador() {
        if(nomeJogador == null || nomeJogador == "")
         nomeJogador = "jogador(a)";

        return nomeJogador;
    }

    public static void DefinirNomeJogador() {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        nomeJogador = nome;
    }

}
