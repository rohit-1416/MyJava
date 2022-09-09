package JavaPractical;

import sun.nio.cs.ext.ISO2022_CN_CNS;
//add reverse of num to mum till get palindrome no
//palindrome no is 121 => 121 means reverse of itself = itself
import java.util.Scanner;
class Infy_1RevPalindrome{
    public static int Reverse(int num){
        int rev =0;
        while (num>0){
            int digit =num%10;
            num= num/10;
            rev =rev*10+digit;
            System.out.println("Reverse : "+rev);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();
        do {
            num+= Reverse(num);
        }
        while (num!=Reverse(num));
        System.out.println(num);
    }
}
