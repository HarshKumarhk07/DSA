public class Longest_Mountain_in_Array {
    public static int longestMountain(int []arr){
        int i=1;
        int maxLen=0;
        int n = arr.length;

        while(i<n-1){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left = i-1;
                int right = i+1;
                while(left>0 && arr[left]>arr[left-1]) left--;
                while(right<n-1 && arr[right]>arr[right+1]) right++;

                maxLen = Math.max(maxLen,right-left+1);
                i=right;
            }
            else{
                i++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,1,4,7,3,2,5};
        int maxLen = longestMountain(arr);
        System.out.println(maxLen);
    }
}
