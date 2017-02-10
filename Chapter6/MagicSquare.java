

/**
 * Write a description of class MagicSquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicSquare
{
    /** description of instance variable x (add comment for each instance variable) */
    private int [][] square;

    /**
     * Default constructor for objects of class MagicSquare
     */
    public MagicSquare()
    {
        
    }

    public MagicSquare(int [][] array){
        
        square = array;
    }
    
    public boolean isMagic(){
        
        boolean decision = true;
        
        return decision;
    }
    
    public int getMagicNum(){
        
        
    }
    
    
    
    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add
    
    
    public static int sum2DArray(int [][] scores)
    {



        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)
                System.out.print (scores[row][col] + "\t");

            System.out.println();
        }


        return 0;

    }
    
      public int sumOneRow2DArray(int row, int [][] array)
    {   int total = 0;

        for (int col = 0; col < array[row].length; col++){
            total += row[col];
            


        }
        return total;

    }
    
     public int sumOneColRow2DArray(int col, int [][] array)
    {   int total = 0;

        for (int col = 0; i < array.length; col++){
            total += array[i][row[col - 1]];
            


        }
        return total;
        
    }
    
    
    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }
    
        /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
   public static int[] doubleSize(int[] array)
   {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

    }
}
