import java.util.*;
public class L4_L3_Check_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        // int temp=Math.abs(n);
        // while(n>0){
        //     rev = rev*10+n%10;
        //     n=n/10;
        // }
        // if(rev==temp){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("false");
        // }

        ////using string
        String s = Integer.toString(n);
        String s1= String.valueOf(n);//two ways to convert int to string
        int tag=0;
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                System.out.println("false");
                tag=1;
                break;
            }
        }
        if(tag==0){
            System.out.println("true");
        }
        


    }
}
