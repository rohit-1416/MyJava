package JavaPractical;

import java.util.Scanner;

class ReverseNo {
    public  static int reverse(int n){
        int reverse=0;
        while (n!=0){
            int digit = n%10;
            reverse = reverse*10+ digit;
            n=n/10;
//            System.out.println(reverse);
        }

        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no ");
        int n =sc.nextInt();

        ReverseNo r= new ReverseNo();
//        System.out.println(r.reverse(n));
        do{
            n+=reverse(n);
        }while (n!= reverse(n));
        System.out.println(n);
    }
}
