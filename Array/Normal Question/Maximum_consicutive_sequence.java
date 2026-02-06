import java.util.*;
public class Maximum_consicutive_sequence {
    public static int longestConsecutive(int nums[]){
         if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i] == nums[i+1] - 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count=0;
            }
        }
        return maxCount+1;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }    
}
