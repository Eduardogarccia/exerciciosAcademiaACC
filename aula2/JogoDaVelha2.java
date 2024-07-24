package aula2;

import java.util.Scanner;

public class JogoDaVelha2 {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[][] tabuleiro = { 
						{" "," "," "},
						{" "," "," "},
						{" "," "," "}};
		
		System.out.println("ESSE É O TABULEIRO:");
		PrintarTabuleiro(tabuleiro);
		
		int jogadas = 0;
		boolean partidaAcabou = false;
		
		while (jogadas < 9 && partidaAcabou == false) {

			System.out.println(" ");
			System.out.println("VEZ DO JOGADOR 1 (X) ");
			Jogar(tabuleiro, input, "X");
			PrintarTabuleiro(tabuleiro);
			if (VerificarVitoria(tabuleiro, "X")) {
				System.out.println("Jogador 1 foi o vencedor");
				partidaAcabou = true;
			}
			jogadas += 1;

			if (jogadas < 9 && partidaAcabou == false) {
				System.out.println(" ");
				System.out.println("VEZ DO JOGADOR 2 (O): ");
				Jogar(tabuleiro, input, "O");
				PrintarTabuleiro(tabuleiro);
				if (VerificarVitoria(tabuleiro, "O")) {
					System.out.println("Jogador 2 foi o vencedor");
					partidaAcabou = true;
				}
			}
			jogadas += 1;
		}
		
		if (!partidaAcabou) {
            System.out.println("deu véa");
		}
	}
				
	
	public static void PrintarTabuleiro(String[][] tabuleiro) {
		System.out.print("\n\n 0   1    2\n\n");
		for (int posicao1 = 0; posicao1 < 3; posicao1++) {
			for (int posicao2 = 0; posicao2 < 3; posicao2++) {
				System.out.print(" " + tabuleiro[posicao1][posicao2]);
				if (posicao2 < 2) {
					System.out.print(" | ");
				}
				if (posicao2 == 2) {
					System.out.print("  " + posicao1);
				}
			}
			if (posicao1 < 2) {
				System.out.print("\n------------");
			}
			System.out.println("\n");
		}

	}
	
	public static void Jogar(String [][] tabuleiro, Scanner input, String simbolo) {
		int linha;
		int coluna;
		do { 	
		System.out.print("Digite a linha: ");
		linha = input.nextInt();
		System.out.print("Digite a coluna: ");
		coluna = input.nextInt();
		if (!VerificarValidade(tabuleiro, linha, coluna)) {
			System.out.println("Entrada inválida, por favor tente novamente!");
		}
		} while (!VerificarValidade(tabuleiro, linha, coluna));
		
			
		tabuleiro[linha][coluna] = simbolo;
			
	}
	
	public static boolean VerificarValidade (String [][] tabuleiro, int linha, int coluna) {
		return linha >= 0 && linha < tabuleiro.length && coluna >= 0 && coluna < tabuleiro[linha].length && tabuleiro[linha][coluna] == " ";
	}
	
	public static boolean VerificarVitoria(String[][] tabuleiro, String simbolo) {
        
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) ||
                (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo)) {
                return true;
            }
        }
        
        return (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) ||
               (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo);
    }
}
	
