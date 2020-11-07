package ticTacToe;

public class TicTacToeGame {
	
	public static void main(String args[]) {
		gameBoard();
		}
	
	public static char[] gameBoard() {
	System.out.println("Let's play TicTacToe");
		char[] board = new char[10];
	
			for (int  i=1; i<10; i++) {
				board[i]= ' ';
			}
				return board;
		}
}

