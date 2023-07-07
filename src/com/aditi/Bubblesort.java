package com.aditi;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //swap if the item is smalller than the previous item
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the is smaller than the previous itemm
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if u did not swap for a particular value of i,it means the array is sorted hence stop the program.
            if (!swapped) {
                break;
            }
        }
    }
}



