package JavaPractical;//program returns reverse of no if it is armstrong
//else return no itself if not armstrong
 import java.util.Scanner;

public class ArmstrongNo {
    public static int reverse(int num){
        int  reverse=0;
        while (num !=0 ){
            int digit =num%10;
            reverse =reverse*10 +digit;
            num= num/10;
            System.out.println("reverse="+reverse);
        }
        return reverse;

    }

    public static int Armstrong(int num){
//        noOfDigit = length of no
        int noOfDigit =0,temp,sum=0,digit=0;
        temp =num;
        while (temp>0){
           temp /=10;
           noOfDigit++;
        }
        temp =num;
        while (temp>0){
            digit = temp%10;
            sum +=(Math.pow(digit,noOfDigit));
            temp=temp/10;
        }
        if(num ==sum)
            return reverse(sum);
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
//checks Armstrong no or not
        System.out.println(Armstrong(num));


    }
}
