package com.aditi;

public class SearchInMountain {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int target=2;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int arr[],int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in desceding part of array,Thus may be the ans but look at left,this is why end!-mid-1

                end = mid;
            } else {
                // you are in Ascending part of array
                start = mid + 1;//because we know that mid +1 element>mid element
            }
        }
        // In the end ,start=end and pointing to the largest number because of the above two checks
        return start;
    }
    static int orderAgnosticBS(int []arr,int target,int start,int end)
    {

        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid]==target) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target >arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
