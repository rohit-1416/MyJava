package JavaPractical;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try{
           if(str.equals("abc"))
               System.out.println("abc");
           else
               System.out.println("nothing");

        }catch (NullPointerException e){
            System.out.println("null pointer exception");
        }

    }
}
