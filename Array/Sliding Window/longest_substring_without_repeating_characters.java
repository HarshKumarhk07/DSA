import java.util.*;
public class longest_substring_without_repeating_characters {
    public static int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int l=0;
        int r=0;
        int hash[] = new int [256];
        Arrays.fill(hash,-1);
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            maxlen = Math.max(maxlen,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }

        return maxlen;
    }
    public static void main(String[] args) {
        String s= "cadbzabcd";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
        
    }
}
