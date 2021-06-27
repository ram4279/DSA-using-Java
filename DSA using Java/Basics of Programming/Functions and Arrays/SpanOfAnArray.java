import java.util.*;

public class SpanOfAnArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int[] arr = new int[nos];
        for (int i = 0; i < nos; i++)
            arr[i] = sc.nextInt();
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        for (int n : arr) {
            minval = Math.min(minval, n);
            maxval = Math.max(maxval, n);
        }

        System.out.println(maxval - minval);
        sc.close();
    }

}