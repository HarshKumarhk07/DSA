// Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int i=0;
        
        int closestsum=nums[0] + nums[1] + nums[2];
        for(i=0;i<nums.length;i++){
            int k=i+1;
            int j=nums.length-1;
            while(k<j){
                int sum = nums[i]+nums[j]+nums[k];;
                if(Math.abs(sum-target)<Math.abs(closestsum-target)){
                    closestsum=sum;
                }else if(sum<target){
                    k++;
                }else{
                    j--;
                }

            }
        }
        return closestsum;
    }
    public static void main(String[] args) {
        ThreeSumClosest solver = new ThreeSumClosest();
        int ans = solver.threeSumClosest(new int[]{-1,2,1,-4},1);
        System.out.print(ans);
    }    
}
