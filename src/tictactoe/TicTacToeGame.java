package tictactoe;

import java.util.*;

public class TicTacToeGame {
	Scanner sc = new Scanner(System.in);
	static char[] board = new char[10];
	static char pchoice, choice;

	public void Createboard() { // created board
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		System.out.println("Created board");
	}

	public void playerchoice() { // player chooses XorO
		System.out.println("Enter player choice");
		pchoice = sc.next().charAt(0);
		if (pchoice == 'X') {
			choice = '0';
			System.out.println("Player choice is X");
			System.out.println("Computer choice is O");
		} 
		else if(pchoice=='O') {
			choice = 'X';
			System.out.println("Player choice is O");
			System.out.println("Computer choice is X");
		}
		else {
			System.out.println("Invalid input");
		}
	}

	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj = new TicTacToeGame();
		obj.Createboard();
		obj.playerchoice();
	}

}
