package problems;

import java.util.Scanner;

/*
Problem Statement: Winning strategy
Problem Level: MEDIUM
Problem Description:
Our college team is going to the sports-fest to play a football match with our coach.
There are n players in our team, numbered from 1 to n.
The coach will know the position of another team hence create a winning strategy.
He creates the position of every player in a specific order so that we will win and
then he starts swapping two players at a time to form the positions.
He swaps players in such a way that it can't be understood by another team:
1. Any player can swap with the player directly at front him
2. One player can swap at most with two other players
If the specific order is formed then our team will win otherwise we will lose
Input Format
The First line contains numbers of players in team: n
The second line contains n space separated integers denoting the specific position of players:
i-th integer denotes the position of Ai player in winning strategy

Output Format
If our team wins print "YES"(without quotes) and in next line print the minimum numbers of
swapping required to form this specific order otherwise print "NO"(without quotes)

Constraints
1 =< n <= 10^5
1 <= Ai <= n

Sample Input1:
5
2 1 5 3 4

Sample Output1:
YES
3

Sample Input2:
5
2 5 1 3 4

Sample Output3:
NO

Explanation
In the First Sample case,
    Initial state: 1 2 3 4 5
    Three moves required to form this order:
    1 2 3 4 5 -> 1 2 3 5 4 -> 1 2 5 3 4 -> 2 1 5 3 4
In the second case, no way to form this specific order
 */
public class WinningStrategy {
    private static boolean strategy(int[] arr, int n){
        int cnt = 0;
        for(int i=n-1; i>=2; i--){
            if(arr[i]==i+1){
                continue;
            } else if(arr[i-2]==i+1){
                int temp = arr[i];
                arr[i] = arr[i-2];
                arr[i-2] = temp;
                cnt+=2;
            } else if(arr[i-1] == i+1){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                cnt++;
            } else{
                return false;
            }
        }
        if(arr[0] == 1 && arr[1] == 2){
            return true;
        } else if(arr[0]==2 && arr[1]==1){
            arr[0] = 1;
            arr[1] = 2;
            cnt++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean ans = strategy(arr,n);
        if(ans){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
