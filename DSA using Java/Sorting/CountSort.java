// package leetcode.Practice;

import java.util.*;

class CountSort {
    public static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int[] freq = new int[max-min+1];

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]-min]++;
        }

        for(int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }

        int[] res = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--)  {
            int val = arr[i];
            int pos = val - min;
            res[freq[pos]-1] = val;
            freq[pos]--;
        }

        for (int i = 0;i < res.length;i++) {
            arr[i] = res[i];
        }



    }

    
    public static void main(String[] args) {
    	int[] arr = {2,3,6,5,5,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}