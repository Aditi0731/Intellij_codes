//https://www.geeksforgeeks.org/sum-triangle-from-array/
package recursion;

import java.util.Arrays;

public class Sum_Triangle_From_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printTriangle(a);
    }
    public static void printTriangle(int a[])
    {
        // Base case
       if(a.length<1)
           return;
// Creating new array which contains the
        // Sum of consecutive elements in
        // the array passes as parameter.
       int temp[]= new int[a.length-1];

       for(int i=0;i<a.length-1;i++)
       {
           temp[i]=a[i]+a[i+1];

       }
        // Make a recursive call and pass
        // the newly created array
       printTriangle(temp);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(a));
    }

}
