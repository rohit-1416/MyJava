package JavaPractical;//Set can not have duplicate value
//list can have duplicate values
//Order of insertion is
import java.util.HashSet;
import java.util.Set;

class SetDemo{
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(10);
        hs.add(50);
        hs.add(20);
        hs.add(20);
        System.out.println(hs);
    }
}