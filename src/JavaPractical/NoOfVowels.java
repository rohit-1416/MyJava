package JavaPractical;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;

public class NoOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();

        int Vcount =0, Ccount=0;
        str= str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                Ccount++;
            else
                Vcount++;
        }
        System.out.println("Consonants: "+Ccount+"  Vowels: "+Vcount);
    }
}
