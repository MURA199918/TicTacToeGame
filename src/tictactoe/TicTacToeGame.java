package tictactoe;
import java.util.*;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	public char[] arr=new char[10];
	public char[][] board=new char[3][3];
	char pchoice,cchoice;
	int pindex,cindex;
	public void UC1(){
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void playerchoice() {
		System.out.println("Enter player choice");
		pchoice=sc.next().charAt(0);
		if(pchoice!='X' || pchoice!='O') {
			System.out.println("Invalid player choice");
		}
		else if(pchoice=='X') {
			cchoice='O';
			System.out.println("Player choice is X");
			System.out.println("Computer choice is O");
		}
		else {
			cchoice='X';
			System.out.println("Player choice is O");
			System.out.println("Computer choice is X");
		}
	}
	public void showboard(){
		System.out.println("Displaying the current board..");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(board[i][j]);
			}
		}
	}
	public void playerindex() {
		System.out.println("select player index");
		pindex=sc.nextInt();
		if(arr[pindex]==0) {
			arr[pindex]=pchoice;
			if(pindex<=3) {
				board[0][pindex-1]=arr[pindex];
			}
			else if(pindex>3 && pindex<=6) {
				board[1][pindex-4]=arr[pindex];
			}
			else {
				board[2][pindex-7]=arr[pindex];
			}
		}
		else {
			System.out.println("Invalid player input");
		}
		System.out.println("select computer index");
		cindex=sc.nextInt();
		if(arr[cindex]==0) {
			arr[cindex]=cchoice;
			if(cindex<=3) {
				board[0][cindex-1]=arr[cindex];
			}
			else if(cindex>3 && cindex<=6) {
				board[1][cindex-4]=arr[cindex];
			}
			else {
				board[2][cindex-7]=arr[cindex];
			}
		}
		else {
			System.out.println("Invalid computer input");
		}
	}
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.UC1();
		obj1.playerchoice();
		obj1.showboard();
		obj1.playerindex();
	}

}
