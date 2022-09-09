package JavaPractical;

public class StackPushMid {
        int arr[];
        int top;
        int mid=(arr.length-1)/2;
    int midelement=arr[mid];
    StackPushMid(){
            arr=new int[5];
            top=mid-1;
        }
        void push(int element){
            if(top==arr.length-1){
                System.out.println("Stack is Full");
            }

            if(arr[mid] == 0) midelement = element;

            else if(element>midelement) {
                mid=top;
                top++;
                arr[top] = element;
                System.out.println("pushed After");
            }else if (element<midelement) {
             mid=top;
             top--;
                arr[top]= element;
                System.out.println("pushed before");
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
                System.out.println(arr[mid]+"mid ele");
            }
        }


        public static void main(String[] args) {
//        int element=10;
            StackDemo s = new StackDemo();
            s.push(10);
            s.push(70);
            s.push(5);
            s.push(3);
            s.push(85);
            s.peek();
            s.display();
            s.pop();
            s.pop();
            s.display();
        }
    }
