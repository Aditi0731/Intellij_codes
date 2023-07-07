package recursion;

public class SortedArray {
    public static void main(String[] args) {
        int arr[]={8,3,6,5,2};
        System.out.println(sortedarray(arr,0));
    }

static boolean sortedarray(int[]arr, int index)
{
if(index == arr.length-1)
{
    return true;
}
return arr[index]<arr[index+1] && sortedarray(arr, index+1);

}
}