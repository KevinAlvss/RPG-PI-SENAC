import java.util.Scanner;
import Client.Menu;
public class initGame {

    static Scanner sc = new Scanner(System.in);
    public static class Jogador {
        public String nome;
    };

    static Jogador jogador = new Jogador();

    public static void main(String[] args) {
        Menu.menu();
    }

}
