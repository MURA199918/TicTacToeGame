package tictactoe;

import java.util.*;

public class TicTacToeGame {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	static char[] board = new char[10];
	static char pchoice, choice;
	static String toss;
	static String result;

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
			choice = 'O';
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
			//while (true) {
				System.out.println("Player select your index");
				int pindex = sc.nextInt();
				if (pindex < 1 || pindex > 9) {
					System.out.println("Invalid Input");
					//continue;
				} else if (board[pindex] == ' ') {
					board[pindex] = pchoice;
					showboard();
					//break;
				} else {
					System.out.println("Invalid player input");
					//continue;
				}
			//} 
	}
	
	public void computerindex() {
		//while (true) {
			System.out.println("Computer selects it's index");
			int cindex = rn.nextInt(10) + 1;
			if (cindex < 1 || cindex > 9) {
				System.out.println("Invalid Input");
				//continue;
			} else if (board[cindex] == ' ') {
				board[cindex] = choice;
				showboard();
				//break;
			} else {
				System.out.println("Invalid player input");
				//continue;
			}
		//}
		
	}

	public void toss() {
		System.out.println("Its toss time");
		if (Math.random() < 0.5) {
			System.out.println("Its heads and player starts first");
			toss = "heads";
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
		} else {
			System.out.println("Its tails and computer starts first");
			toss = "tails";
			while (true) {
				System.out.println("Computer selects it's index");
				int cindex = rn.nextInt(10) + 1;
				if (cindex < 1 || cindex > 9) {
					System.out.println("Invalid Input");
					continue;
				} else if (board[cindex] == ' ') {
					board[cindex] = choice;
					showboard();
					break;
				} else {
					System.out.println("Invalid player input");
					continue;
				}
			}
		}
	}

	public void wintiechange() {
		int temp = 0;
		int var = 0;
		for (int i = 1; i < 10; i++) {
			if (board[i] == ' ') {
				System.out.println("Switch turns");
				var = 1;
				break;
			}
		}
		if (var != 1) {
			for (int a = 0; a < 8; a++) {
				String line = null;

				switch (a) {
				case 0:
					line = Character.toString(board[0] + board[1] + board[2]);
					break;
				case 1:
					line = Character.toString(board[3] + board[4] + board[5]);
					break;
				case 2:
					line = Character.toString(board[6] + board[7] + board[8]);
					break;
				case 3:
					line = Character.toString(board[0] + board[3] + board[6]);
					break;
				case 4:
					line = Character.toString(board[1] + board[4] + board[7]);
					break;
				case 5:
					line = Character.toString(board[2] + board[5] + board[8]);
					break;
				case 6:
					line = Character.toString(board[0] + board[4] + board[8]);
					break;
				case 7:
					line = Character.toString(board[2] + board[4] + board[6]);
					break;
				}
				// For X winner
				if (line.equals("XXX")) {
					if (pchoice == 'X') {
						System.out.println("Player is winner");
						result="Win";
					}
					else {
						System.out.println("Computer is winner");
						result="Win";
					}
				}

				// For O winner
				else if (line.equals("OOO")) {
					if (pchoice == 'O') {
						System.out.println("Player is winner");
						result="Win";
					} 
					else {
						System.out.println("Computer is winner");
						result="Win";
					}
				} 
				else {
					temp = 1;
				}
			}
		}
		if (temp == 1) {
			System.out.println("Its a tie game");
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
		obj.computerindex();

	}

}
