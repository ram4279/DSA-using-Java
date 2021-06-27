import java.util.*;

public class RotateBy90Degree {

    public static void reverse(int[] arr) {
        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] arr = new int[r][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // display(arr);


        for(int i = 0; i < r; i++){
            for (int j = i; j < r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < r; i++){
            reverse(arr[i]);
        }


        display(arr);
        sc.close();
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}



