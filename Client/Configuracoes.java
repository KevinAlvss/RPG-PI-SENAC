package Client;
import Utils.Utils;
import java.util.Scanner;


public class Configuracoes {
    private static int VelocidadeTexto = 50;
    static Scanner sc = new Scanner(System.in);

    private static void setVelocidadeDeTexto(int velocidade){
        VelocidadeTexto = velocidade;
    }
    public static int GetVelocidadeDeTexto(){
        return VelocidadeTexto;
    }

    public static void definirVelociade(){
        boolean saiu = false;
        
        while(!saiu){
            Utils.escrever("\n1 - Desligado\n2 - Devagar\n3 - Medio\n4 - Rapido\n");
            String decisao = sc.next();

            switch(decisao){
                case "1":
                        setVelocidadeDeTexto(0);
                        Utils.escrever("\nVelocidade definida\n");
                        saiu = true;
                    break;
                case "2":
                        setVelocidadeDeTexto(75);
                        Utils.escrever("\nVelocidade definida\n");
                        saiu = true;
                    break;
                case "3":
                        setVelocidadeDeTexto(45);
                        Utils.escrever("\nVelocidade definida\n");
                        saiu = true;
                    break;
                case "4":
                        setVelocidadeDeTexto(25);
                        Utils.escrever("\nVelocidade definida\n");
                        saiu = true;
                    break;
                default:
                    break;    
            }
        }
    
    }
    
}
