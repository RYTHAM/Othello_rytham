package Othello;
  
public class Othello{

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame()
	{
		new Board();		 
		
		Board.showStatus("player white turn");
       
	}
}

