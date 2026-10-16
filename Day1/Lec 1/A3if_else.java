import java.util.*;
public class A3if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18 && age<=45){
            System.out.print("Adult");
        }else if(age>5 &&age<18){
            System.out.print("You are a bacha");
        }else if(age<5){
            System.out.print("You are a very chota bacha");
        }else{
            System.out.println("You are a old person");
        }
    }
} 