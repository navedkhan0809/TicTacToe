package com.TicTacToe;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		
		char[] board = createBoard();
		System.out.println();
	}
	
	//uc1//
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i=0;i<board.length;i++) {
			board[i] = ' ';
	}
	return board;
	}
		
}
