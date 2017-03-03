package part1;

import java.util.Random;

/**
 * Fill this 20 x 20 int array with random numbers. The numbers should have
 * values between 0 and 99. Then use a nested loop to print out the array row by
 * row with the numbers in evenly spaced columns. 
 *
 * @author Austin Abild
 */
public class T1P1 {

    public static void main(String[] args) {
        Random gen = new Random();
        int[][] a = new int[20][20];

        for(int row = 0; row < a.length; row++) {
            for(int col = 0; col < a[row].length; col++) {
                a[row][col] = gen.nextInt(100);
                System.out.printf("%2d ", a[row][col]);                        
            }
            System.out.println("");
        }
    }
}