
public class TicTacToeGame {
	
	public static void board()
	{
		char[] board = new char[10];
		
		for (int i = 1 ; i<board.length ; i++)
		{
			board[i] = ' ';
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the game . ");
		board();
		
		
	}

}

