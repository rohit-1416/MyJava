package JavaPractical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ListDemo{
    public static void main(String[] args) {
//        ArrayList <String> arr =new ArrayList<>();
//        System.out.println("before adding "+arr.size());
//        arr.add("cat");
//        arr.add("D");
//        arr.add("Fish");
//        System.out.println(arr.get(2));
//        System.out.println(arr);
//        System.out.println("After adding element "+arr.size());
//       iterator
//        Iterator it = arr.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        LinkedList<Double> ll =new LinkedList<Double>();
        ll.add(55.50);
        ll.add(4.0);
        ll.addFirst(10.99);
        ll.add(2,11.55);
        System.out.println(ll);
        Iterator<Double> it =ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}