import java.util.*;
public class A8Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUpToN(n);
    }   
    public static void printUpToN(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
