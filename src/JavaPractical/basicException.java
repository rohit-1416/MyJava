package JavaPractical;

public class basicException {
    public static void main(String[] args) {
        try{
            int data= 10/0;

        }
        catch (Exception e){

            System.out.println(" caughted Exception is "+e);
        }
        System.out.println("Running fine ");
    }
}
