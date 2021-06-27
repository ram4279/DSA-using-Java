import java.util.*;

public class Knapsack01 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++)
            values[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            weights[i] = sc.nextInt();

        int weight = sc.nextInt();
        sc.close();

        int[][] dp = new int[n + 1][weight + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                    int donotbat = dp[i - 1][j];
                    if(j >=  weights[i-1]){
                        int batted = values[i-1] + dp[i-1][j - weights[i-1]];
                        dp[i][j] = Math.max(donotbat, batted);
                    } else {
                        dp[i][j] = donotbat;
                    }
                    
            }
        }

        System.out.println(dp[n][weight]);

    }
}