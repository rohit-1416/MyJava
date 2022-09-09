package JavaPractical;

import java.util.*;

class QueueEg{
    public static void main(String[] args) {
        ArrayList<Integer>A =new ArrayList<>();
        A.add(15);
        A.add(0,50);
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.addAll(A);
        System.out.println("Peak is :"+q.peek());
//        System.out.println("");
        System.out.println(q.size());
        System.out.println(q);

//        Double ended queue
        Deque<Integer> d =new LinkedList<>();
        d.add(10);
        d.push(15);                        // first (less prioritry)
        d.offer(17);                     //last
        d.addLast(20);
        d.addFirst(5);                   //first
        d.offer(111);                  //last
        System.out.println(d);

//        prority Queue
        PriorityQueue<Integer> p= new PriorityQueue<Integer>();
        System.out.println(p.poll());
        p.add(10);
        p.add(20);
        p.add(30);
        System.out.println(p.peek());
        System.out.println(p);
    }
}