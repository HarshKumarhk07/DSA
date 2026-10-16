import java.util.*;

public class L2A1Rect_Patterns {
    public static void Square_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Square_Pattern(n);
    }
}
