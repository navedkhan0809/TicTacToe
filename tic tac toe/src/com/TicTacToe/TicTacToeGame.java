package com.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		
		char[] board = createBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? '0':'O';
		showBoard(board);
		startMove(board);
	}
	

	//UC1//
	public static char[] createBoard() {
		char[] board = new char[10];
		for(int i=0;i<board.length;i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	
	//UC2//
	public static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your Letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}
	
	//UC3//
	public static void showBoard(char[] board) {
		System.out.println("\n " + board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("______________");
		System.out.println("\n " + board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("______________");
		System.out.println("\n " + board[7] + "|" + board[8] + "|" + board[9]);
		System.out.println("______________");	
	}
	
	//UC4//
	public static char startMove(char[] board) {
		Scanner userInput = new Scanner(System.in);
		char position = chooseUserLetter(userInput);
		if (position<1 && position >9) {
			board[] = userLetter;
		}
			return userInput.next().toUpperCase().charAt(0);
		}
	}

}
