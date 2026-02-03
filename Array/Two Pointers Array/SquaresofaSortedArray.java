// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]



import java.util.*;
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right=0;
        while(right<nums.length){
            nums[left]= Math.abs(nums[left]*nums[right]);
            right++;
            left++;
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int arr[]=new int[100];
        SquaresofaSortedArray obj = new SquaresofaSortedArray();
        arr = obj.sortedSquares(new int[]{-7,-3,2,3,11});
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
