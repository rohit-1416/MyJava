package JavaPractical;

class Class1{
    public static void display(){
        System.out.println("Inside Class1" );
    }
}
class Class2 extends Class1{
    public static void display(){
        System.out.println("Inside Class2" );
    }
}
class Dmd extends Class2 {
    public static void main(String[] args) {
        Dmd d = new Dmd();
        Class2 c2= new Dmd();
        c2.display();
        d.display();
    }
}