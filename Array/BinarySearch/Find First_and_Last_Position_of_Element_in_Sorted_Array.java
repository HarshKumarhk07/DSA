class Solution {
    public int lowerBound(int[] arr,int n,int target){
        int left = 0;
        int right=n-1;
        int ans = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]>=target){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    } 
    public int upperBound(int [] arr,int n,int target){
        int left =0 ;
        int right=n-1;
        int ans = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]>target){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = lowerBound(nums,n, target);
        if(left == n || nums[left]!=target) return new int[] {-1,-1};
        return new int[]{left,upperBound(nums,n,target)-1};
    }   
}           
