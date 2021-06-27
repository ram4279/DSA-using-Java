import java.util.*;

public class FirstIndexLinearSearch {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));
        sc.close();
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length - 1) {
            return -1;
        }

        if (arr[idx] == x) // check if current ele equals x when moving upward in stack;
            return idx;
        else {
            int ni = firstIndex(arr, idx + 1, x);
            return ni;
        }

    }

}