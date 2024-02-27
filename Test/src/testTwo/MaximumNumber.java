package testTwo;

import java.util.Scanner;

/*
Problem Statement: Maximum number
Problem Level: MEDIUM
Problem Description:
We are given a 4 digit number using digits 1 to 9.
What is the maximum 3 digit number that we can make by removing one digit from the given integer.
Input Format :
A 4 digit number

Output Format :
A 3 digit number

Sample Input :
5438

Sample Output :
548

Explanation :
1. If we remove 5, the new number is 438.
2. If we remove 4, the new number is 538.
3. If we remove 3, the new number is 548.
4. If we remove 8, the new number is 543.
Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548
 */
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Convert the number to a string for easier manipulation
        String numberStr = Integer.toString(num);

        // Initialize variables to store the maximum number and the index of the removed digit
        int maxNumber = 0;
        int removedDigitIndex = -1;

        // Iterate through each digit and try removing it to find the maximum 3-digit number
        for (int i = 0; i < numberStr.length(); i++) {
            // Create a new string without the digit at index i
            String newNumberStr = numberStr.substring(0, i) + numberStr.substring(i + 1);

            // Convert the new string back to an integer
            int newNumber = Integer.parseInt(newNumberStr);

            // Update maxNumber and removedDigitIndex if a greater 3-digit number is found
            if (newNumber > maxNumber) {
                maxNumber = newNumber;
                removedDigitIndex = i;
            }
        }
        System.out.println(maxNumber);
    }
} //T.C == O(N)
