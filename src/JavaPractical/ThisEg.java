package JavaPractical;

public class ThisEg {
    int a;
   ThisEg(int a){
       this.a =a ;

   }
    public static void main(String[] args) {
        ThisEg t = new ThisEg(5);
        System.out.println(t.a);
        ThisEg t1 = new ThisEg(10);
        System.out.println(t1.a);
    }
}
