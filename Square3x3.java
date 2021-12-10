
/**
 * This class represent 3x3 table.
 * in each table a number between 1 to 9.
 *
 * @author Tomer Eliel
 * @version 208114652
 */
public class Square3x3
{
    final int BOARD_SIZE = 3;
    // instance variables - replace the example below with your own
    private int[][] _board;
    
    /**
     * Constructoy for object of class Square3x3.
     * Constructs a new board w/ defualt size and values (-1).
     * 
     */
    public Square3x3()
    {
        _board = new int[BOARD_SIZE][BOARD_SIZE];
        for(int i=0;i<BOARD_SIZE;i++)
        {
            for(int j=0;j<BOARD_SIZE;j++)
            {
                _board[i][j] = -1;
            }
        }
    }
        /**
     * Constructoy for object of class Square3x3.
     * Constructs a new board w/ defualt size and copies values from given array.
     * 
     * @param array - 2D array from type int with values
     * 
     */ 
    public Square3x3(int[][]array)
    {
        _board = new int[BOARD_SIZE][BOARD_SIZE];
        for(int i=0;i<array.length && i<BOARD_SIZE;i++)
        {
            for(int j=0;j<array[i].length && j<BOARD_SIZE;j++)
            {
                    _board[i][j] = array[i][j];
            }
        }
        for (int i=0;i<BOARD_SIZE;i++)
        {
            for(int j=0; j<BOARD_SIZE;j++)
            {
                if(_board[i][j]==0)
                {
                    _board[i][j]=-1;
                }
            }
        }
    }
    
            /**
     * Copy Constructor for object of class Square3x3.
     * Constructs a new board w/ defualt size and initializes values of another Squere3x3 object.
     * 
     * @param other - Squere3x3 type object
     * 
     */ 
    public Square3x3(Square3x3 other)
    {
        _board = new int[BOARD_SIZE][BOARD_SIZE];
        for(int i=0;i<BOARD_SIZE;i++)
        {
            for(int j=0;j<BOARD_SIZE;j++)
            {
                _board[i][j] = other._board[i][j];
            }
        }
    }
    
    public int getCell(int row,int col)
    {   
        if(row>=BOARD_SIZE || col >= BOARD_SIZE || row < 0 || col < 0)
        {
            return -1;
        }
        return _board[row][col];
    }
    
    public void setXY(int row, int col, int value)
    {
        if(row < BOARD_SIZE && col < BOARD_SIZE && row >= 0 && col >= 0)
        {
            _board[row][col] = value;
        }
    }
    
    public String toString()
    {
        String boardString="";
        for(int i = 0;i<BOARD_SIZE;i++)
        {
            for (int j=0; j<BOARD_SIZE;j++)
            {
                boardString += _board[i][j]+"\t";
            }
            boardString+="n";
        }
        return boardString;
    }

    public boolean allThere()
    {
        boolean flag = true;
        for(int n=1;n<10 && flag;n++)
        {
            flag = false;
            for (int i=0;i<BOARD_SIZE && !flag ;i++)
            {
                for(int j =0;j<BOARD_SIZE && !flag ;j++)
                {
                    if(_board[i][j] == n)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
    
    public void whosThereRow(int row, boolean[] values)
    {
         for(int n=1;n<10;n++)
        {
            for (int j=0;j<BOARD_SIZE ;j++)
            {
                if(_board[row][j] == n )
                {
                    values[n] = true;
                }
            }
        }
    }
    
    public void whosThereCol(int col, boolean[] values)
    {
         for(int n=1;n<10;n++)
        {
            for (int i=0;i<BOARD_SIZE ;i++)
            {
                if(_board[i][col] == n )
                {
                    values[n] = true;
                }
            }
        }
    }
}
