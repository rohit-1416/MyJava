package JavaPractical;

//interface are always public and abstract
//interface can extends another interface
interface division{
    int divide(int a, int b);
}
interface printable extends division{
//    jdk7 letter support static and default method in interface
    default void add(int a, int b) {
        int add = a + b ;
        System.out.println(add);
    }

    static void substract (int a, int b){
        int sub = a - b;
        System.out.println(sub);
    }
//    implementation of interface
    int multiply( int a, int b);
//    derived interface from base interface
    int divide(int a, int b);
}

public class InterfaceEg implements printable{

  public int multiply(int x, int y ){
      int mul = x * y;
      System.out.println(mul);
      return mul;
  }

    @Override
    public int divide(int a, int b) {
      int div = a /b ;
        System.out.println(div);
        return div;
    }

    public static void main(String[] args) {
        InterfaceEg i =new InterfaceEg();
        i.add(10 ,20);
        printable.substract(20, 10);
//        static method is refrance by classname.methodname
        i.multiply(10, 20);
        i.divide(20,2);
    }
}
