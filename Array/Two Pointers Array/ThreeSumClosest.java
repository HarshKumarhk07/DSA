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
