

import java.util.*;
public class GameOfNim
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        Random num = new Random ();
        
       
        
        int[] row1 = new int[3];
        int[] row2 = new int[4];
        int[] row3 = new int[5];
        
        for (int k = 0; k < row1.length; k++)
        {
            System.out.print("O");
        }
        System.out.println();
        for (int k = 0; k < row2.length; k++)
        {
            System.out.print("O");
        }
        System.out.println();
        for (int k = 0; k < row3.length; k++)
        {
            System.out.print("O");
        }
        System.out.println();
         
        System.out.println("Your turn");
        System.out.println("What row are you selecting from");
        
        int row = reader.nextInt();
        
        System.out.println("What column are you selecting from");
        
       int column = reader.nextInt();
        
        
    }
    
    
}
      