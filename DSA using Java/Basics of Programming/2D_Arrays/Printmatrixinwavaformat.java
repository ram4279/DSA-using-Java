/**
 * Print matrix in the below manner
 *    _
 * | | | |
 * | | | |
 * | | | |
 * |_| |_|
 */


import java.util.*;

public class Printmatrixinwavaformat {

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

        int col = 0;
        int down = 0, up = 1;
        int direction = down;
        while (col < c) {
            if (direction == down) {
                for (int j = 0; j < r; j++) {
                    System.out.println(arr[j][col]);
                }
                col++;
                direction = up;
            } else {
                for (int j = r - 1; j >= 0; j--) {
                    System.out.println(arr[j][col]);
                }
                col++;
                direction = down;
            }
        }

        sc.close();
    }

}