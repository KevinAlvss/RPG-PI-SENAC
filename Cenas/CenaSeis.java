package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.FimDeJogo;

public class CenaSeis {

  static Scanner sc = new Scanner(System.in);

  public static void initCenaSeis() {

    Utils.escrever(
        "Apos as explicações eles nos mandaram de volta para casa para arrumarmos as malas,"
            + " pois íamos a algum lugar secreto que não nos contaram..."
            + " 1Em casa arrumei minhas malas e voltei para o predio aonde fizemos a prova, la"
            + " havia um carro me esperando que me levou para algum lugar,"
            + "parecia uma faculdade misturado com uma base militar , onde encontrei apenas jack");

    boolean saiu = false;

    while (!saiu) {
      Utils.escrever("1 - Perguntar aonde está Joan.\n2 - Não dizer nada.");

      String decisao = sc.next();

      switch (decisao) {
        case "1":
          perguntarOndeEstaJoan();
          saiu = true;
          break;
        case "2":
          naoDizerNada();
          saiu = true;
          break;
        default:
          break;
      }
    }
  }

  private static void perguntarOndeEstaJoan() {
    Utils.escrever(
        "Perguntei ao Jack aonde estava Joan, e jack me respondeu 'Eu não sei exatamente,"
            + " ela disse algo relacionado aos pais não gostarem dela ir"
            + " para um lugar masculino... talvez ela recuse a oferta' então eu disse a jack 'Hmmm"
            + " entendi, que triste , ela parecia ser uma mente muito brilhante'");
    prazerHugh();
  }

  private static void prazerHugh() {

    Utils.escrever(
        "Derrepente um rapaz se aproxima de mim e jack e diz 'Muito prazer,"
            + " me chamo Hugh Alexander, vocês devem ser os novos ajudantes,"
            + " Jack Good, " + Jogador.GetNomeJogador() + " mas pera ai , falta alguém"
            + " uma moça chamada Joan Clarke, noticias dela?'");

    boolean saiu = false;

    while (!saiu) {
      Utils.escrever("1 -Dizer que sim\n2 - Dizer que não");

      String decisao = sc.next();

      switch (decisao) {
        case "1":
          dizerSim();
          saiu = true;
          break;
        case "2":
          dizerNao();
          saiu = true;
          break;
        default:
          break;
      }
    }
  }

  private static void naoDizerNada() {
    prazerHugh();
  }

  private static void dizerSim() {
    Utils.escrever(
        "Eu disse a hugh 'Provavelmente ela não vira , pois os pais dela"
            + " não gostam que ela se envolva em um ambiente com muitos homens'");
    dizerNao();
  }

  private static void dizerNao() {
    Utils.escrever("Então tá, vemos lá, depois o pessoal resolve isso"
        + " Hugh nos leva a uma sala aonde iremos desempenhar nosso trabalho"
        + " e diz que é lá aonde passaremos todo nossos dias até decifrarmos a maldita maquina alemã....");
    decisaoHugh();
  }

  private static void decisaoHugh() {
    Utils.escrever("Em um certo dia estavamos terminando de decifrar os codigos nazistas ate que um relogio toca  e"
        + " e imediatamente Hugh joga todos os papeis no chão com muita raiva,");

    boolean saiu = false;

    while (!saiu) {
      Utils.escrever("1 - Perguntar oque aconteceu \n2 - Não dizer nada.");

      String decisao = sc.next();

      switch (decisao) {
        case "1":
          Utils.escrever(
              "Eu pergunto oque aconteceu e John me responde 'São 00:00 esse horário que os malditos mudam a chave da maquina, muito bom... mais um dia de trabalho foi para o lixo'");
          saiu = true;
          break;
        case "2":
          Utils.escrever("A sala fica em silencio por alguns segundos");
          saiu = true;
          break;
        default:
          break;
      }
    }
    irParaGalpao();
  }

  private static void irParaGalpao() {

    Utils.escrever(
        "Hugh sai andando com passos largos com muita raiva em direção ao galpão em que Alan estava construindo uma curiosa maquina");

    boolean saiu = false;

    while (!saiu) {
      Utils.escrever("1 - Ir atrás de Hugh  \n2 - Ficar lá.");

      String decisao = sc.next();

      switch (decisao) {
        case "1":
          Utils.escrever(
              "Fui atrás de Hugh pois ele parecia estar fora de si e poderia fazer alguma besteira, quando cheguei ao galpão Hugh"
                  + " estava prestes a arremessar um copo em direção de alan mas eu intervi e segurei o braço dele fazendo com que o copo vá para outra"
                  + " direção, Hugh diz ``VOCÊ E ESSA MAQUINA IDIOTA,VOCÊ FICA AI BRINCANDO DE CONSTRUIR AO INVES DE AJUDAR!!!! ESTOU CANSADO DESSA MERDA!!!´´"
                  + " Peter concorda com Huhg e diz ``Ele tem razão Alan , estamos perdendo muito tempo com isso´´"
                  + " Alan diz ``NÃO É PERCA DE TEMPO , MINHA MAQUINA VAI FUNCIONAR SIM´´, como o clima já estava bem tenso decidi não dizer nada");
          CenaSete.initCenaSete();
          saiu = true;
          break;
        case "2":
          Utils.escrever(
              "Pergunta aos outros poquer ele ficou tão bravos e Peter me responde 'Des de que começamos ele não vai com a cara"
                  + " de Alan parecem ate gato e rato...' John responde 'O dia que eles fizerem as pazes essa guerra acaba'... ao fim da frase de john"
                  + " nos escutamos um alto grito e um estrondo e fomos até o galpão , lá vemos hugh estagnado olhando para corpo de Alan no chão desacordado"
                  + " com estilhaços de vidro em seu rosto, cheguei próximo ao corpo de Alan e tentei o acordar... quando coloquei o dedo em sua veio do pescoço"
                  + " e não senti pulsação .... Alan havia batido a nuca na quina da maquina e veio a falecer.... e o projeto todo foi arquivado pelo cabeça do projeto"
                  + " ter morrido e um dos membros estar foragido por assassinato.");
                  FimDeJogo.creditosFimDeJogo();    
                  saiu = true;
          break;
        default:
          break;
      }
    }
  }

}