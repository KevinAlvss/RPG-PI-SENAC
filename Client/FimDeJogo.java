package Client;

import Utils.Utils;

public class FimDeJogo {

    public static void creditosFimDeJogo(){

        Opcoes.creditos();
        Utils.escrever("Parabens "+ Jogador.GetNomeJogador() +" Você chegou a um dois finais do jogo\n Muito obrigado por jogar!!! Até a prixima! (._ . )");
        Menu.exibir();
    }
    
}
