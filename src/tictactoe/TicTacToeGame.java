package tictactoe;

public class TicTacToeGame {
	public char[] arr=new char[10];
	public void UC1(){
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.UC1();
	}

}
