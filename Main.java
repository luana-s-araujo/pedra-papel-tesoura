public class MiniJogo_Jankenpon {
	public static void main(String[] args) {
		int jogada1 = 0, jogada2 = 0; 
    //passo1: criar as variaveis que receberam as respectivas jogadas 

		int jog1 = 0, jog2 = 0, empate = 0; 
    // os contadores do laço

		int qtd_partida = 0; 
    //contador do inicio da partida
    
		qtd_partida = InOut.leInt("Quantas partidas?");
		String partidas[][] = new String[qtd_partida][3];
    //String que pergunta quantas partidas serao

		for(int i = 0; i < qtd_partida; i++) {
			//primeiro laço de repetição

			jogada1 = (int)(Math.random()*15/5);
			jogada2 = (int)(Math.random()*15/5);
			// preenche a matriz com as escolhas:

      
			//abaixo a escolha do jogador 1
			switch (jogada1){
			case 0:
				partidas[i][1] = "Pedra";
				break;
			case 1:
				partidas[i][1] = "Papel";
				break;
			default:
				partidas[i][1] = "Tesoura";
			}

			//abaixo a escolha do jogador 2
			switch (jogada2){
			case 0:
				partidas[i][2] = "Pedra";
				break;
			case 1:
				partidas[i][2] = "Papel";
				break;
			default:
				partidas[i][2] = "Tesoura";
			}

			//definição das jogadas e incremento dos contadores
				 if(jogada1 == jogada2) {
					 partidas[i][0] = "Empate."; 
					 empate++;
				 }
				 else 
					 if((jogada1 == 0 && jogada2 == 1) || (jogada1 == 1 && jogada2 == 2) || (jogada1 == 2 && jogada2 == 0)) {
						 partidas[i][0] = "O Jogador 1 ganhou essa partida."; 
						 jog1++;
					 }
					 else {
						 partidas[i][0] = "O Jogador 2 ganhou essa partida."; 
						 jog2++;
					 }
		}
		//exibe os resultados das partidas
		for(int i = 0; i < qtd_partida; i++) System.out.println("A escolha do Jogador 1 foi" + partidas[i][1] + " e o " +
															 "A escolha do Jogador 2 foi " + partidas[i][2] + ". " + 
															 						 partidas[i][0]);
		//exibe os resultados da rodada
		if(jog1 + jog2 + empate == 0) System.out.println("Sem jogadas!");
		else if(jog1 == jog2) System.out.println("\nO jogo ficou no empate.");	
			 else if(jog1 > jog2) System.out.println("\nJogador 1 ganhou.");
			 	  else System.out.println("\nJogador 2 ganhou.");
	}
}

/*  0 = Papel   / resultado
	1 = Pedra   / Jogador 1
	2 = Tesoura / Jogador 2
*/
