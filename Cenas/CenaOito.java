package Cenas;

import java.util.Scanner;
import Utils.Utils;
import Client.Jogador;
import Client.Menu;

public class CenaOito {

    static Scanner sc = new Scanner(System.in);

    public static void initCenaOito() {

        Utils.escrever("Já fazem 14 dias que o comandante nos deu o prazo  trabalhamos muito, mas não conseguimos muitas evoluções,\nentão hoje decidimos ir a um bar para esfriar a cabeça , estava eu Alan e Joan conversando,\naté que uma garota chamada Helen amiga de Joan se aproximou e começou a conversar com a gente e logo quando ,\nHelen se aproximou Hugh também entrou na conversa, com olhos maliciosos em direção de Helen, então Hugh a cumprimenta e começa a chaveca-la,\na partir desse momento fiquei um pouco desconexo do assunto e não prestei muita atenção voltei a prestar atenção apos ela comentar tem atração em um homem que ela nem conhecê-lo\n  mas que é uma pena tinha uma namorada e que esse homem é o que ela interceptava as mensagens (não sei como chegaram neste assunto),\ne ela e Hugh foram ate o balcão pedir uma bebida");
        comentarOuNao();
    }

    public static void comentarOuNao(){
        
        boolean saiu = false;
        while (saiu) {

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
                    break;
            }
        
        }

    }

    private static void naoComentarSobre() {
    }

    private static void comentarSobre() {
        Utils.escrever("intrigado com que eu acabei de ouvir de Helen eu digo” Vocês não acham engraçado.... como que ela sabe que o rapaz alemão tem uma namorada?”");
        Utils.escrever("Alan fixa em um ponto no chão por alguns segundos e depois olha para mim e diz “Calma lá, acho que isso pode ser uma pista”,\nentão ele levanta vai ate Helen e pergunta como que ela sabe que ele tem uma namorada,\nentão ela responde “Ah que que sempre ele coloca 5 letras no inicio das mensagens C I L L Y , etão suspeito que esse seja o nome da namorada dele”, \nAlan diz “Mas o alemães são instruídos a colocar 5 letras aleatórias no inicio de cada mensagem”, então Hugh diz “O amor faz loucuras”, então Alan vira pra mim e diz “O amor acabou de fazer a Alemanha perder a guerra!”\ne ele vai correndo ate o nosso escritório e todos nos no bar fomos atrás dele ");
        chegarNoEscritorio();
    }

    private static void chegarNoEscritorio() {
        Utils.escrever("Ao chegarmos todos lá Alan diz “E se o Christopher não precisar testar todas as combinações \ne sim por padrões especificismos”... Hugh diz “por palavras especificas”");
        
    }

}

