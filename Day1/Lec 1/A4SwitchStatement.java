import java.util.*;
public class A4SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("Adult hai re baba");
                break;
            case 45:
                System.out.println("Umar hogayi ab tho");
                break;
            case 5:
                System.out.println("Pogo dekh jake bache");
                break;
            default:
                System.out.print("No Data Found");
        }
    }
}
