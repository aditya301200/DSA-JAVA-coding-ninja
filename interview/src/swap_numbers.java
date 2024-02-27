/*
 Problem: Swap 2 numbers without using third variable
 */
import java.util.*;
public class swap_numbers {
    private static void swap(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }

}
