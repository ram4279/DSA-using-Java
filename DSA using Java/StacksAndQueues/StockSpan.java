import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StockSpan {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        var stk = new Stack<Integer>();
        stk.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                stk.pop();
            }

            if (stk.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - stk.peek();
            }
            stk.push(i);
        }
        return res;
    }

}