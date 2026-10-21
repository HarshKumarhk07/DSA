import java.util.Scanner;

public class L2A16_Rev_Left_ABC_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char c = 'A';
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+n-j)+" 5");
            }
            System.out.println();
        }
    }
}
