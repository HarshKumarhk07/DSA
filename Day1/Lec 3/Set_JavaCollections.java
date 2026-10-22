import java.util.HashSet;
import java.util.Set;

public class Set_JavaCollections {
    public static void main(String[] args) {
        ////Set : A set doesn't allow duplicate elements
        ///HashSet: 1.Fast Look up, 2.unique element, 3. no guaranteed ordering

        Set<Integer> set = new HashSet<>();

        //1. add(value)
        set.add(10);
        set.add(20);//if we again try to add 20 then also nothing will change
        set.add(30);
        set.add(40);
        set.add(50);

        //2. contains(value)  //// check if that value is present or not
        System.out.println(set.contains(50));//time complexity=>1
        System.out.println(set.contains(100));

        //3. Size()
        System.out.println(set.size());
    
        //4. remove()
        set.remove(30);

        System.out.println(set.size());

    }
}
