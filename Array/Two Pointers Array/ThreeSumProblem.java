// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumProblem {
    public static List<List<Integer>> Threesum(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        Arrays.sort(nums);
        int k;int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            k=i+1;
            j=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(k<j){
                List<Integer> innerList = new ArrayList<>();
                int sum = nums[i] +nums[j]+nums[k];
                if(sum==0){
                    innerList.add(nums[i]);
                    innerList.add(nums[k]);
                    innerList.add(nums[j]);
                    outerList.add(innerList);
                    k++;
                    j--;
                    while (k < j && nums[k] == nums[k - 1]) k++;
                    while (k < j && nums[j] == nums[j + 1]) j--;
                }else if(sum<0){
                    k++;
                }else{
                    j--;
                }
            }

        }
        return outerList;
    }

    public static void main(String[] args) {
             List<List<Integer>> ans = new ArrayList<>();
             ans = ThreeSumProblem.Threesum(new int[]{-1,0,1,2,-1,-4});
             System.out.print(ans);
    }
}
