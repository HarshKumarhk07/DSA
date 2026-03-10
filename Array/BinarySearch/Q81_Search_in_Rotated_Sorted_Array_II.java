public class Q81_Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        boolean ans= false;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid] > target){
                    high = mid-1;
                }else{
                    low= mid+1;
                }
            }else{
                if(nums[mid]<target && nums[high] >= target){
                    low =mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return ans;
    }
}
