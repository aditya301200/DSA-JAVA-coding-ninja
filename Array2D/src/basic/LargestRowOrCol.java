package basic;

import java.util.Scanner;

/*
Problem Statement: Largest Row or Column
Problem Level: MEDIUM
Problem Description:
For a given two-dimensional integer array/list of size (N x M),
you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first.
And if ith row and jth column has the same largest sum, consider the ith row as answer.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.

Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.

Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec

Sample Input 1 :
1
2 2
1 1
1 1

Sample Output 1 :
row 0 2

Sample Input 2 :
2
3 3
3 6 9
1 4 7
2 8 9
4 2
1 2
90 100
3 40
-10 200

Sample Output 2 :
column 2 25
column 1 342
 */
public class LargestRowOrCol {
    private static void printArr(int[][] arr, int row, int col) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // max sum of row
    private static int[] rowSum(int[][] arr, int row, int col) {
        int[] newArr = new int[2]; // 0th index for row number and 1th index for maxSum
        int maxRowSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                sum+=arr[i][j];
            }
            if(maxRowSum < sum) {
                maxRowSum = sum;
                newArr[0] = i;
            }
            sum=0;
        }
        newArr[1] = maxRowSum;
        return newArr;
    }

    // max sum of column
    private static int[] colSum(int[][] arr, int row, int col) {
        int[] newArr = new int[2]; // 0th index for row number and 1th index for maxSum
        int maxColSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                sum+=arr[j][i];
            }
            if(maxColSum < sum) {
                maxColSum = sum;
                newArr[0] = i;
            }
            sum=0;
        }
        newArr[1] = maxColSum;
        return newArr;
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
//		printArr(arr,row,col);
        int[] rowSum = rowSum(arr, row, col);
        int[] colSum = colSum(arr, row, col);
        if(rowSum[1]>=colSum[1]) {
            System.out.print("row "+rowSum[0]+" "+rowSum[1]);
        } else {
            System.out.print("column "+colSum[0]+" "+colSum[1]);
        }
    }
}
