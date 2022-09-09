package JavaPractical;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        String str ="radar";
        String revstr="";
        str =str.toLowerCase();
        for (int i =str.length()-1; i>=0 ;--i){
            revstr =revstr+str.charAt(i);
        }
        System.out.println(str);
        System.out.println(revstr);
        if (str.equals(revstr))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}
