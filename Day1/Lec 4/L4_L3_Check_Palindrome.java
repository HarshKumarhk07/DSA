import java.util.*;
public class L4_L3_Check_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        int temp=Math.abs(n);
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
