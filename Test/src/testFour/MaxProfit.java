package testFour;
/*
Problem Statement: Maximum Profit on App
Problem Level: MEDIUM
Problem Description:
You have made a smart phone app and want to set its price such that the profit earned is maximised.
There are certain buyers who will buy your app only if
their budget is greater than or equal to your price.
You will be provided with a list of size N having budgets of buyers and
you need to return the maximum profit that you can earn.
Lets say you decide that price of your app is Rs. x and there are N number of buyers.
So maximum profit you can earn is :
 m * x

where m is total number of buyers whose budget is greater than or equal to x.
Input format :
Line 1 : N (No. of buyers)
Line 2 : Budget of buyers (separated by space)

Output Format :
 Maximum profit

Constraints :
1 <= N <= 10^6

Sample Input 1 :
4
30 20 53 14

Sample Output 1 :
60

Sample Output 1 Explanation :
Price of your app should be Rs. 20 or Rs. 30.
For both prices, you can get the profit Rs. 60.

Sample Input 2 :
5
34 78 90 15 67

Sample Output 2 :
201

Sample Output 2 Explanation :
Price of your app should be Rs. 67. You can get the profit Rs. 201 (i.e. 3 * 67).
 */
import java.util.*;
public class MaxProfit {
    private static int appPrice(int[] arr, int n) {
        // store maximum profit
        int ans = Integer.MIN_VALUE;

        // store price of item
        int price = 0;

        // sort the array
        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            // Count of buyers with
            // budget >= arr[i]
            int cnt = n-i;

            // update maximum profit
            if(ans < cnt*arr[i]) {
                price = arr[i];
                ans = cnt*arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(appPrice(arr,n));
    }
}
