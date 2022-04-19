package Client;
import java.util.Scanner;


public class Jogador {

    static Scanner sc = new Scanner(System.in);
    private static String nomeJogador;
    

    public static String GetNomeJogador(){
        return nomeJogador;
    }

    public static void DefinirNomeJogador(){
        String nome = sc.nextLine();
        nomeJogador = nome;

    }
    
}
