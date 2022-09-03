package JavaPractical;

interface I1{
    void print();
}
interface I2{
    void print();
}
public class MultipleInheritance implements I1, I2{
    public void print(){
        System.out.println("Printing");
    }
    public void Say(){
        System.out.println("Saying");
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.Say();
        m.print();
    }
}
