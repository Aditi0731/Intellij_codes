package com.aditi;

public class Linearsearch
{
    public static void main(String[] args) {
        int num[]={1,45,67,24,78,99,23,48};
        int key=23;
        int ans= linearsearch(num,key);
        System.out.println(ans);
    }
        static int linearsearch(int []arr,int key)
        {
            if(arr.length==0)
            {
            return -1;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==key)
                {
                    return i;
                }
            }
            return -1;
        }

    }

