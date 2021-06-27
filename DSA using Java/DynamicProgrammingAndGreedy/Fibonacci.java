
/**
 * 1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8
 */


import java.util.*;

public class Fibonacci {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] memo = new Integer[n + 1];
        System.out.println(fib(n, memo));
        sc.close();
    }

    public static int fib(int n, Integer[] memo) {
        if (n == 0 || n == 1)
            return n;

        if (memo[n] != null) {
            return memo[n];
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];

    }

}