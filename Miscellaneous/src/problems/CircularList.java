package problems;

import java.util.Scanner;

/*
Problem Statement: Circular List of Students
Problem Level: EASY
Problem Description:
You are given a circular list of students as follows:
0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11
This list is circular, means that 11 will follow 0 again.
You will be given the student number ‘k’ and some position ‘p’.
You will have to tell that if the list will start from (k+1)th student,
then which student will be at pth position.
Input Format:
First line will have an integer ‘t’, denoting the number of test cases.
Next line will have two space separated integers denoting the value of ‘k’ and ‘p’ respectively.

Output Format:
Print ‘t’ lines containing single integer denoting the student number.

Constraints:
1 <= t <= 10^5
0 <= i <= 11
1 <= p <= 12

Sample Input:
2
2 3
5 8

Sample Output:
5
1

Explanation:
First, list will start at 3. 3 -> 4 -> 5. Hence, 5 will be at third position.
Second, list will start at 6. 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> 0 -> 1.
Hence, 1 will be at 8th position.
 */
public class CircularList {
    private static int studentNum(int k, int p){
        int n = 11; // according to question
        int res;
        if((k+p) < n){
            res = k+p;
        } else{
            res = (k+p-1)%n;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int k = sc.nextInt();
            int p = sc.nextInt();
            System.out.println();
            System.out.print(studentNum(k, p));
        }
    }
}
