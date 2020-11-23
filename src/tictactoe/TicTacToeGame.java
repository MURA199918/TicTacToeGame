package tictactoe;
import java.util.*;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	public char[] board=new char[10];
	char pchoice,cchoice;
	int pindex,cindex;
	String toss;
	public void playerchoice() {
		if(toss=="heads") {
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
		else {
			System.out.println("Enter computer choice");
			  cchoice=sc.next().charAt(0);
			  if(cchoice!='X' || cchoice!='O') {
				System.out.println("Invalid player choice");
			  }
			  else if(cchoice=='X') {
				pchoice='O';
				System.out.println("Player choice is O");
				System.out.println("Computer choice is X");
			  }
			  else {
				pchoice='X';
				System.out.println("Player choice is X");
				System.out.println("Computer choice is O");
			  }
		}
	}
	public void showboard(){
		System.out.println("Displaying the current board..");
		System.out.println("|---|---|---|"); 
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2]  + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5]  + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8]  + " |"); 
        System.out.println("|---|---|---|"); 
	}
	public void playerindex() {
		System.out.println("select player index");
		pindex=sc.nextInt();
		if(board[pindex]==0) {
			board[pindex]=pchoice;
		}
		else {
			System.out.println("Invalid player input");
		}
		System.out.println("select computer index");
		cindex=sc.nextInt();
		if(board[cindex]==0) {
			board[cindex]=cchoice;
		}
		else {
			System.out.println("Invalid computer input");
		}
	}
	public void toss() {
		if(Math.random()<0.5) {
			System.out.println("Its heads and player starts first");
			toss="heads";
		}
		else {
			System.out.println("Its tails and computer starts first");
			toss="tails";
		}
	}
	public void wintiechange() {
		int temp=0;
		if(board.length!=9) {
			System.out.println("Switch turns");
		}
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
            //For X winner 
            if (line.equals("XXX")) { 
                if(pchoice=='X') {
                	System.out.println("Player is winner");
                }
                else {
                	System.out.println("Computer is winner");
                }
            } 
              
            // For O winner 
            else if (line.equals("OOO")) { 
                if(pchoice=='O') {
                	System.out.println("Player is winner");
                }
                else {
                	System.out.println("Computer is winner");
                }
            } 
            else {
            	temp=1;
            }
		}
		if(temp==1) {
			System.out.println("Its a tie game");
		}
		
	}
	public static void main(String[] args) {
		System.out.println(".........Welcome to TicTacToeGame.......");
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.playerchoice();
		obj1.showboard();
		obj1.playerindex();
		obj1.wintiechange();
	}

}
