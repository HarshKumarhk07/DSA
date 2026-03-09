class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low =0;
        int high = arr.length-1;
        int left = lowerBound(arr,low,high,target);
        int right = upperBound(arr,low,high,target);
        if(left==arr.length || arr[left]!=target) return 0;
        return right-left;
    }
    
    int lowerBound(int[] arr, int low,int high,int target){
        int ans=arr.length;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }   
        return ans;
    }
    
    int upperBound(int[] arr, int low,int high,int target){
        int ans=arr.length;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }   
        return ans;
    }
}
