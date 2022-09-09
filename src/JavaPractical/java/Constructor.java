package JavaPractical.java;

public class Constructor {
    int a ;
    Constructor(){
        System.out.println("default");
    }
    Constructor(int val){
        this.a= val;
        System.out.println(val);
    }
    protected  void finalize(){
        System.out.println("destructing");
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor(10);
        Constructor obj3 = new Constructor(125);
        System.out.println(obj);
        obj.finalize();
        obj =null;
        System.gc();
        System.out.println(obj);
    }
}
