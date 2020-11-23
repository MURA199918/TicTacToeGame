package tictactoe;
import java.util.*;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	public char[] board=new char[10];
	public void playerchoice() {
		System.out.println("Enter player choice");
		char pchoice=sc.next().charAt(0);
		if(pchoice!='X' || pchoice!='O') {
			System.out.println("Invalid player choice");
		}
		else if(pchoice=='X') {
			System.out.println("Player choice is X");
			System.out.println("Computer choice is O");
		}
		else {
			System.out.println("Player choice is O");
			System.out.println("Computer choice is X");
		}
	}
	public void showboard(){
		System.out.println("Displaying the current board..");
		System.out.println("|---|---|---|"); 
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |"); 
        System.out.println("|---|---|---|"); 
	}
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.playerchoice();
		obj1.showboard();
	}

}
