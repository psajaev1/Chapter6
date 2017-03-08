

public class MagicSquare
{
    int MagicNum;
    int [][] square;
    public MagicSquare(int[][] array)
    {
        MagicNum = 0;
        square = array;
        for (int k = 0; k < square.length; k++)
        {
            MagicNum += square[0][k];
        }
    }
    
    public boolean isMagic()
    {
       
       int testNum = 0;
       for (int row = 0; row < square.length; row++)
       {
           testNum = 0;
           for (int col = 0; col < square.length; col++)
           {
               testNum += square[row][col];
               
           }
           if (testNum != MagicNum) {
               System.out.print("Rows do not work!");
               return false;
            }
       }
       
       for (int col = 0; col < square.length; col++)
       {
           testNum = 0;
           for (int row = 0; row < square.length; row++)
           {
               testNum += square[row][col];
               
           }
           if (testNum != MagicNum) {
               System.out.println("Columns do not work!");
               return false;
            }
       }
       
       testNum=0;
       for ( int row = 0; row < square.length; row++) {
               testNum += square[row][row];
       }
       if (testNum != MagicNum) {
            System.out.println("Diag0 does not work!");
            return false;
        }
        
       testNum=0;
       for (int row = 0; square.length > row ; row++) {
               testNum += square[row][square[row].length - row - 1];
       } 
       if (testNum != MagicNum) {
           System.out.println("Diag1 does not work!");   
           return false;
        }
            
            
       return true;
}


    public int getMagicNum()
    {
        return MagicNum;   
    }
    
    public void setMagicSquare(int[][] array)
    {
        array = square;
    }
    
    public int addRow(int row)
    {
        int sum = 0;
        for (int col = 0; col < square.length; col++)
        {
             sum += square[row][col];
        }
        return sum;
    }
    
    public int addColumn(int col)
    {
        int sum = 0;
        for (int row = 0; row < square.length; row++)
        {
             sum += square[row][col];
        }
        return sum;   
    }
    
    public String toString()
    {
     String display = new String();
     
     display = "This is the the Magic Square.\n\n";
     
     for (int row = 0; row < square.length; row++)
     {
         for (int col = 0; col < square[row].length; col++)
         {
             display += square[row][col];
             display += " ";
         }
         display += "\n";
     }
     
     display += "\nThis is the magic number: ";
     display += MagicNum;
     
     if (this.isMagic())
     
        display += "\n\nThis square is a magic square.";
     else
        display += "\n\nThis square is not a magic square.";
     return display;
    }
}