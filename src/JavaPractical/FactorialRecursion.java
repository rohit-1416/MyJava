package JavaPractical;

public class FactorialRecursion {
    public static int factorial(int no){
        if(no ==0)
            return 0;
        else
            return no*factorial(no-1);
    }
    public static void main(String[] args) {
        int no =5;
        int i, fact =1;
        fact =factorial(no);
        System.out.println(fact);
    }
}
