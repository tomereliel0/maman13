
/**
 * Write a description of class Square3x3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square3x3
{
    final int BOARD_SIZE = 3;
    // instance variables - replace the example below with your own
    private int[][] _board;
    
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
