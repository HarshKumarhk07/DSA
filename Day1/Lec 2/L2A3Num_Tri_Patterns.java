import java.util.*;
public class L2A3Num_Tri_Patterns {
    public static void Num_Tri_Pattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num_Tri_Pattern(n);
    }
}
