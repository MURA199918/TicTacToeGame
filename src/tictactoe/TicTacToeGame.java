package tictactoe;

import java.util.*;

public class TicTacToeGame {
	Scanner sc = new Scanner(System.in);
	char[] board = new char[10];
	char pchoice, choice;

	public void Createboard() { // created board
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		System.out.println("Created board");
	}

	public void playerchoice() { // player chooses XorO
		System.out.println("Enter player choice");
		pchoice = sc.next().charAt(0);
		if (pchoice != 'X' || pchoice != 'O') {
			System.out.println("Invalid player choice");
		} 
		else if (pchoice == 'X') {
			choice = '0';
			System.out.println("Player choice is X");
			System.out.println("Computer choice is O");
		} 
		else {
			choice = 'X';
			System.out.println("Player choice is O");
			System.out.println("Computer choice is X");
		}
	}

	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj = new TicTacToeGame();
		obj.Createboard();
	}

}
