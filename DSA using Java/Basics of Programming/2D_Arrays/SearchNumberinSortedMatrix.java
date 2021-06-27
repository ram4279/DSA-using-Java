import java.util.*;

public class SearchNumberinSortedMatrix {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] arr = new int[r][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();

        sc.close();

        int i = 0, j = r - 1;

        while (i < r && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (arr[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not Found");

    }

}