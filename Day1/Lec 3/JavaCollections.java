import java.util.*;
public class JavaCollections {
    public static void main(String[] args) {
        ////////List
        //ArrayList->1.Allow Duplicates, 2.IN Ordered form, 3. Supports indexes
        ////Define
        // List<Integer> list = new ArrayList<>();
        
        ////methods in ArrayList
        //add(element)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);

        //add(index,element)
        // list.add(0,10);//here it addes the value 10 at index 0 and shift other number to right so the array list is (10,1,2,3,4)
        // list.add(1,20);//here it addes the value 20 at index 1 and shift other number to right so the array list is (10,20,1,2,3,4) 

        //get(index)
        // System.out.print(list.get(0));//gives the result/value of that particular index

        //set(index,value)
        // list.set(3,30);//here it changes the 3 index value to 30 so now arraylist is (10,20,1,30,3,4)
        
        //remove(index)
        // list.remove(list.size()-1);//list = (10,20,1,30,3)

        //iterate
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //isEmpty()
        // System.out.println(list.isEmpty());

        //indexOf()
        // System.out.println(list.indexOf(10));


        ////Set : A set doesn't allow duplicate elements
        ///HashSet: 1.Fast Look up, 2.unique element, 3. no guaranteed ordering

        Set<Integer> set = new HashSet<>();
    }
}
