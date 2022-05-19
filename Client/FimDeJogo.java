package Client;

import Utils.Utils;

public class FimDeJogo {

    public static void creditosFimDeJogo(){

        Opcoes.creditos();
        Utils.escrever("Parabens "+ Jogador.GetNomeJogador() +" Você chegou a um dois finais do jogo\n Muito obrigado por jogar!!! Até a prixima! (._ . )");
        Utils.escrever("Caso queira jogar novamente alguma cena vá ao menu ``3 - Selecionsar Cena´´");
        Menu.exibir();
    }
    
}
