import java.io.*;
import java.util.*;

public class SlidingWindowMaximum{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    int[] nge = new int[a.length];
    var stk = new Stack<Integer>();
    for(int i = a.length-1; i >= 0; i--) {
        while(!stk.isEmpty() && a[stk.peek()] < a[i])
            stk.pop();
        if(stk.isEmpty())
            nge[i] = a.length;
        else
            nge[i] = stk.peek();
        stk.push(i);
        
    }
    
    for(int i = 0; i <= a.length - k; i++ ) {
        int j = i;
        while(nge[j] < i + k) {
            j = nge[j];
        }
        System.out.println(a[j]);
    }
    
 }
}