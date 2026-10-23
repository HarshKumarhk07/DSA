import java.util.*;
public class QueueInterface {
    public static void main(String[] args) {

        ////Queue is a interface in java that store elements for processing generally in fifo order(First in First Out)
        //there are three ways to define queue first using ArrayDequeue, PriorityQueue and LinkedList
        Queue<Integer> aqueue1 = new ArrayDeque<>();
            //or
        Queue<Integer> queue2 = new LinkedList<>();
            //or
        Queue<Integer> queue3 = new PriorityQueue<>();

        // //you can use any of these for inserting add() or offer(), for removing remove() or poll(), for getting first element without removing the first element use element() or peek().
        // aqueue1.add(10);
        // aqueue1.add(20);
        // aqueue1.add(30);
        // aqueue1.offer(10);
        // for(int num: aqueue1){
        //     System.out.print(num+" ");
        // }
        // System.out.println();
        
        // //linkedlist

        // queue2.add(10);
        // queue2.add(20);
        // queue2.add(30);
        // queue2.add(40);
        // queue2.offer(null);
        // for(Integer num: queue2){
        //     System.out.print(num+" ");
        // }

        // System.out.println();

        //Priority Queue

        // queue3.offer(50);
        // queue3.offer(40);
        // queue3.offer(80);
        // queue3.offer(70);
        // queue3.offer(20);
        // queue3.offer(10);
        // while (!(queue3.isEmpty())) {
        //     System.out.print(queue3.poll()+" ");
        // }
        queue3.add(10);
        queue3.add(20);
        queue3.add(50);
        queue3.add(40);
        queue3.add(30);
        while (!(queue3.size()==3)) {
            System.out.print(queue3.poll()+" ");
        }
        System.out.println();
        System.out.println(queue3.peek());
        System.out.println(queue3.element());
        
        



    }
}
