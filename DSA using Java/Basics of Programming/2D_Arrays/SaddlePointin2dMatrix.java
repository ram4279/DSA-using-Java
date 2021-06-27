import java.util.*;

public class SaddlePointin2dMatrix {
    public static ArrayList<Integer> getLuckyNumbers(int[][] matrix, int m, int n) {
        var luckynumbers = new ArrayList<Integer>();
        int[] rowminvalues = new int[m];
        int[] colmaxvalues = new int[n];
        // Compute min of each rows
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowminvalues[i] = min;
        }

        // Compute max of each columns
        for (int i = 0; i < n; i++) {
            int max = matrix[0][i];
            for (int j = 1; j < m; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            colmaxvalues[i] = max;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowminvalues[i] && matrix[i][j] == colmaxvalues[j])
                    luckynumbers.add(matrix[i][j]);
            }
        }
        return luckynumbers;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        var luckynos = getLuckyNumbers(arr, n, n);

        if(luckynos.size()==0){
            System.out.println("Invalid input");
        } else {
            System.out.println(luckynos.get(0));
        }

        sc.close();
    }

}