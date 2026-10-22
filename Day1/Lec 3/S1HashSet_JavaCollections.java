import java.util.HashSet;
import java.util.Set;

public class S1HashSet_JavaCollections {
    public static void main(String[] args) {
        ////Set : A set doesn't allow duplicate elements
        ///HashSet: 1.Fast Look up, 2.unique element, 3. no guaranteed ordering
        ///if you want to element to be unique and in inserted order format use LinkedHashSet and methods are same as hashset
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

        //5. isEmpty()
        set.isEmpty();

        //6. clear()=> set.clear(); all the element from the set
        //7. addAll(Collection)=> add all the element from that collection to this set
        //8. removeAll(Collection)=> remove all the element from that collection to this set

        
    }
}
