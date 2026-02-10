import java.util.*;
public class Fruit_Into_Baskets {
    public static int totalFruit(int[] fruits) {
        int left=0;
        int right=0;
        int maxlen=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(right<fruits.length){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1);
            }else{
                map.put(fruits[right],1);
            }
            while(map.size()>2){
                int freq=map.get(fruits[left]);
                if(freq==1){
                    map.remove(fruits[left]);
                }else{
                    map.put(fruits[left],freq-1);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,3,3,1,2,1,1,1,2,3,3,4};
        int ans = totalFruit(arr);
        System.out.println(ans);
    }
}
