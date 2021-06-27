import java.util.*;

public class ClimbStairWithMinMoves {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        Integer[] dp = new Integer[n + 1];

        dp[n] = 0; // why 0, because from 10 to 10 there is 0 moves
        // why not 1, because 1 will used when 10 to 10 there is 1 path stay there.

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }

        }

        System.out.println(dp[0]);
        sc.close();
    }

}