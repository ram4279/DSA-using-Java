import java.util.*;

public class lastIndexOfArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, arr.length - 1, x));
        sc.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            return lastIndex(arr, idx - 1, x);
        }

    }

}