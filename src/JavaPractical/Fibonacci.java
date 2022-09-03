package JavaPractical;

import java.util.*;
//next no is sum of previous 2 nos
class Fibonacci{
    public static void main(String[] args) {
        int n1=0,n2=1,n3=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter till you want :");
        int till =sc.nextInt();
        for(int i=0;i<=till;i++)
        {
            n3 =n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}