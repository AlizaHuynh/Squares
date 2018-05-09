/*
 * Aliza Huynh
 * Squares.java
 * This program takes the first ten numbers and displays the square
 */

package squares;
import java.util.*;
/**
 *
 * @author alhuy9821
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        String [] number;
//        number = new String[10];
//        int [] numberValue = {0,1,2,9};
//        numberValue[2] = 4;
//        
//        for(int i = 0; i < numberValue.length; i++) {
//            System.out.println(numberValue[i]);
//        }
        
        ArrayList<Integer> squares = new ArrayList();
        System.out.println("ARRAYLISTS \n**************");
        for (int i = 0; i < 10; i++)
        {
            squares.add(i, i * i);
        }
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("NUMBERS: " + i + " SQUARES: " + squares.get(i));
        }
    }
    
}
