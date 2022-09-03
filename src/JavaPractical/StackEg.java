package JavaPractical;

import java.util.*;
class StackEg {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("c");
        stack.push("D");
//        stack.push("15");
        stack.add("15");
        System.out.println(stack);


//
//        String res = stack.empty() ?"Empty" : "Having Something";
//        System.out.println(res);
//
//        System.out.println(stack.search("15"));
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack);
//        Itrator
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(stack);
    }
}