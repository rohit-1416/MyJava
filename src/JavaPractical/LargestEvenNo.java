package JavaPractical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LargestEvenNo {
    static public boolean isDigit(char digit){
        if (digit >= '0' && digit<='9') return true;
        return false;
    }
    public static void main(String[] args) {
        String str ="Hello#81@21349";

        HashSet <Integer> hs =new HashSet<>();
        for(int i =0;i<str.length();i++){
            if(isDigit(str.charAt(i))){
                String dig =String.valueOf(str.charAt(i));
                hs.add(Integer.parseInt(dig));
            }
        }
        ArrayList <Integer> digitList =new ArrayList<>(hs);
        Collections.sort(digitList,Collections.reverseOrder());
        int len =digitList.size();
        boolean evenDigitFound= false;
        for(int i=len-1 ; i>=0;i--){
            int digit =digitList.get(i);
            if(digit%2==0){
                digitList.remove(i);
                digitList.add(digit);
                evenDigitFound= true;
                break;
            }
        }
        if(evenDigitFound ==false)
            System.out.println(-1);
        else
            for(int d :digitList)
                System.out.print(d);

    }
}
