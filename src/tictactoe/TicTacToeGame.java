package tictactoe;
import java.util.*;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	public char[] arr=new char[10];
	public void UC1(){
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
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
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.UC1();
		obj1.playerchoice();
	}

}
