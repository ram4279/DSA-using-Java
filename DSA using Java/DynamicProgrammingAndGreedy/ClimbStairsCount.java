
/**
 * 
 * 1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.
 */
import java.util.*;

public class ClimbStairsCount {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Integer[] memo = new Integer[n + 1];
        // System.out.println(getPathsUsingMemo(0, n, memo));
        System.out.println(getPathsUsingTabulation(n));
        sc.close();
    }

    private static int getPathsUsingTabulation(int n) {
        int[] table = new int[n + 1];
        table[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                table[i] = table[i-1];
            } else if(i == 2) {
                table[i] = table[i-1] + table[i-2];
            } else {
                table[i] = table[i - 1] + table[i - 2] + table[i-3];
            }
        }
        return table[n];
    }

    public static int getPathsUsingMemo(int i, int n, Integer[] memo) {
        if (i == n) {
            return 1;
        }
        if (i > n) {
            return 0;
        }

        if (memo[i] != null)
            return memo[i];

        int oneStepPath = getPathsUsingMemo(i + 1, n, memo);
        int twoStepPath = getPathsUsingMemo(i + 2, n, memo);
        int threeStepPath = getPathsUsingMemo(i + 3, n, memo);

        return memo[i] = oneStepPath + twoStepPath + threeStepPath;

    }

}