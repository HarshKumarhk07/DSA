import java.util.*;
public class Minimum_Removals_to_Balance_Array {
    public static int minRemoval(int arr[],int k){
        int n=arr.length;
        Arrays.sort(arr);
        int maxlen=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]>arr[left]*k){
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return n-maxlen;
    }
    public static void main(String[] args) {
        int arr[] =  new int[]{1,6,2,9};
        int c  = minRemoval(arr, 3);
        System.out.println(c);
    }
}
