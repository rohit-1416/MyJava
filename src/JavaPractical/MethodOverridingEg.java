package JavaPractical;

public class MethodOverridingEg {
  public void method1(int a, int b){
      System.out.println(a+b);
  }
}
class Classs2 extends MethodOverridingEg{
    public void method1(int a, int b){
        super.method1(10,40);
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        Classs2 c= new Classs2();

        c.method1(10,20);
    }
}
