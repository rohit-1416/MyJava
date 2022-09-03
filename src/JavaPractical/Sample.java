package JavaPractical;

import java.util.LinkedList;

public class Sample {
    public static void main(String[]args){
        System.out.println("Hello Rk");
        LinkedList<String> l1 =new LinkedList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();

        System.out.println(l1);
    }
}