package Cenas;

import java.util.Scanner;

public class CenaUm {

    static Scanner sc = new Scanner(System.in);

    public static void init() {
        System.out.println(
                "\nEu sou apenas um jovem e o mundo já está em guerra, e não é uma guerra qualquer, é a segunda guerra mundial, todos os meus amigos foram para o campo de batalha, e eu aqui continuo trabalhando como matemático, sinto que a cada dia eu deixo de contribuir para o meu país, talvez eu tenha nascido na época errada, mas eu sei que através dos meus conhecimentos e  posso vencer essa guerra.... e essa é a minha história\n");
        System.out.println(
                "\nEu estou voltando para casa da padaria, de repente vejo policiais na frente da casa de um conhecido meu chamado Alan Turing, e vou lá ver\n");
        decisaoPoliciais();
    }

    public static void decisaoPoliciais() {

        boolean saiu = false;

        while (!saiu) {

            System.out.println("\n1 - Passo direto pelos policiais\n2 - Pergunto oq está acontecendo\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    passarDiretoPelosPoliciais();
                    saiu = true;
                    break;
                case "2":
                    perguntarOqueEstaAcontecendo();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void passarDiretoPelosPoliciais() {
        System.out.println("\nUm policial bateu no meu peito e me disse: 'EI JOVEM, ESSA AREA É RESTRITA'\n");
        decisaoPoliciaisDois();
    }

    public static void perguntarOqueEstaAcontecendo() {
        System.out.println("\nO policial me pergunta: 'Porque eu deveria te contar??'\n");
        decidirSuaRelacaoComAlan();
    }

    public static void decisaoPoliciaisDois() {
        boolean saiu = false;

        while (!saiu) {
            System.out.println("\n1 - Digo que o alan é meu amigo\n2 - Pergunto o que está acontecendo\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    explicarAoPolicialSuaRelacaoComAlan();
                    saiu = true;
                    break;
                case "2":
                    perguntarOqueEstaAcontecendo();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void decidirSuaRelacaoComAlan() {
        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Digo que o alan é meu amigo\n2 - Digo que o alan é meu irmão\n3 - Digo que o alan é meu primo\n4 - Digo que moro aqui perto e estou curioso");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                case "2":
                case "3":
                case "4":
                    explicarAoPolicialSuaRelacaoComAlan();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void explicarAoPolicialSuaRelacaoComAlan() {
        System.out.println("\nEntão senhor policial o Alan é meu...\n");
        System.out.println(
                "\nDe repente um outro policial sai de dentro da casa visivelmente irritado dizendo para o seu companheiro: 'Vamos embora, não tem nada aqui, isso foi uma viagem perdida'\n");
    }

}
