package JavaPractical;

import java.util.Scanner;

class LargestInThree{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int grt;
        grt = a > b ? (a>c?a:b):(b>c ? b :c);
        System.out.println(grt);
}}