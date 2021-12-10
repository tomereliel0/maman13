
/**
 * Write a description of class Sudoku here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sudoku
{
    final int GAME_SIZE = 3;
    private Square3x3[][] _game;
    
    public Sudoku()
    {
        _game = new Square3x3[GAME_SIZE][GAME_SIZE];
        for (int i=0;i<GAME_SIZE;i++)
        {
            for(int j=0;j<GAME_SIZE;j++)
            {
                _game[i][j] = new Square3x3();
            }
        }
    }
    
    public Sudoku(Square3x3[][] square3x3Array)
    {
        this();
        for(int i = 0; i<GAME_SIZE; i++)
        {
            for (int j = 0; j<GAME_SIZE; j++)
            {
                _game[i][j] = new Square3x3(square3x3Array[i][j]);
            }
        }
    }

    public Boolean isValid()
    {
        boolean isValid = true;
        boolean[][] valuesRows = new boolean[9][10];
        boolean[][] valuesCols = new boolean[9][10];
        for(int i = 0; i<GAME_SIZE && isValid; i++)
        {
            for (int j = 0; j<GAME_SIZE && isValid; j++)
            {
                if(_game[i][j].allThere())
                {
                    for(int h = 0;h<3;h++)
                    {
                    _game[i][j].whosThereRow(h,valuesRows[h+(i*3)]);
                    _game[i][j].whosThereCol(h,valuesCols[h+(j*3)]);  
                    }
                    
                }
                else
                {
                    isValid = false;
                }
            }
        }
        for(int i=0;i<9 && isValid;i++)
        {
            for (int j=1;j<10 && isValid;j++)
            {
                if(!valuesRows[i][j] || !valuesCols[i][j])
                {
                    isValid = false;
                }
            }
        }
        
        return isValid;
    }
}
