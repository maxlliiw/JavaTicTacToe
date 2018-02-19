package collection;

public class TicTacToe {

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];

        for(int i=0; i < ROWS; i++)
            for(int j=0; j < COLUMNS; j++)
                board[i][j] = " ";

    }
    public String getBoard(int a, int b)
    {
    	return board[a][b];
    }
    public boolean checkWinBoard()
    {
    	boolean win = false;
    	if(board[0][0].equals("O")&&board[0][1].equals("O")&&board[0][2].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[1][0].equals("O")&&board[1][1].equals("O")&&board[1][2].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[2][0].equals("O")&&board[2][1].equals("O")&&board[2][2].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[0][0].equals("O")&&board[1][0].equals("O")&&board[2][0].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[0][1].equals("O")&&board[1][1].equals("O")&&board[2][1].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[0][2].equals("O")&&board[1][2].equals("O")&&board[2][2].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[0][0].equals("O")&&board[1][1].equals("O")&&board[2][2].equals("O"))
    	{
    		win = true;
    	}
    	else if(board[0][2].equals("O")&&board[1][1].equals("O")&&board[2][0].equals("O"))
    	{
    		win = true;
    	}
    	else
    	{
    		win = false;
    	}
    	return win;
    }
    
    public void set(int i, int j, String player) {
        if(board[i][j].equals(" ")) board[i][j] = player;
    }
    
    public String toString() {
        String r = "";
        for(int i=0; i < ROWS; i++) {
            r = r + "|";
            for(int j=0; j < COLUMNS; j++) r = r + board[i][j];
            r = r + "|\n";

        }
        return r;
    }

private String[][] board;
private static final int ROWS = 3;
private static final int COLUMNS = 3;

}
