package com.aditi;

public class Peakmountain {
    public static void main(String[] args) {
    }

    public int peakIndexInMountainArray(int[] arr) {
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
}