package JavaPractical;

import java.util.*;
class ArrayListEg{
    public static void main(String []args){
//        int a[] = {10,5,7,8,9};


//        Linked List
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

//        Array List
        ArrayList arrayList =new ArrayList();
        arrayList.add(10);
        arrayList.add(15);
        System.out.println(arrayList);
        arrayList.addAll(al);
        System.out.println(arrayList);

        arrayList.add(450);
        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.removeAll(al);

        System.out.println(arrayList.get(1));

//        arrayList.remove(2);
        System.out.println(arrayList+ "nothing there");
    }
}