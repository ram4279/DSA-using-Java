/**
 * 1. You are given a number n, representing the count of elements. 2. You are
 * given n numbers. 3. You are given a number "tar". 4. Complete the body of
 * printTargetSumSubsets function - without changing signature - to calculate
 * and print all subsets of given elements, the contents of which sum to "tar".
 * Use sample input and output to get more idea.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * 
 * 
 * Input: 5
10
20
30
40
50
60

Output:
10, 20, 30, .
10, 50, .
20, 40, .
 */


import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
        sc.close();
        
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sof, int tar) {
        if(idx == arr.length){
            if(sof == tar){
                System.out.println(set+".");
            }
            return;
        }
        
        
        int ele = arr[idx];
        
        printTargetSumSubsets(arr, idx+1, set + ele + ", ", sof+ele, tar);
        printTargetSumSubsets(arr, idx+1, set, sof, tar);
        
        
    }

}