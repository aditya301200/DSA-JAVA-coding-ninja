package intermediate;

import java.util.Scanner;

/*
Problem Statement: Tower of Hanoi
Problem Level: EASY
Problem Description:
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
The objective of the puzzle is to move all disks from source rod to destination
rod using third rod (say auxiliary).
The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.

Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.
Input Format :
Integer n

Output Format :
Steps in different lines (in one line print source and destination rod name separated by space)

Constraints :
0 <= n <= 20

Sample Input 1 :
2

Sample Output 1 :
a b
a c
b c

Sample Input 2 :
3

Sample Output 2 :
a c
a b
c b
a c
b a
b c
a c
 */
public class TowerOfHanoi {
    /*
     Follow the steps below to solve the problem:
     * Create a function towerOfHanoi where pass the N (current number of disk), from_rod, to_rod, aux_rod.
     * Make a function call for N – 1 th disk.
     * Then print the current the disk along with from_rod and to_rod
     * Again make a function call for N – 1 th disk.
     */
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println(from_rod +" "+ to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'a', 'c', 'b');
    }
} // T.C. = O(2^N) & S.C. = O(N)