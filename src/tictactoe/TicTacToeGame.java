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

	public void showboard(){
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
		System.out.println("select player index");
		int pindex=sc.nextInt();
		if(board[pindex]==' ') {
			board[pindex]=pchoice;
		}
		else {
			System.out.println("Invalid player input");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj = new TicTacToeGame();
		obj.Createboard();
		obj.playerchoice();
		obj.showboard();
		obj.playerindex();
	}

}
