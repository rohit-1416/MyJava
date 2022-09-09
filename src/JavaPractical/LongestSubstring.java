package JavaPractical;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str =sc.nextLine();
        LinkedHashSet<Character> hs =new LinkedHashSet<>();
        char strarr[]=str.toCharArray();
//        String strarr[]=str.split("\\s");
        for(int i=0;i<strarr.length;i++) {
            hs.add(strarr[i]);
        }
        Iterator<Character>itr =hs.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
