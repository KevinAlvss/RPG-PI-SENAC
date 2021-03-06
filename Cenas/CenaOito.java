package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.*;

public class CenaOito {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaOito() {
        Utils.escrever("8°CENA");
        Utils.escrever(
                "Já fazem 14 dias que o comandante nos deu o prazo, trabalhamos muito, mas não houve muitas evoluções. Por hoje decidimos ir a um bar para esfriar a cabeça, eu Alan e Joan conversamos, até que uma garota chamada Helen amiga de Joan se junta para cnversar com a gente, junto a ela Hugh se aproxima, com olhos maliciosos na direção de Helen, Hugh a cumprimenta e começa a chaveca-la, mas logo fica muchinho porque a garota estva interessada em um rapaz alemão, cujo ela suspeitava ja ser comprometido, pois nas mensagens que ela interceptava ele mencionava sempre alguém");
        comentarOuNao();
    }

    private static void comentarOuNao() {

        boolean saiu = false;
        while (!saiu) {

            Utils.escrever("1 - Comentar com  Alan e Joan sobre o assunto\n2 - Não dizer nada");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    comentarSobre();
                    saiu = true;
                    break;

                case "2":
                    naoComentarSobre();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void naoComentarSobre() {
        Utils.escrever("Como não havia mais nada para fazer decidi ir para casa, e encontro Alan e Joan conversando");

        boolean saiu = false;
        while (!saiu) {

            Utils.escrever("1 - Ir falar com eles\n2 - continuar indo ao meu dormitorio");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    irFalarComEles();
                    saiu = true;
                    break;

                case "2":
                    irParaDormitorio();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void irParaDormitorio() {
        Utils.escrever(
                "Como recentemente eles tinham noivado eu decidi não atrapalha e segui meu caminho... no dia seguinte voltamos ao galpão para tentar fazer a maquina funcionar.... \num dia se passa...outro...e mais outro.... quando nos damos conta estamos no dia final de nosso prazo e seguimos sem muitos avanços");
        Utils.escrever(
                "Não conseguimos terminar a maquina... O comandante Denniston, \nchegou no galpão com cinco soldados e com um sorriso maldoso em seu rosto ele diz, nos expulsou....\nvocês voltaram para suas casas e irão esquecer de tudo que aconteceu aqui, e caso a gente descubra que algum de vocês contou oque aconteceu, vão serão presos por traição.\nE então assim acabou nossa jornada, foi o fim de uma longa caminhada que infelizmente não deu certo....\nno mesmo dia todos nos fomos mandados de volta para nossas casas... quanto a guerra, ela se perdurou por mais 8 longos ate seu fim em 1950 ... \nestragos que refletirão no mundo todo, muitas atrocidades, muitas vidas perdidas e sinto como se eu pude-se ter evitado ou pelo menos amenizado MAS EU FALHEI!... ");

        FimDeJogo.creditosFimDeJogo();
    }

    private static void irFalarComEles() {
        Utils.escrever(
                "Boa noite gente, desculpa incomoda-ls a essa hora masi algo me deixou com uma pulga atrás da orelha, se a Helen não conhece o rapaz alemão como ela sabe que ele namora");
        Utils.escrever(
                "Alan fixa em um ponto no chão por alguns segundos e depois olha para mim e diz ``Calma lá, acho que isso pode ser uma pista´´, \nentão ele vai correndo ao bar em encontro de Helen e pergunta como que ela sabe que ele tem uma namorada, então ela responde \n``Ah que que sempre ele coloca 5 letras no inicio das mensagens C I L L Y , etão suspeito que esse seja o nome da namorada dele´´, \nAlan diz ``Mas o alemães são instruídos a colocar 5 letras aleatórias no inicio de cada mensagem´´, então Hugh diz ``O amor faz loucuras´´, então Alan vira pra mim e diz \n``O amor acabou de fazer a Alemanha perder a guerra!´´ e ele vai correndo ate o nosso escritório e todos nos no bar fomos atrás dele");
        chegarNoEscritorio();
    }

    private static void comentarSobre() {
        Utils.escrever(
                "Não sei porque, mas lgo me chamou atenção no que eu acabei de ouvir da garota, ´´ Vocês não acham engraçado.... como que ela sabe que o rapaz alemão tem uma namorada?´´");
        Utils.escrever(
                "Alan pensativo diz ``Calma lá, acho que isso pode ser uma pista´´,\nentão ele levanta vai ate Helen e pergunta como ela sabe que ele tem uma namorada,\n ela responde ``Ah ele sempre coloca 5 letras no inicio das mensagens C I L L Y, etão suspeito que esse seja o nome da namorada dele´´, \nAlan diz ``Mas o alemães são instruídos a colocar 5 letras aleatórias no inicio de cada mensagem´´, então Hugh diz ``O amor faz loucuras´´,  Alan vira pra mim e diz ``O amor acabou de fazer a Alemanha perder a guerra!´´\ne ele vai correndo ate o nosso escritório e todos nos no bar fomos atrás dele ");
        chegarNoEscritorio();
    }

    private static void chegarNoEscritorio() {
        Utils.escrever(
                "De volta a sala Alan diz: `` Christopher não teste todas as combinações \ne sim por padrões especificos... Hugh diz ``por palavras especificas´´");

        boolean saiu = false;
        while (!saiu) {

            Utils.escrever("1 - Olhar nos papeis da banca a sua esquerda \n2 - Olhar nos papeis da banca a direita");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    olharParaEsquerda();
                    saiu = true;
                    break;

                case "2":
                    olharParaDireita();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void olharParaDireita() {
        Utils.escrever(
                "enquanto olho as mensagens me deparo com uma do dia de hoje mas antes que eu comece a ler Joan lé em voz alta \n``6 horas chuva a noite o clima esta bom heil Hitler´´, Alan fala ``eles mandam as mensagens sempre com informação do clima, \nentão sabemos 3 palavras que sempre estarão nas mensagens , a palavra ``Clima´´ e a merda do ``heil Hitler´´ ´´,\nassim que Alan termina de falar eu digo ``Aqui está é a mensagem de 6 horas da manhã de hoje´´");
        irparaGalpao();
    }

    private static void olharParaEsquerda() {
        Utils.escrever(
                "Assim que bato o olho nas menagens vejo uma que diz ``6 horas chuva a noite o clima esta bom heil Hitler´´ e a leio em voz alta, \nAlan fala ``eles mandam as mensagens sempre com informação do clima, \nentão sabemos 3 palavras que sempre estarão nas mensagens , a palavra ``Clima´´ e a merda do ``heil Hitler´´ ´´, \nassim que Alan termina de falar Joan diz ``Aqui está é a mensagem de 6 horas da manhã de hoje´´");
        irparaGalpao();
    }

    private static void irparaGalpao() {
        Utils.escrever("Então todos nos fomos correndo ao galpão chegando lá Alan diz " + Jogador.GetNomeJogador()
                + " as rodas de letras da direita as mude para as palavras que conhecemos, john mande voltagem entre essas letras e Joan qual foi a ultima mensagem de hoje´´ então cada um faz sua parte, Alan liga a maquina é então....\n");
        Utils.reticencias(5);
        Utils.reticencias(5);
        Utils.reticencias(5);
        Utils.escrever(
                "Ela para de girar.... todos nos estávamos estáticos não acreditando que poderia ter funcionado, \nAlan pegou um papel e uma caneta, escreveu as letras que a maquina encontrou e voltou correndo ao escritório, Alan abre nosso exemplar da enigma,\n e a configura para as letras que nos acabamos de encontrar,\ne pede para alguém pegar a ultima carta interceptada\n por fim nos conseguimos traduzir uma carta...  Alan começa a chorar de alegria, começamos traduzir todas as caratas mais atuais \n");
        Utils.escrever(
                "Mapeamos todas as localizações dos navios em posição no atlântico, Além de descobrir que ira ocorrer um ataque ao navio com civis \nmas Alan nos explica que não podemos agir agora, para os alemães não suspeitarem se milagrosamente aparecer um esquadrão de bombardeiros salvando o navio.... \ntodos ficam em silencio e Peter diz ... ``certo não podemos agir agora , porem podemos avisar para apenas um deles´´ ele mostra no mapa um navio e diz que seu irmão está lá... e começa a chorar perdido   ");

        boolean saiu = false;
        while (!saiu) {

            Utils.escrever("1 - Reconfortá-lo e o convencer que não podemos \n2 - Ajudá-lo a prevenir o ataque");
            String decisao = sc.next();

            switch (decisao) {
                case "1":
                    reconfortarPeter();
                    saiu = true;
                    break;

                case "2":
                    ajudarPrevenirAtaque();
                    saiu = true;
                    break;
                default: 
                        Opcoes.mensagemPadraoNaoReconhecido();
                    break;
            }
        }
    }

    private static void ajudarPrevenirAtaque() {
        Utils.escrever(
                "ir dar um abraço nele e dizer baixo no ouvido dele ``Relaxa cara, vou dar um jeito nisso e vou contar para o Comandante´´");
        Utils.escrever(
                "Dito e feito no dia seguinte fui ate a sala do comandante e disse que a maquina funcionou, avisei sobre os ataques mas pedi a ele descrição, para que ele não contasse nada afim de evitar alvoroço, \nele avisou aos aliados do ataque , que foram de imediato salvar... e 2 dias apos o ataque... assim como Alan e Joan avisaram...\n os nazistas mudaram o desenho da enigma e todo nosso trabalho foi pra água a baixo... 2 anos de nossas vidas desperdiçados tudo por minha culpa... \npelo menos já tínhamos a ``Formula´´ porem demorou meses para o exercito conseguir um novo exemplar da enigma reformulada e mais alguns messes para remontar nossa maquina conforme a nova enigma... \nno total foram mais 1 ano e 6 meses, conseguimos novamente quebrar o código mas isso ceifou muitas vidas... a guerra teve seu fim em 1947.  ");

        FimDeJogo.creditosFimDeJogo();
    }

    private static void reconfortarPeter() {
        Utils.escrever(
                "Então chego perto de Peter e digo ``Cara sinto muito , mais infelizmente não podemos fazer isso, pensa comigo se salvarmos a vida do seu irão agora nos iremos \nperderemos MUITO mais vidas depois eu entendo que é muito difícil, mas é pelo bem da humanidade´´");
        Utils.escrever(
                "Peter sai da sala chorando e dizendo que somos monstros mas a verdade é que agora que vem a missão mais difícil que é manter nossa conquista em segredo, Alan disse que ira conversar com Stwart Menzies, \npara que ele mantenha tudo em segredo ate o momento certo de usarmos nossa carta, Menzies tinha e dom sabia como fazaer com que todos acreditassem nas coisas que ele dizia, e com isso podemos atacar no momento certo. Mas agora tudo que nos resta é decodificar o maior número de mensagens para poder ajudar os aliados....\nA guerra se arrastou por mais longos dois anos , com ataques escolhidos a dedo, vitorias que não seriam possíveis sem a gente.... a guerra teve seu fim....\n no dia que foi anunciado na radio o fim da guerra Menzies marcou uma reunião com todos nos, lá ele nos deu os parabéns que sem nossos esforços essa guerra não teria tido um fim,\n Menzies nos mandou queimar os arquivos, pois era uma missão ultra secreta então não poderíamos manter registro algum, e que dali em diante nos iriamos voltar para casa,\n e nunca ter contato novamente um com o outro como se nós nunca tivéssemos nos conhecido. Na mesma noite, nós nos reunimos atrás do galpão ,\n juntamos todos os papeis, todas as mensagens,rascunhos... tudo, pegamos algumas cervejas, algumas coisas para comer, acendemos uma fogueira e queimamos papel por papel,\n conversando e revivendo os momentos, e essa seria a ultima vez que todos nós íamos nos ver. O governo nos remurou pelo trabalho arduo que fizemos,\n com esse dinheiro eu me mudei para o Brasil me encontrei com Sr.George que estava no Rio de Janeiro, depois me mudei para São paulo, conheci uma pessoa com quem me casei,\ntive 4 filhos , e comecei a lecionar em uma universidade chamada USP e tive a ideia de fundar minha própria universidade em menos de um ano e em 1946 fundei a universidade Senac");

        FimDeJogo.creditosFimDeJogo();
    }
}