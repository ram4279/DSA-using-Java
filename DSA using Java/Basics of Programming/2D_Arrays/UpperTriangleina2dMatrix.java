import java.util.*;

public class UpperTriangleina2dMatrix {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] arr = new int[r][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int l2 = 0;
        for (int i = 0; i < r; i++) {
            for(int j = 0, k = l2; j < r && k < r; j++, k++){
                System.out.println(arr[j][k]);
            }
            l2++;
        }
        sc.close();

    }

}



// 00 11 22 33 44 55
// 01 12 23 34 45
// 02 13 24 35
// 03 14 25
// 04 15
// 05



// 00 01 02 03 04 05
// 10 11 12 13 14 15
// 20 21 22 23 24 25
// 30 31 32 33 34 35
// 40 41 42 43 44 45
// 50 51 52 53 54 55