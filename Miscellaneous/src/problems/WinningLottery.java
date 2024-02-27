package problems;

import java.util.Scanner;

/*
Problem Statement: Winning Lottery
Problem Level: EASY
Problem Description:
Harshit knows by his resources that this time the winning lottery number is the smallest number
whose sum of the digits is S and the number of digits is D.
You have to help Harshit and print the winning lottery number.

Input Format
The Input line contains two space-separated integers: S,D

Output Format
The output contains a single integer denoting the winning lottery number

Constraints
1 <= D <= 1000
1 <= S <= 9*D
Time Limit: 1 second

Sample Input1:
9 2

Sample Output1:
18

Explanation
There are many other possible numbers like 45, 54, 90, etc with the sum of digits as 9 and
number of digits as 2. The smallest of them is 18.
 */
public class WinningLottery {
    private static void findSmallest(int s, int d) {
        // If sum of digit is 0 then a number is possible only if number of digit is 1
        if(s==0) {
            if(d==1) {
                System.out.println("0");
            } else {
                System.out.println("Not possible");
            }
            return;
        }
        // if sum is greater than maximum possible value
        if(s > 9*d) {
            System.out.println("Not possible");
            return;
        }
        int[] res = new int[d];
        s-=1;

        for(int i=d-1; i>0; i--) {
            if(s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        // Whatever is left should be the most significant
        // digit.
        res[0] = s + 1;  // The initially subtracted 1 is incorporated here.
        int ans = 0;
        for(int i=0; i<d; i++) {
            ans=ans*10 + res[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        findSmallest(s,d);
    }
}
