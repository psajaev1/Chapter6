
/**
 * Phillip Sajaev
 * 2/26/17
 * Client Square class
 * Runs the Magic Square class
 */
import java.util.*;
public class ClientSquare
{
    public static void main(String[] args)
    {
        int[][] array1 = {{16,3,2,13},
                          {5,10,11,8},
                          {9,6,7,12},
                          {4,15,14,1}};
                         
        int[][] array2 = {{5,9,1},
                          {7,2,6},
                          {3,4,8}};
                          
                         
        int[][] array3 = {{11,24,7,20,3},
                          {4,12,25,8,16},
                          {17,5,13,21,9},
                          {10,18,1,14,22},
                          {23,6,19,2,15}};
                          
                          
        MagicSquare square1 = new MagicSquare(array1);
        MagicSquare square2 = new MagicSquare(array2);
        MagicSquare square3 = new MagicSquare(array3);
        
        //to tell if square 1 is magic
        if (square1.isMagic() )
            System.out.println("Square 1 is a magic square"); 
        else
            System.out.println("Square 1 is not a magic square");
            
            
        // to tell if square 2 is magic
        if (square2.isMagic() )
            System.out.println("Square 2 is a magic square");
        else
            System.out.println("Square 2 is not a magic square");
            
         for (int row = 0; row < 3; row++)
         {  
         for (int col = 0; col < 3; col++)
         {
             System.out.print(array2[row][col] + " ");
         }
            System.out.println();
        }   
            
         //to tell if square 3 is magic
        if (square3.isMagic() )
            System.out.println("Square 3 is a magic square.");
        else
            System.out.println("Square 3 is not a magic square.");
        }
    }