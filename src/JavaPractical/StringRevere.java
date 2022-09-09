package JavaPractical;

import java.util.Scanner;

public class StringRevere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

//        Method 1
//        String newstr = "";
//        char ch;
//        for(int i =0; i< str.length();i++){
//            ch =str.charAt(i);
//            newstr =ch+newstr;
//        }
//        System.out.println(newstr);

//        Method 2
        char charArray[]=str.toCharArray();
        for(int i= charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}
