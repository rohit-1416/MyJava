package JavaPractical;

import java.util.Scanner;

public class Otp4digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String s1 ="";
        for(int i=0;i<str.length();i+=2){
             s1+=Integer.parseInt(""+str.charAt(i))*Integer.parseInt(""+str.charAt(i));
        }
        System.out.println(s1);
        System.out.println(s1.substring(0,4));
    }
}
