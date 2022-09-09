package JavaPractical;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine();
        System.out.println(str1);
        String str2 =sc.nextLine();
        System.out.println(str2);
//        String str1 ="Rohit";
//        String str2= "Thiro";
        if(str1.length()==str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char s1[] = str1.toCharArray();
            char s2[]= str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            if(Arrays.equals(s1,s2))
                System.out.println("Anagrams Strings");
            else
                System.out.println("Not An Anagrams");

        }else {
            System.out.println("Not Anagrams");
        }
    }
}
