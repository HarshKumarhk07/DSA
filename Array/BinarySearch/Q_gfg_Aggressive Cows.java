import java.util.*;

class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        
        Arrays.sort(stalls);
        
        int left = 1;
        int right = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        
        while (left <= right) {
            
            int mid = left + (right - left) / 2;
            
            if (canPlace(stalls, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return ans;
    }
    
    public boolean canPlace(int[] stalls, int k, int dist) {
        
        int cows = 1;
        int last = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            
            if (stalls[i] - last >= dist) {
                cows++;
                last = stalls[i];
            }
            
            if (cows >= k) return true;
        }
        
        return false;
    }
}