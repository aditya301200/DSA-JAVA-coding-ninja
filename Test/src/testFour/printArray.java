package testFour;
/*
Problem Statement: Print 2D array
Problem Level: EASY
Problem Description:
Given a 2D integer array with n rows and m columns.
Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
Input format :
Line 1 : No of rows(n) & No of columns(m) (separated by space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on

Sample Input :
3 3
1    2    3
4    5    6
7    8    9

Sample Output :
1    2    3
1    2    3
1    2    3
4    5    6
4    5    6
7    8    9
 */
import java.util.*;
public class printArray {
    private static void printArr(int[][] arr, int row, int col) {

        for(int i=0; i<row; i++) {
            for(int k =0; k<row-i; k++) {
                for(int j=0; j<col; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr,row,col);
    }
}
