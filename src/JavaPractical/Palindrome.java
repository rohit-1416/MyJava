package JavaPractical;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int n,digit,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to check");
        n= sc.nextInt();

        temp=n;
        while (n>0) {
             digit = n % 10;
            sum= (sum*10)+digit;
            n = n / 10;
        }
        if (temp==sum)
            System.out.println("No is palindrome");
        else
            System.out.println("Not palindrome");
    }
}