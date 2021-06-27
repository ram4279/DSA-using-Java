import java.io.*;
import java.util.*;

public class LargestAreaHistogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] rb = new int[arr.length];
        int[] lb = new int[arr.length];

        filllsb(lb, arr);
        fillrsb(rb, arr);

        int maxarea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i];
            maxarea = Math.max(maxarea, area);
        }

        System.out.println(maxarea);
    }

    public static void fillrsb(int[] rb, int[] arr) {
        var stk = new Stack<Integer>();
        stk.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stk.isEmpty() && arr[i] < arr[stk.peek()]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                rb[i] = arr.length;
            } else {
                rb[i] = stk.peek();
            }
            stk.push(i);
        }
        System.out.println(Arrays.toString(rb));
    }

    public static void filllsb(int[] lb, int[] arr) {
        var stk = new Stack<Integer>();
        stk.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (!stk.isEmpty() && arr[i] < arr[stk.peek()]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] = stk.peek();
            }
            stk.push(i);
        }
        System.out.println(Arrays.toString(lb));
    }

}