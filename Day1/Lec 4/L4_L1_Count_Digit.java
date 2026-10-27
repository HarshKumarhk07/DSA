import java.util.*;
public class L4_L1_Count_Digit {
    public static int count(int n){
        int cnt =0;
        if(n==0){
            return cnt;
        }
        while(n!=0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));

    }
}
