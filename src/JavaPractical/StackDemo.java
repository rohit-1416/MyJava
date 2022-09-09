package JavaPractical;

import java.util.logging.SocketHandler;

public class StackDemo {
    int arr[];
    int top;
    StackDemo(){
        arr=new int[5];
        top=-1;
    }
    void push(int element){
        if(top==arr.length-1){
            System.out.println("Stack is Full");
        }
        else {
            top++;
            arr[top] = element;
            System.out.println("pushed");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Pop "+arr[top]);
            top=top-1;

        }
    }
    int peek(){
        if(top==-1) {
            return -1;
        }else
        {
            System.out.println("Peek is " + arr[top] + " at index" + top);
            return top;
        }
    }
    void display(){
        for(int i=top;i>=0; i--){
            System.out.println(arr[i]+ " Displayed");
        }
    }


    public static void main(String[] args) {
//        int element=10;
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.peek();
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}
