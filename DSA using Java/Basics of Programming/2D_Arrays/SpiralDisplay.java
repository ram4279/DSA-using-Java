import java.util.*;

public class SpiralDisplay {

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

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int T = 0, B = r-1;
        int L = 0, R = c-1;
        int down = 0, right = 1, up = 2, left = 3;
        int direction = down;

        while (T <= B && L <= R) {
            if (direction == down) {
                for (int i = T; i <= B; i++) {
                    System.out.println(arr[i][L]);
                }
                L++;
                direction = right;
            } else if (direction == right) {
                for (int i = L; i <= R; i++) {
                    System.out.println(arr[B][i]);
                }
                B--;
                direction = up;
            } else if (direction == up) {
                for (int i = B; i >= T; i--) {
                    System.out.println(arr[i][R]);
                }
                R--;
                direction = left;
            } else if(direction == left) {
                for (int i = R; i >= L; i--) {
                    System.out.println(arr[T][i]);
                }
                T++;
                direction = down;
            }
        }
        sc.close();
    }

}