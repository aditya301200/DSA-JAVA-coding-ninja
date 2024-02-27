package problems;
/*
Problem Statement: Taj Mahal Entry
Problem Level: MEDIUM
Problem Description:
TajMahal is one of the seven wonders of the world.
Aahad loves to travel places and wants to visit TajMahal.
He visited Agra to view TajMahal. There is a ticketing system at TajMahal.
There are total ‘n’ windows which provide the tickets to get entry into TajMahal.
There are ‘Ai’ people already present at each window to get the tickets.
Each window gives ticket to one person in one minute.
Initially, Aahad stands in front of the first window.
After each minute, if he did not get the ticket, he moves on to the next window to get the ticket.
If he is at window 1, he will move to 2.
If at 2nd, he will move to 3rd. If he is at last window,
he will move to 1st again and so on. Find the window number at which he will get the ticket.
Input Format:
First line contains a single integer ‘n’ denoting the no. of windows.
Next line contains ‘n’ space separated integers denoting the no. of people already
standing in front of the ith window. (1 <= i <= n)

Output Format:
Print a single integer denoting the window number that Aahad will get ticket from.

Constraints:
1 <= n <= 10^5
1 <= Ai <= 10^9

Sample Input:
4
2 3 2 0

Sample Output:
3

Explanation:
Aahad at Window 1: [2, 3, 2, 0]
Aahad at Window 2: [1, 2, 1, 0]
Aahad at Window 3: [0, 1, 0, 0]
So, when Aahad is at window 3, he got zero people before him. Hence,
he will get the ticket at window 3.
 */
import java.util.*;
public class TajMahalEntry {
    private static int findWindow(int[] arr, int n) {
        int i = 0 ;
        // check current window is not zero
        while(arr[i] != 0) {
            // iterate the array
            for(int j=0; j<n; j++) {
                // if arr at index j is zero leave it
                if(arr[j]==0) {
                    arr[j]=0;
                } else { // else reduce that by 1
                    arr[j]--;
                }
            }
            // move to next window
            i++;
            // if i is greater or equal to n then rotate the window to 1st again
            if(i>=n) {
                i = i%n;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findWindow(arr, n));
    }
}
