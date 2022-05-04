package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.Menu;

public class CenaQuatro {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaQuatro() {
        Utils.escrever(
                "A ansiedade não poderia ser pior... Já fazem 4 dias que fui demitido... Não necessariamente pelo atraso, mas sim por falta de recursos... Faltava dinheiro... Faltava pessoas....  E o dono do escritório aonde trabalho dispensou todos, pois já não havia mais condições de manter os funcionários, agora minha única chace é aquela carta....\n"
                        + "\n....\n"
                        + "\n....\n"
                        + "\n*som de metal*\n"
                        + "\nParece que alguém mexeu na minha caixa de correios, então decido ir ate lá ver o que era.\n"
                        + "\nO carteiro acabou de sair da frente de minha casa. Então fui ansioso ver e haviam 2 cartas... Uma era do meu antigo chefe e a outro era uma carta que estava escrito “Oportunidade de emprego” que deduzi ser aquela do jornal.");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Abrir carta do ex chefe Sr.George.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    cartaChefe();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void cartaChefe() {
        Utils.escrever("'Olá caro(a) " + Jogador.GetNomeJogador() + ", Como vai?\n"
                + "\nSei que aquilo foi muito repentino, peço minhas sinceras desculpas pelo o que aconteceu, mas infelizmente eu não estava mais conseguindo sustentar as coisas, até na minha casa a situação está muito difícil. Como eu te considero uma pessoa de ouro eu venho te oferecer uma oportunidade, uma passagem só de ida para o Brazil, meu irmão foi para lá a alguns anos e conhece um rapaz chamado Roberto Marinho que está com uma ideia de um novo negócio por lá e como você é uma pessoa de ouro decidi que te levaria comigo nessa jornada.... Caso esteja interessado me encontre na frente do nosso antigo escritório amanhã as 14:00Hrs.'");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Ler carta de oportunidade de emprego.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    cartaAnuncio();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void cartaAnuncio() {
        Utils.escrever("'Olá caro(a), " + Jogador.GetNomeJogador() + ".\n"
                + "\nVenho por meio desta carta lhe informar que você passou em nosso processo seletivo, porém agora temos uma última fase eliminatória, venha amanhã a prefeitura de Richmond as 14:00hrs.'\n");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Aceitar proposta do chefe.\n2 - Aceitar proposta de emprego.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    aceitarPropostaChefe();
                    saiu = true;
                    break;
                case "2":
                    aceitarPropostadeEmprego();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void aceitarPropostaChefe() {
        Utils.escrever(
                "Estou ansioso para conversar com o Sr.George, estava no nosso ponto de encontro as 13:00hrs, uma hora mais cedo que o combinado. Às 13:30 vejo o Sr.George se aproximando.....\n"
                        + "\nEle chega até mim e me convida para entrarmos em nosso antigo escritório... Lá ele me explica com detalhes sobre o negócio que o irmão dele estava envolvido com o Sr.Roberto e que lá iriamos iniciar novas vidas, porém com nomes diferentes, pois em tempos de guerra nós deveríamos ter nos juntado ao exército.... O Sr.George me diz que iríamos sair dali uma semana, esse era o tempo que eu tinha para vender todos meus pertences que iriam ficar para trás....\n"
                        + "\nConsegui. Foi difícil, porém eu consegui vender tudo que tinha e em tempo de guerra é dificil lucrar com isso.... A partir daqui serão pessoas novas, país novo, idioma novo, vida nova.");

        Utils.escrever(
                "A guerra acabou em 1955 com a total destruição da Alemanha e o que era o território alemão, agora não passa de um enorme cemitério. Foi uma guerra muito difícil, após as bombas de Hiroshima e Nagasaki.\n Em 45 o império japonês ficou cada vez mais irritado fazendo com que as pesquisas em armas de destruição em massa foram aceleradas, tanto no japão quanto na Alemanha.");

        Utils.escrever(
                "Fim de jogo.");

        Menu.exibir();

    }

    public static void aceitarPropostadeEmprego() {
        Utils.escrever(
                "Enviei uma carta para o Sr.George agradecendo toda sua consideração e dizendo que eu recusaria a proposta, e disse que não poderia ir, pois estava sentindo que algo maior estava por acontecer...\n"
                        + "\nEntão fiz o que solicitava na carta, e passei o dia ansioso para ver oque iria acontecer\n"
                        + "\n...\n"
                        + "\nAcordei as 6 horas da manhã pois eu não aguentava de ansiedade e fui arrumar a casa para me distrair, porém fiquei a todo momento de olhos no relógio.\n"
                        + "\nJá era por volta das 8:30 e minha barriga gritava por comida, então...");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Decido ir a padaria comer algo.\n2 - Ficar em casa e procurar algo para comer.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irAPadaria();
                    saiu = true;
                    break;
                case "2":
                    ficarEmCasa();
                    saiu = true;
                default:
                    break;
            }
        }
    }

    public static void irAPadaria() {
        Utils.escrever(
                "Como não havia nada de bom para comer em casa eu decido ir a padaria comer algo, e no caminho eu encontro o Sr.George, que me parecia um tanto quanto preocupado...");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Conversar com ele e perguntar o que aconteceu.\n2 - Ignorá-lo e ir para padaria.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    perguntarOqueHouve();
                    saiu = true;
                    break;
                case "2":
                    ignorarEle();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void ignorarEle() {
        Utils.escrever("Fui a padaria, pedi o de sempre e após comer voltei para casa.");

        indoAPrefeitura();

    }

    public static void ficarEmCasa() {
        Utils.escrever(
                "Vou até a cozinha e reviro a geladeira e os armário em busca de algo, como esse mês o dinheiro estava curto não comprei muitas coisas, encontrei apenas um pedaço de um sanduíche, um pedaço de queijo e um ovo.\n");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Decido ir a padaria comer algo.\n2 - Comer o sanduiche e preparar algo com o ovo e o queijo.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irAPadaria();
                    saiu = true;
                    break;
                case "2":
                    comerSanduiche();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void perguntarOqueHouve() {
        Utils.escrever(
                "Chego próximo do Sr.George e o cumprimento, pergunto o que aconteceu e ele me diz que tinha acabado de ler minha carta, e que ficou muito triste pela minha recusa, pois eu era um dos únicos funcionários que ele confiava e que tinha tão grande potencial. Ele precisava de alguém de confiança para ocupar um importante cargo no brasil, e pediu para que eu reconsiderasse a oferta me dizendo que se eu aceitasse eu ganharia mais dinheiro do que eu poderia sonhar em ter.\n");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Reconsiderar oferta... e irá com senhor Sr.George.\n2 - Recusar novamente e dizer que algo maior esta por vir.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    reconsiderarOferta();
                    saiu = true;
                    break;
                case "2":
                    recusarNovamente();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void comerSanduiche() {
        Utils.escrever(
                "Então eu fiz o que dava para fazer com o que eu tinha.... após comer, fui até minha estante e peguei um livro de xadrez que eu nunca havia terminado de ler por falta de tempo, e como eu estava querendo passar o tempo peguei-o para ler. Faltavam menos de 200 páginas, mas foi o suficiente para me manter entretido ate às 12:00, e então fui me arrumar parar sair.\n");

        indoAPrefeitura();

    }

    public static void indoAPrefeitura() {
        Utils.escrever(
                "Por volta de 13:10 sai de casa e fui andando até a prefeitura que era perto de casa..... Chegando lá digo que estou pela vaga no jornal, então me levaram a uma sala onde tinham vários rapazes em carteiras como se fosse uma escola e logo pensei que provavelmente iríamos realizar uma prova. Por volta das 13:30 entra Alan na sala, mas antes que eu possa dizer algo ele vai a frente da sala e da boa tarde à todos e começa conversar com um oficial que estava lá.\n");

        // CenaCinco.initCenaCinco();

    }

    public static void reconsiderarOferta() {
        Utils.escrever(
                "Penso novamente na oportunidade e me parece muito interessante, mesmo com aquele sentimento de que algo grande ia acontecer. E então pensei melhor na minha vida e na situação em que eu me encontrava.... Decido ir com Sr.George, ele me pede para que encontrasse ele no ponto de encontro combinado na carta.\n");

        aceitarPropostaChefe();

    }

    public static void recusarNovamente() {
        Utils.escrever(
                "Então ele me perguntou se eu tinha alguém de confiança para recomendar... pois ele confiava em mim e se eu recomendasse alguém ele certamente chamaria está pessoa.\n");

        boolean saiu = false;

        while (!saiu) {
            System.out.println(
                    "\n1 - Dizer que conhece um rapaz chamado Alan Turing que é muito inteligente e com certeza tem o que é precisa.\n2 - Dizer que infelizmente não conhece ninguém que  possa recomendar.\n");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    apresentarAlan();
                    saiu = true;
                    break;
                case "2":
                    naoApresentarNinguem();
                    saiu = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void apresentarAlan() {
        Utils.escrever(
                "Disse ao Sr.George que conheço um rapaz chamado Alan Turing que é muito inteligente e que seria capaz de suprir suas expectativas, e que ele era um tanto quanto excêntrico mas que era uma mente de ouro. Ele pega um pequeno caderninho e anota o nome, e diz “Muito obrigado filho estou feliz que você esteja seguindo seu próprio caminho”... E então nos despedimos e eu vou a padaria comer algo. Eu peço o de sempre e após comer eu fico um tempo conversando com a garçonete.... Por volta das 11:40 volto ansioso para casa e me arrumo e 13:20 eu saio de casa e vou andando ate a prefeitura... Ao chegar lá, mostro a carta que recebi e eles me levam a uma sala onde tem vários rapazes mas antes mesmo que eu possa me sentar em uma carteira entra Alan na sala, e vai à frente da sala e diz “Rapazes, por motivos pessoais está prova não irá mais acontecer... Me desculpem pelo ocorrido e peço para que voltem para suas casas e sigam suas vidas.”");
        Utils.escrever(
                "Após isso fui conversar com Alan e ele me disse que um senhor chamado George Orwell o chamou para uma oportunidade em outro país, sabendo que a vida estava difícil na Inglaterra decidiu largar tudo e ir para lá, pois não tinha mais nada a perder e Alan me agradeceu pela recomendação.\n"
                        + "\nE eu fiquei um tanto quanto confuso com aquilo tudo e muito desconcertado ao mesmo tempo, pois perdi duas oportunidades de uma vez só.\n"
                        + "\nHoras mais tarde o Sr.George me liga e me diz que Alan contou tudo que havia ocorrido e me perguntou se eu queria ir também, então como não tinha mais opção eu aceitei e fui junto com o Sr.George e com Alan.");
        Utils.escrever(
                "Fim de jogo.");

        Menu.exibir();
    }

    public static void naoApresentarNinguem() {
        Utils.escrever(
                "Digo que não conheço ninguém para recomendar, ele agradece e nos despedimos, desejo uma boa viagem à ele, e ele diz “Garoto, estou triste por você não ir comigo, porém muito feliz que esteja seguindo seu próprio caminho, atá mais.”, e então sigo até à padaria. Peço o de sempre e após comer, fiquei por lá conversando com a atendente. Até que olhei para o relógio e já eram 11:40, então me despedi da garçonete e fui correndo para casa me arrumar.");

        indoAPrefeitura();

    }
}