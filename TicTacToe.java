import java.util.Scanner;

public class TicTacToe {
	char player = 'x';
	char board[] = new char[9];
	public void start(){
		CreateBoard();
	}
	
	public void dialouge(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "      0|1|2");
		System.out.println("-----      -----");
		System.out.println(board[3] + "|" + board[4] + "|" + board[5] + "      3|4|5");
		System.out.println("-----      -----");
		System.out.println(board[6] + "|" + board[7] + "|" + board[8] + "      6|7|8");
		int spacesAvail = 0;
		for(int i = 0 ; i < 9; i++){
			if(!(spaceInUse(i, board))){
				spacesAvail++;
			}
		}
		if(isFinished(board) == true){
			System.out.println("Game over.");
			System.exit(0);
		}
		if(spacesAvail == 0){
			System.out.println("Game over.");
			System.exit(0);
		}
		System.out.println("Player " + player + ", choose a location to place your " + player + "(0-8):");
		int input = keyboard.nextInt();
		if(spaceInUse(input, board) == true){
			System.out.println("Space is in use, please try again.");
			dialouge();
		}
		else{
			MakeMove(board, input);
			ChangePlayer();
			dialouge();
		}
	}
	
	public void CreateBoard(){
		for (int i = 0; i < 9; i++){
			board[i] = ' ';
		}
		dialouge();
	}
	public char CurrentPlayer(){
		return player;
	}
	public void ChangePlayer(){
		if(player == 'o'){
			player = 'x';
		}
		else{
			player = 'o';
		}
	}
	public void MakeMove(char board[], int location){
		board[location] = player;
	}
	public boolean spaceInUse(int space, char board[]){
		if (board[space] == ' '){
			return false;
		}
		else{
			return true;
		}
	}
	
	
	public boolean isFinished(char board[]){
		if(board[0] == 'x' && board[1] == 'x' && board[2] == 'x'){
			return true;
		}
		else if(board[3] == 'x' && board[4] == 'x' && board[5] == 'x'){
			return true;
		}
		else if(board[6] == 'x' && board[7] == 'x' && board[8] == 'x'){
			return true;
		}
		else if(board[0] == 'x' && board[3] == 'x' && board[6] == 'x'){
			return true;
		}
		else if(board[1] == 'x' && board[4] == 'x' && board[7] == 'x'){
			return true;
		}
		else if(board[2] == 'x' && board[5] == 'x' && board[8] == 'x'){
			return true;
		}
		else if(board[0] == 'x' && board[4] == 'x' && board[8] == 'x'){
			return true;
		}
		else if(board[2] == 'x' && board[4] == 'x' && board[6] == 'x'){
			return true;
		}
		else if(board[0] == 'o' && board[1] == 'o' && board[2] == 'o'){
			return true;
		}
		else if(board[3] == 'o' && board[4] == 'o' && board[5] == 'o'){
			return true;
		}
		else if(board[6] == 'o' && board[7] == 'o' && board[8] == 'o'){
			return true;
		}
		else if(board[0] == 'o' && board[3] == 'o' && board[6] == 'o'){
			return true;
		}
		else if(board[1] == 'o' && board[4] == 'o' && board[7] == 'o'){
			return true;
		}
		else if(board[2] == 'o' && board[5] == 'o' && board[8] == 'o'){
			return true;
		}
		else if(board[0] == 'o' && board[4] == 'o' && board[8] == 'o'){
			return true;
		}
		else if(board[2] == 'o' && board[4] == 'o' && board[6] == 'o'){
			return true;
		}
		else{
			return false;
		}
		
	}
}

