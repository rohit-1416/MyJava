package JavaPractical;

public class AnonymusArary {
    static void sum(int[] array){
        int totle =0;
        for(int i :array )
            totle +=i;
        System.out.println(totle);
    }
    public static void main(String[] args) {
        sum(new int[]{1,2,3,4,5});
    }
}
