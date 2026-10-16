import java.util.*;
public class A1input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char c = sc.next().charAt(0);
        String s = sc.next();//one word
        sc.nextLine();
        String s1 = sc.nextLine();//one Line

        System.out.println(n);
        System.out.println(c);
        System.out.println(s);
        System.out.println(s1);
    }
}
