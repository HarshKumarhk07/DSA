import java.util.*;
public class L2A2Tri_Patterns {
    public static void Tri_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tri_Pattern(n);
    }
}