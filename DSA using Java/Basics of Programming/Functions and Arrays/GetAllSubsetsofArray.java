/**
 * Getting sets is just getting the 2^n values binary pattern
 * ab
 * 2^2
 * 0 00  _ _
 * 1 01  _ b
 * 2 10  a _
 * 3 11  a b
 */

import java.io.*;
    
public class GetAllSubsetsofArray{

public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        
        int totalSubsets = (int) Math.pow(2,n);
        
        
        for(int i = 0; i < totalSubsets; i++)
        {
            String set = "";
            int temp = i;
            for(int j = a.length - 1; j >= 0; j--){
                
                int rem = temp % 2;
                temp/=2;
                
                if(rem==0){
                    set = "-\t" + set;
                } else {
                    set = a[j] + "\t" + set;
                }
                
            }
            System.out.println(set);
        }
        
        
    }

}

    
    
    /**
     * 10 20 30
     * ________
     * __ __ 30
     * __ 20 __
     * __ 20 30
     * 10 __ __
     * 10 __ 30
     * 10 20 __
     * 10 20 30
     * */
     
     
    //  2^N