public class maximum_points_you_can_obtain_from_cards {
     public static int maxScore(int[] cards, int k) {
         int n = cards.length;
         int left=0;
         int right=0;
         int sum=0;
         int minsum=0;
         int preMin = Integer.MAX_VALUE;
         while(right<n){
            sum = sum + cards[right];
            minsum = minsum + cards[right];
            if(right-left+1>n-k){
               minsum = minsum - cards[left];
               left++;
            }
            if(right-left+1==n-k){
               preMin = Math.min(minsum, preMin);
            }
            right++;
         }
         return sum-preMin;
     }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,1};
        int k = 3;
        int ans = maxScore(arr, k);
        System.out.println(ans);
    }
}
