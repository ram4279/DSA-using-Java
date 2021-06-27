
/**
 * 
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
     any row in the left wall.
5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
 */
import java.util.*;

public class Goldmine {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int[][] dp  = new int[r][c];

        for(int col = c - 1; col >= 0; col--) {
            for(int row = 0; row < r; row++){
                if(col == c - 1){
                    dp[row][col] = arr[row][col];
                }
                else if(row == 0){
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col+1], dp[row+1][col+1]);
                }
                else if(row == r - 1) {
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col+1], dp[row-1][col+1]);
                }
                else {
                    int temp = Math.max(dp[row][col+1], dp[row-1][col+1]);
                    dp[row][col] = arr[row][col] + Math.max(temp, dp[row+1][col+1]);
                }

            }
        }
        

        int globalmax = dp[0][0];
        for (int i = 1; i < r; i++) {
            globalmax = Math.max(globalmax, dp[i][0]);
        }
        System.out.println(globalmax);

    }

}