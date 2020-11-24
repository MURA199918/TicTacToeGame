package tictactoe;

import java.util.*;

public class TicTacToeGame {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	static char[] board = new char[10];
	static char pchoice, choice;
	static String toss;
	static String result;
	static int var=0;

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
		} else if (pchoice == 'O') {
			choice = 'X';
			System.out.println("Player choice is O");
			System.out.println("Computer choice is X");
		} else {
			System.out.println("Invalid input");
		}
	}

	public void showboard() {
		System.out.println("Displaying the current board..");
		System.out.println("|---|---|---|");
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		System.out.println("|---|---|---|");
	}

	public void playerindex() {
			while (true) {
				System.out.println("Player select your index");
				int pindex = sc.nextInt();
				if (pindex < 1 || pindex > 9) {
					System.out.println("Invalid Input");
					continue;
				} else if (board[pindex] == ' ') {
					board[pindex] = pchoice;
					showboard();
					break;
				} else {
					System.out.println("Invalid player input");
					continue;
				}
			} 
	}

	public void toss() {
		System.out.println("Its toss time");
		if (Math.random() < 0.5) {
			System.out.println("Its heads and player starts first");
			toss = "heads";
		} else {
			System.out.println("Its tails and computer starts first");
			toss = "tails";
		}
	}

	public void wintiechange() {
		if( (board[1]=='X' && board[2]=='X' && board[3]=='X') || (board[1]=='O' && board[2]=='O' && board[3]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[4]=='X' && board[5]=='X' && board[6]=='X') || (board[4]=='O' && board[5]=='O' && board[6]=='O')){
			if( (pchoice=='X') || (pchoice=='O')){
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[7]=='X' && board[8]=='X' && board[9]=='X') || (board[7]=='O' && board[8]=='O' && board[9]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[1]=='X' && board[4]=='X' && board[7]=='X') || (board[1]=='O' && board[4]=='O' && board[7]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[2]=='X' && board[5]=='X' && board[8]=='X') || (board[2]=='O' && board[5]=='O' && board[8]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[3]=='X' && board[6]=='X' && board[9]=='X') || (board[3]=='O' && board[6]=='O' && board[9]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[1]=='X' && board[5]=='X' && board[9]=='X') || (board[1]=='O' && board[5]=='O' && board[9]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else if( (board[3]=='X' && board[5]=='X' && board[7]=='X') || (board[3]=='O' && board[5]=='O' && board[7]=='O')) {
			if( (pchoice=='X') || (pchoice=='O')) {
				System.out.println("Player is winner");
				result="Win";
				var=1;
			}
			else {
				System.out.println("Computer is winner");
				result="Win";
				var=1;
			}
		}
		else {
			System.out.println("Switch turns");
		}
	}

	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj = new TicTacToeGame();
		obj.Createboard();
		obj.playerchoice();
		obj.showboard();
		obj.toss();
		obj.playerindex();
		obj.wintiechange();
	}

}
