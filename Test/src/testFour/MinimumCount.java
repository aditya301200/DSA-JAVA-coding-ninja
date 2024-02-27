package testFour;
/*
Problem Statement: Minimum Count
Problem Level: MEDIUM
Problem Description:
Given an integer N, find and return the count of minimum numbers,
sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}.
Output will be 1, as 1 is the minimum count of numbers required.
Note : x^y represents x raise to the power y.

Input Format :
Integer N

Output Format :
Required minimum count

Constraints :
1 <= N <= 50

Sample Input 1 :
12

Sample Output 1 :
3

Sample Output 1 Explanation :
12 can be represented as :
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
2^2 + 2^2 + 2^2
As we can see, the output should be 3.
Sample Input 2 :
9

Sample Output 2 :
1
 */
import java.util.*;
public class MinimumCount {
    private static int getMinSquare(int n) {
        if(n <=3) {
            return n;
        }
        int res = n;

        for(int i=1; i<=n; i++) {
            int temp = i*i;
            if(temp > n) {
                break;
            } else {
                res = Math.min(res, 1+getMinSquare(n-temp));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getMinSquare(n));
    }
} // T.C. = O(2^n) && S.C. = O(n)
