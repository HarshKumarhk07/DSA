import java.util.Scanner;

public class L2A15_Piramid_ABC_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char a= 'A';
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            char c='A';
            c=(char)(c+i-2);
            for(int l=1;l<i;l++){
                System.out.print(c);
                c--;
                
            }
            System.out.println();
        }
    }
}
