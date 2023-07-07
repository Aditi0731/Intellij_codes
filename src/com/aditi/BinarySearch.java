package com.aditi;

public class BinarySearch {
    public static void main(String[] args)
    {
        int []arr={-18,-12,-4,0,3,6,9,12,18,19};
        int target=19;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}


