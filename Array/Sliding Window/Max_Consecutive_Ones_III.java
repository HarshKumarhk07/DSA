public class Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int left=0;
        int right =0;
        int maxlen =0;
        int zero=0;
        while(right<nums.length){
            if(nums[right]==0){
                zero++;
            }
            if(zero<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            while(zero>k){
                if(nums[left]!=0){
                    left++;
                }else if(nums[left]==0){
                    zero--;
                    left++;
                }
            }
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int k=2;
        int arr[] = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int ans = longestOnes(arr,k);
        System.out.print(ans);
    }   
}
