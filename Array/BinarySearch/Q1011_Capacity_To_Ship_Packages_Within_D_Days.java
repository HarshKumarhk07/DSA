class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int w : weights){
            left= Math.max(left,w);
            right+=w;
        }
        return getDays(weights,days,left,right);
    }

    public int getDays(int[] weights,int day,int left, int right){

        while(left<=right){
            int mid = left+(right-left)/2;
            int daysCount=1;
            int currWeight=0;
            for(int we : weights){
                if(currWeight+we<=mid){
                    currWeight += we;
                }else{
                    daysCount++;
                    currWeight=we;
                }
            }
            if(daysCount<=day){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}