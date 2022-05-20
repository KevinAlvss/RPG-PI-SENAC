package Client;

import Utils.Utils;

public class FimDeJogo {

    public static void creditosFimDeJogo(){

        String nomePlayer =  Jogador.GetNomeJogador();
        if(nomePlayer == null || nomePlayer == "")
            nomePlayer = "jogador(a)";

        Opcoes.creditos();
        Utils.escrever("Parabens "+ nomePlayer +" Você chegou a um dois finais do jogo\n Muito obrigado por jogar!!! Até a prixima! (._ . )");
        Utils.escrever("Caso queira jogar novamente alguma cena vá ao menu ``3 - Selecionsar Cena´´");
        Menu.exibir();
    }
    
}
