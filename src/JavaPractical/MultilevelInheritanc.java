package JavaPractical;

public class MultilevelInheritanc {
    protected void Print(){
        System.out.println("printing");
    }
}
class Derived1 extends MultilevelInheritanc{
    protected void Say() {
        System.out.println("Saying");

    }
}
class Derived2 extends Derived1{
    protected void Send(){
        System.out.println("Sending");
    }

    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        d2.Print();
        d2.Send();
        d2.Say();
    }
}
