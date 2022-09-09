package JavaPractical;

import java.util.Scanner;

class ComputeQR{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int no1= sc.nextInt();
        int no2=sc.nextInt();
        System.out.println("Remainder = "+ no1%no2);
        System.out.println("Questiont = "+no1/no2);
    }
}