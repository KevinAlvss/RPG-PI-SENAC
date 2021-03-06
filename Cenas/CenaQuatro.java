package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.Menu;
import Client.Opcoes;
import Client.FimDeJogo;

public class CenaQuatro {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaQuatro() {
        Utils.escrever("4°CENA");
        Utils.escrever(
                "Não me sobrarão unhas para roer, a ansiedade não poderia ser pior... Já fazem 4 dias que fui demitido, Pelo atraso deve estar pensando, Mas não. A empresa faliu, a guerra tens nos afetado. Te disse que as coisas não estavam legal.\n"
                        + "\n          \n"
                        + "\n*som de metal*\n"
                        + "\nParece que alguém mexeu na minha caixa de correios, então decido ir ate lá ver o que era.\n"
                        + "\nO carteiro acabou de sair da frente da minha casa. Então fui ansioso ver e haviam 2 cartas... Uma era do meu antigo chefe e a outra era misteriosa não havia nada escrito, deduzi ser aquela do jornal.");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Abrir carta do ex chefe Sr.George.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    cartaChefe();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void cartaChefe() {
        Utils.escrever("'Olá caro(a) " + Jogador.GetNomeJogador() + ", Como vai?\n"
                + "\n``Tudo aconteceu tão repentinamente que não pude me explicar, peço que aceite minhas sinceras desculpas pelo o que aconteceu, ``Pensei comigo: Será que suas desculpas encheram minha barriga?.. continuei a ler`` Recebi uma proposta para trabalhar com meu irmão em um novo esquema no Brasil. Como eu te considero uma pessoa de ouro, gostaria de saber se não quer se juntar a mim nessa jornada.... Caso esteja interessado me encontre na frente do nosso antigo escritório amanhã as 14:00Hrs.'");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Ler carta a carta misteriosa.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    cartaAnuncio();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void cartaAnuncio() {
        Utils.escrever("'Olá caro(a), " + Jogador.GetNomeJogador() + ".\n"
                + "\nVenho por meio desta carta lhe informar que você passou para a última fase eliminatória, venha amanhã a prefeitura de Richmond as 14:00hrs.'");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Aceitar proposta do chefe.\n2 - Aceitar proposta de emprego.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    aceitarOportunidade1();
                    saiu = true;
                    break;
                case "2":
                    aceitarOportunidade2();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void aceitarOportunidade1() {
        Utils.escrever(
                "Cheguei ao nosso ponto de encontro as 13:00h, mais cedo que o combinado. Às 13:30 vejo o Sr.George se aproximando.....\n"
                        + "\nEle chega até mim e me convida para entrarmos em nosso antigo escritório... Lá ele me explica com detalhes sobre o negócio que o irmão dele e que lá iriamos iniciar novas vidas, porém com nomes diferentes, pois em tempos de guerra nós deveríamos ter nos juntado ao exército.... O Sr.George me diz que iríamos sair dali em uma semana, esse era o tempo que eu tinha para vender todos meus pertences que iriam ficar para trás....\n"
                        + "\nConsegui. Foi difícil, porém eu consegui vender tudo que tinha e em tempo de guerra é dificil lucrar com isso.... A partir de agora serão pessoas novas, país novo, idioma novo, vida nova.");

        Utils.escrever(
                "A guerra acabou em 1955 com a total destruição da Alemanha e o que era o território alemão, agora não passa de um enorme cemitério. Foi uma guerra muito difícil, após as bombas de Hiroshima e Nagasaki.\n Em 45 o império japonês ficou cada vez mais irritado fazendo com que as pesquisas em armas de destruição em massa foram aceleradas, tanto no japão quanto na Alemanha.");

        Utils.escrever("Fim de jogo.");

        FimDeJogo.creditosFimDeJogo();
    }

    private static void aceitarOportunidade2() {
        Utils.escrever(
                "Enviei uma carta para o Sr.George agradecendo toda sua consideração e dizendo que eu recusaria a proposta, e disse que não poderia ir, estava sentindo que algo maior estava por acontecer...\n"
                        + "\nEntão fiz o que solicitava na carta, e passei o dia ansioso para ver oque iria acontecer\n a verdade é que eu não queria morrer de fome.."
                        + "\n...\n"
                        + "\nAcordei as 7h da manhã, as 8h estava pronto. Um pouco cedo? talvez, mas não conseguia conter meu entusiasmo.\n"
                        + "\nJá era por volta das 9:30 e minha barriga gritava por comida, então...");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever(
                    "1 - Decido ir a lanchonete comer algo.\n2 - Ficar em casa a arriscar nos dotes culinários.");

            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irLanchonete();
                    saiu = true;
                    break;
                case "2":
                    ficarEmCasa();
                    saiu = true;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void irLanchonete() {
        Utils.escrever(
                "A caminho encontro o Sr.George, que me parecia um tanto quanto preocupado...");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever("1 - Conversar com ele e perguntar o que aconteceu.\n2 - Ignorá-lo e ir para lanchonete.");

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
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void ignorarEle() {
        Utils.escrever("Continuo a caminhar sem arrependimento pela minha escolha");

        indoAPrefeitura();

    }

    private static void ficarEmCasa() {
        Utils.escrever(
                "Vou até a cozinha e reviro a geladeira e os armário em busca de algo, como esse mês o dinheiro tava curto então fui comendo um sanduiche de 200 anos que achei na geladeira..");

        indoAPrefeitura();
    }

    private static void perguntarOqueHouve() {
        Utils.escrever(
                "Com um olhar de decepção Sr.George me cumprimentou, quando perguntei o que aconteceu ele me diz que acabara de ler minha carta, muito triste pela minha recusa, pediu para que caso reconsiderasse a oferta eu ganharia mais dinheiro do que eu poderia sonhar em ter.");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever(
                    "1 - Reconsiderar oferta... e irá com senhor Sr.George.\n2 - Recusar novamente e dizer que algo maior esta por vir.");

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
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void indoAPrefeitura() {
        Utils.escrever(
                "Chegando na prefeitura digo que vim pelo desafio do jornal, então me levaram a uma sala onde tinham vários rapazes em carteiras como se fosse uma escola e logo pensei que provavelmente iríamos realizar uma prova. Por volta das 13:30 Alan entra na sala, antes que eu possa dizer algo ele vai a frente da sala, comprimenta a todos e começa conversar com um oficial");

        CenaCinco.initCenaCinco();

    }

    private static void reconsiderarOferta() {
        Utils.escrever(
                "Repenso em tamanha oportunidade me parece interessante, mesmo com aquele sentimento de que algo grande ia acontecer. E então pensei melhor na minha vida e na situação em que eu me encontrava.... Decido ir com Sr.George, ele me pede para que encontrasse ele no ponto de encontro combinado na carta.");

        aceitarOportunidade1();

    }

    private static void recusarNovamente() {
        Utils.escrever(
                "Então ele me perguntou se eu tinha alguém de confiança para recomendar... pois ele confiava em mim e se eu recomendasse alguém ele certamente chamaria está pessoa.");

        boolean saiu = false;

        while (!saiu) {
            Utils.escrever(
                    "1 - Dizer que conhece um rapaz chamado Alan Turing que é muito inteligente e com certeza tem o que é precisa.\n2 - Dizer que infelizmente não conhece ninguém que  possa recomendar.");

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
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void apresentarAlan() {
        Utils.escrever(
                "Disse ao Sr.George que conheço um rapaz chamado Alan Turing que é muito inteligente e que seria capaz de suprir suas expectativas, e que ele era um tanto quanto excêntrico mas que era uma mente de ouro. Ele pega um pequeno caderninho e anota o nome, e diz ``Muito obrigado filho estou feliz que você esteja seguindo seu próprio caminho´´... E então nos despedimos e eu vou a padaria comer algo. Eu peço o de sempre e após comer eu fico um tempo conversando com a garçonete.... Por volta das 11:40 volto ansioso para casa e me arrumo e 13:20 eu saio de casa e vou andando ate a prefeitura... Ao chegar lá, mostro a carta que recebi e eles me levam a uma sala onde tem vários rapazes mas antes mesmo que eu possa me sentar em uma carteira entra Alan na sala, e vai à frente da sala e diz ``Rapazes, por motivos pessoais está prova não irá mais acontecer... Me desculpem pelo ocorrido e peço para que voltem para suas casas e sigam suas vidas.´´");
        Utils.escrever(
                "Após isso fui conversar com Alan e ele me disse que um senhor chamado George Orwell o chamou para uma oportunidade em outro país, sabendo que a vida estava difícil na Inglaterra decidiu largar tudo e ir para lá, pois não tinha mais nada a perder e Alan me agradeceu pela recomendação.\n"
                        + "\nE eu fiquei um tanto quanto confuso com aquilo tudo e muito desconcertado ao mesmo tempo, pois perdi duas oportunidades de uma vez só.\n"
                        + "\nHoras mais tarde o Sr.George me liga e me diz que Alan contou tudo que havia ocorrido e me perguntou se eu queria ir também, então como não tinha mais opção eu aceitei e fui junto com o Sr.George e com Alan.");
        Utils.escrever(
                "Fim de jogo.");

        Menu.exibir();
    }

    private static void naoApresentarNinguem() {
        Utils.escrever(
                "Digo que não conheço ninguém para recomendar, ele agradece e nos despedimos, desejo uma boa viagem à ele, e ele diz ``Garoto, estou triste por você não ir comigo, porém muito feliz que esteja seguindo seu próprio caminho, atá mais.´´, e então sigo até à padaria. Peço o de sempre e após comer, fiquei por lá conversando com a atendente. Até que olhei para o relógio e já eram 11:40, então me despedi da garçonete e fui correndo para casa me arrumar.");

        indoAPrefeitura();
    }
}