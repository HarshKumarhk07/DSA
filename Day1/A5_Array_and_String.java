import java.util.*;
public class A5_Array_and_String {
    public static void main(String[] args) {
        //data types are of two types primitive and non primitive 
        //Array is a non-primitive datatype that store similar datatype in a contigous memory location, the size is fixed and is accessible using indices.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
            //or
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr1.length);//gives the length
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //String is a Non-primitive datatype that is a combination of one or more characters. String can be null.Strings are immutable(Once String Object is created it can not be changed).
        String s= "Hello My Name is Harsh Kumar Singh";
        System.out.println(s);
        System.out.println(s.charAt(10));
        //if i use .concat() it will not change the s string it will create a new string it doesn't modify the new string 
        String s2 = " AND THIS IS STRING 2 TEXT";
        s = s.concat(s2);
        System.out.println(s);
    }
}
