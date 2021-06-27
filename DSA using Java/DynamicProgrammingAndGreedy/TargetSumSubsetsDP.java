
/**
 * 1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add 
     up to "tar" or not.
 */

import java.util.Scanner;

public class TargetSumSubsetsDP {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        sc.close();

        boolean[][] dp = new boolean[n+1][k+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else if(j == 0){
                    dp[i][j] = true;
                }
                else {
                    if (dp[i-1][j] = true){ // Without including the current number can we make the sum
                        dp[i][j] = true;
                    } else {
                        int val = arr[i-1]; // why no i beacause additional 0 is included in dp[][]
                        if(j >= val) {
                            if(dp[i-1][j - val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][k]);


    }
}