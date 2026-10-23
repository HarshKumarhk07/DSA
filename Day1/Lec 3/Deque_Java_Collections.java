import java.util.*;
public class Deque_Java_Collections {
    public static void main(String[] args) {
        ////Deque: it's fill form is double ended queue.Meaning that the insertion, deletion and retrival can be done from both ends. Can be used as both stack and queue because it can follow both lifo and fifo operations 
        //As Deque
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        dq.push(10);
        dq.push(20); 
        dq.offer(40);             
        System.out.println(dq);          // [10, 20, 30]

        System.out.println(dq.peekFirst()); // 10
        System.out.println(dq.peekLast());  // 30

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq); 


    }
}
