class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int low =1;
        int high=0;
        
        for (int pile :bloomDay) {
            high = Math.max(high, pile);
        }
        int result=0;
        boolean ans= false;
        while(low<=high){
            int mid =low+(high-low)/2;
            result=mid;
            if (isPossibleBouquets(bloomDay, m, k, mid)) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean isPossibleBouquets(int[] bloomDay, int m, int k, int day) {
        int count=0;
        int noOfB =0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }else{
                noOfB += count/k;
                count=0;
            }
        }
        noOfB +=count/k;

        if(noOfB>=m){
            return true;
        }
        return false;
    }
}