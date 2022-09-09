package JavaPractical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Infy_mcq {
    public static void main (String[] args) {
        List<String> strList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        strList.add("palamstreet");
        strList.add("is");
        strList.set(1, "in");
        System.out.println("1 " + strList);
        strList.add("not");
        System.out.println("2 " + strList);
        strList.set(0, "to");
        System.out.println("3 " + strList);
        list.addAll(0, strList);
        System.out.println("4 " + list);

        Iterator<String> itr = strList.iterator();
        while (itr.hasNext()) {
            if (strList.contains("in")) {
                strList.set(0, "Indonesia");
            } else {
                strList.add("india");
            }
            System.out.println(itr.next());
        }
    }
    }
