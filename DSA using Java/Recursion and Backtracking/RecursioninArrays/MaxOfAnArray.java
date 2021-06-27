import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
        sc.close();
    }

    public static int maxOfArray(int[] arr, int idx) {
        
        if (idx == arr.length) {
            return -1;
        }

        int curr = arr[idx];
        int x = maxOfArray(arr, idx+1);
        if(curr > x) return curr;
        else return x;
        
    }

}