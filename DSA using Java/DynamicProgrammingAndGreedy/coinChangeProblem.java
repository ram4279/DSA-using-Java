import java.util.*;

public class coinChangeProblem {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        System.out.println(coinChangeCount(arr, n, amount));
        sc.close();
    }

    public static int coinChangeCount(int[] arr, int n, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                int val = j - arr[i];
                dp[j] += dp[val];
            }
        }

        return dp[amount];
    }
}


/** Using recursion
 *    public static int coinChangeCount( int S[], int m, int n )
    {
    
        if (n == 0)
            return 1;
         
        if (n < 0)
            return 0;
    
        if (m <=0 && n >= 1)
            return 0;
    
        return coinChangeCount( S, m - 1, n ) + coinChangeCount( S, m, n-S[m-1] );
    }
 */