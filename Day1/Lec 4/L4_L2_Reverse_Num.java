import java.util.*;
public class L4_L2_Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RevNum=0;
        int n = sc.nextInt();
        // while(n>0){
        //     RevNum = RevNum *10 + n%10;
        //     n=n/10;
        // }
        // System.out.println(RevNum);


        ////or string

        
        String s = String.valueOf(n);
        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println(Integer.parseInt(s1));
        
    }
}
 