package Utils;

import Client.*;

public class Utils {
    public static void reticencias(int qntPontinhos) {
        try {
            for (int i = 0; i < qntPontinhos; i++) {
                Thread.sleep(700);
                System.out.print(".");
                Thread.sleep(700);
            }
            System.out.print("\n");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void escrever(String conteudo) {
        try {
            System.out.print("\n");
            for (int i = 0; i < conteudo.length(); i++) {
                Thread.sleep(0);
                System.out.print(conteudo.charAt(i));
            }
            System.out.print("\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void escreverNaoPular(String conteudo) {
        try {
            for (int i = 0; i < conteudo.length(); i++) {
                Thread.sleep(Configuracoes.GetVelocidadeDeTexto());
                System.out.print(conteudo.charAt(i));
            }
            System.out.print("\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
