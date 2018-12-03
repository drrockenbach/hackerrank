package br.com.diomar.hackerrank.array;


/*Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following  hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
Our highest hourglass value is  from the hourglass:

0 4 3
  1
8 6 6
Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers
Input Format

Each of the  lines of inputs  contains  space-separated integers .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

image

The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4*/



import java.io.IOException;

public class HourGlass {

	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int max = 0;
        int actual = 0;

        for(int x = 0; x < arr[0].length -2; x++) {
        	for(int y = 0; y < arr[0].length -2; y++) {

                actual = sumHourGlass(arr, x, y);

                if (actual > max || (x == 0 && y == 0)) {
                    max = actual;
                }
            }
        }
        System.out.println("max ="+max);
        return max;

    }

    static int sumHourGlass(int[][] arr, int x, int y) {

        int value = 0;

        int posX = 0;
        int posY = 0;

        for(int i = x; i < x +3; i++) {
            for(int j = y; j < y +3; j++) {
                if ((posY == 1 && posX == 0) || (posY == 1 && posX == 2)) {
                	posX++;
                	System.out.print(arr[i][j]);
                    continue;
                }
                value += arr[i][j];
                System.out.print(arr[i][j]);
                posX++;
            }
            posY++;
            posX = 0;
            System.out.println();
        }
        System.out.println(value);
        System.out.println();
        return value;
    }
    
    public static void main(String[] args) throws IOException {
       
//    	int[][] arr = new int[][] {
//    		new int[] {1, 1, 1, 0, 0, 0},
//    		new int[] {0, 1, 0, 0, 0, 0},
//    		new int[] {1, 1, 1, 0, 0, 0},
//    		new int[] {0, 0, 2, 4, 4, 0},
//    		new int[] {0, 0, 0, 2, 0, 0},
//    		new int[] {0, 0, 1, 2, 4, 0}
//        };
    	
        
        /*int[][] arr = new int[][] {
        	new int[] {1, 1,  1, 0  ,0  ,0},
        	new int[] {0, 1,  0, 0  ,0  ,0},
        	new int[] {1, 1,  1, 0  ,0  ,0},
        	new int[] {0, 9,  2, -4 ,-4 ,0},
        	new int[] {0, 0,  0, -2 ,0  ,0},
        	new int[] {0, 0, -1, -2 ,-4 ,0}
        };*/
        
        int[][] arr = new int[][] {
        new int[] {-1, -1,  0, -9, -2, -2},
        new int[] {-2, -1, -6, -8, -2, -5},
        new int[] {-1, -1, -1, -2, -3, -4},
        new int[] {-1, -9, -2, -4, -4, -5},
        new int[] {-7, -3, -3, -2, -9, -9},
        new int[] {-1, -3, -1, -2, -4, -5}
        };
        
        long result = hourglassSum(arr);
        
        System.out.println(result);
       
    }
}
