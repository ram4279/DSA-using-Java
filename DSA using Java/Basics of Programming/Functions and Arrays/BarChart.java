/**
 * Input
 * 5 ->  3 1 0 7 5
 * 
 * Outout
 			a		
			a		
			a	a	
			a	a	
a			a	a	
a			a	a	
a	a		a	a	* 

 */


import java.util.*;

public class BarChart {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int[] arr = new int[nos];
        for (int i = 0; i < nos; i++)
            arr[i] = sc.nextInt();

        //get the max floor size
        int rowsize = Arrays.stream(arr).max().getAsInt();


        for (int i = rowsize; i >= 1; i--) {
            for (int j = 0; j < nos; j++) {
                if (arr[j] >= i) // only elements which are greater than equal to the floor size can have stars
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();
    }

}