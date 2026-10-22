import java.util.*;
public class S2TreeSet_JavaCollections {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        ////Tree Set: Stores the unique element in sorted order and nulls are not allowed
        //no get(x) access method because it doesn't have indexes
        ////methods:
        //1. add(element)
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(50);
            set.add(40);
        //2. first()=> give the first element of the set 
            System.out.println(set.first());
        //3. last()=> give the last element of the set
            System.out.println(set.last());
        //4. lower(x)=> give the value just lower than x
            System.out.println(set.lower(30));
        //5. upper(x)=> give the value just upper than x
            System.out.println(set.higher(20));
        //6. ceiling(x)=> give the value equal to or just greater than x
            System.out.println(set.ceiling(30));
        //7. floor(x)=> give the value equal to or just less than x
            System.out.println(set.floor(30));
            for(int num: set){
                System.out.print(num + " ");
            }
        


    }
}
