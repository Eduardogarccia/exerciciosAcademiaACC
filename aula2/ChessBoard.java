package aula2;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"0 ","R","N","B","Q","K","B","N","R"},
				{"1 ","P","P","P","P","P","P","P","P"},
				{"2 "," "," "," "," "," "," "," "," "},
				{"3 "," "," "," "," "," "," "," "," "},
				{"4 "," "," "," "," "," "," "," "," "},
				{"5 "," "," "," "," "," "," "," "," "},
				{"6 ","p","p","p","p","p","p","p","p"},
				{"7 ","r","n","b","q","k","b","n","r"},
				{"  "," "," "," "," "," "," "," "," "},
				{"  ","1","2","3","4","5","6","7","8"}};

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 Scanner input = new Scanner(System.in);
		 // Mover Peao
		 for (int i = 0; i<10; i++) {
		 System.out.println("");
		 System.out.println("Vez do jogador minúsculo (p)");
		 System.out.println("Em qual coluna está o peão que você quer movimentar (1 - 8)");
		 int coluna = input.nextInt();
		 System.out.println("Em qual linha está o peão que você quer movimentar (0 - 7)");
		 int linhaAtual = input.nextInt();
		 System.out.println("Escolha para qual casa você deseja movimentar (0 - 7)");
		 int linhaFinal = input.nextInt();
		 System.out.println("");
		 
		 if(board[linhaAtual][coluna] == "p" && linhaAtual == 6 && linhaFinal < 6 && linhaFinal > 3 && board[linhaFinal][coluna] == " ") {
			 
			 board[linhaFinal][coluna] = board[linhaAtual][coluna];
			 board[linhaAtual][coluna] = " ";
			 
			 imprimirBoard(board);
		 }else if (board[linhaAtual][coluna] == "p" && linhaAtual != 6 && (linhaAtual - linhaFinal == 1) && board[linhaFinal][coluna] == " ") {
			 board[linhaFinal][coluna] = board[linhaAtual][coluna];
			 board[linhaAtual][coluna] = " ";
			 
			 imprimirBoard(board);
		 }else{
			 System.out.println("JOGADA INVÁLIDA");
			 imprimirBoard(board);

		 }
		 
		 System.out.println("");
		 System.out.println("Vez do jogador MAIÚSCULO (P)");
		 System.out.println("Em qual coluna está o peão que você quer movimentar (1 - 8)");
		 int colunaP = input.nextInt();
		 System.out.println("Em qual linha está o peão que você quer movimentar (0 - 7)");
		 int linhaAtualP = input.nextInt();
		 System.out.println("Escolha para qual casa você deseja movimentar (0 - 7)");
		 int linhaFinalP = input.nextInt();
		 System.out.println("");
		 
		 if(board[linhaAtualP][colunaP] == "P" && linhaAtualP == 1 && linhaFinalP > 1 && linhaFinalP < 4 && board[linhaFinalP][colunaP] == " ") {
			 
			 board[linhaFinalP][colunaP] = board[linhaAtualP][colunaP];
			 board[linhaAtualP][colunaP] = " ";
			 
			 imprimirBoard(board);
		 }else if (board[linhaAtualP][colunaP] == "P" && linhaAtualP != 1 && (linhaFinalP - linhaAtualP == 1) && board[linhaFinalP][colunaP] == " ") {
			 board[linhaFinalP][colunaP] = board[linhaAtualP][colunaP];
			 board[linhaAtualP][colunaP] = " ";
			 
			 imprimirBoard(board);
		 }else{
			 System.out.println("JOGADA INVÁLIDA");
			 imprimirBoard(board);

		 }
		 } 
		 
		 
		
		 //imprimirBoard(board);
	}
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}
}
