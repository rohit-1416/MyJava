package JavaPractical;

public class WrapperClasses {
    public static void main(String[] args) {
//        Autoboxing = premetive-> Wrapper = int->Integer
        int a= 20;
        Integer i =Integer.valueOf(a);// Explicite conversion
        Integer j =a;
        System.out.println(a+" "+i+" "+j);
//        Unboxing Wrapper  -> Premitive Integer-> int;


        Integer b =new Integer(50);
        int k =b.intValue(); // Explicite conversion
        int l =b;
        System.out.println(b+" "+k+" "+l);
    }
}
