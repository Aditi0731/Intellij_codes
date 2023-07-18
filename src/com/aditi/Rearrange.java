package com.aditi;
import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int arr[]={-1, 2, -3, 4, 5, 6, -7, 8, 9 };
        sort(arr);
       for(int i:arr)
       {
            System.out.print(i+" ");
        }

   }
    public static void sort(int []arr)
    {
        Arrays.sort(arr);
    }
}

