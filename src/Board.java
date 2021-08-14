
public class Board {
    
    private Piece[][] gameBoard;
    private final int WIDTH = 7;
    private final int HEIGHT = 6;
    
    //Fills the gameBoard array with Piece objects
    public Board() 
    {
	this.gameBoard = new Piece[this.HEIGHT][this.WIDTH];
	for (int i = 0; i < gameBoard.length; i++)
	{
	    for (int j = 0; j < gameBoard[i].length; j++)
	    {
		gameBoard[i][j] = new Piece();
	    }
	}
    }
    
    //Prints the board. Remember: bottom row is the i=0 array to facilitate placing the tokens
    public String toString()
    {
	String build = "\n 1 2 3 4 5 6 7\n---------------\n";
	for (int i = gameBoard.length -1; i >= 0; i--)
	{
	    build = build + "|";
	    for (int j = 0; j < gameBoard[i].length; j++)
	    {
		build = build + "\n---------------\n";
	    }
	}
	return build;
    }

}
