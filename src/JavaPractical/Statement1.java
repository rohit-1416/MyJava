package JavaPractical;

import java.util.Scanner;

class Statement1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int num = sc.nextInt();
        int temp1,temp,digit1, rev = 0,rev1=0, digit;

        temp = num;
        while (num > 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        temp1=temp;
        temp += rev;
       while (temp1!=rev1) {
           while (temp > 0) {
               digit1 = temp % 10;
               rev1 = (rev1 * 10) + digit1;
               temp = temp / 10;
           }
       }

    }
}