package JavaPractical;

abstract class AbstractionEg {
    public abstract void multiply(int x, int y);
    public abstract int substract (int a, int b );
    public int add( int a, int b){
        int add =a+b;
        System.out.println("addition is "+ add );
        return add;
    }
}
class timepass extends AbstractionEg{

    public void multiply(int a ,int b){
       int mul = a*b;
        System.out.println("multiplication is "+mul);
    }
    public int substract(int a, int b){
        int sub = a - b;
        System.out.println("subtraction is "+ sub);
        return sub;
    }

    public static void main(String[] args) {
        timepass t = new timepass();
//        t.add(10,20);
        System.out.println(t.add(15,10));
        System.out.println(t.substract(15,10));
        t.multiply(15,10);
    }
}