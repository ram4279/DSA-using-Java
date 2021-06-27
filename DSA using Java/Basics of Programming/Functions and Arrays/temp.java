


class MyCalendar {

    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }

    public int find(int[] arr, int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr, lo, hi, pivot);

        if (k > pi)
            return find(arr, pi + 1, hi, k);
        else if (k < pi)
            return find(arr, lo, pi - 1, k);
        else{
            System.out.println(pi);
            return arr[pi];
        }
            

    }

    public int partition(int[] arr, int lo, int hi, int pivot) {
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] >= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }
}

public class temp
{
    public static void main(String[] args) {
        // MyCalendar obj = new MyCalendar();
        // int[] arr = {3,2,1,5,6,4};


        // System.out.println(Arrays.toString(arr));

        // int pi = obj.partition(arr, 0, arr.length-1, 4);
    
        // // obj.partition(arr, 0, arr.length - 1, 4);
        // System.out.println(Arrays.toString(arr));
    }
}