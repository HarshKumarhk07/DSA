import java.util.*;
public class Deque_Java_Collections {
    public static void main(String[] args) {
        ////Deque: it's fill form is double ended queue.Meaning that the insertion, deletion and retrival can be done from both ends. Can be used as both stack and queue because it can follow both lifo and fifo operations 
        //As Deque
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        dq.push(10);//add element at front beacause it is a stack method 
        dq.push(20); 
        dq.offer(40);             
        System.out.println(dq);          // [10, 20, 30]

        System.out.println(dq.peekFirst()); // 10
        System.out.println(dq.peekLast());  // 30

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq); 

        //Stack as Dequeue
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(2);
        stack.add(7);
        stack.add(3);
        stack.addFirst(1);
        stack.add(5);
        stack.add(6);
        stack.addFirst(0);
        
        //queue as ArrayDeque

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.addFirst(1);
        queue.addLast(100);

        Iterator<Integer> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        //Deque as LinkedList
        Deque<Integer> linkedListQueue = new LinkedList<>();

    }
}
