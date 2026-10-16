import java.util.Arrays;

public class A2datatype {
    public static void main(String[] args) {
        // primitive datatype
        // Integers
        byte b = 1;
        int i = 9;
        short s = 12;
        long l = 1021213;
        // double
        double d = 45.90;
        float f = 12.12f;

        // character
        char c = 'h';

        // boolean
        boolean bl = true;

        // Non-Primitive Datatype
        // string
        String s1 = "Hello";
        // array
        int arr[] = new int[5];
        // or
        int arr1[] = { 1, 2, 3, 4, 5 };
        // class
        class Animal {
            String sounds() {
                return "main function";
            }
        }
        Animal dog = new Animal();
        {
            dog.sounds();
        }
        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(bl);
        System.out.println(s1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(dog.sounds());

    }

}
