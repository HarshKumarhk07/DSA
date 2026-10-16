import java.util.*;
public class A8Function {
    //java only supports call by value and inside a function if a parameter is passed that same variable memory location will be different then the original one and if we print the original varible outside that function we will still get the old output we entered
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
