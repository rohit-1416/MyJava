package JavaPractical;

public class MethodOverloadingEg {
    public int AddNum(int a, int b){
        return a+b;
    }
    public int AddNum(int a, int b, int c){
        return a+b+c;
    }
//    public float AddNum(float a, float b){
//        return a+b;
//    }
    public double AddNum(float a, float b){
        return (a+b);
    }

    public static void main(String[] args) {
        MethodOverloadingEg obj =new MethodOverloadingEg();
        System.out.println(obj.AddNum(10,20));
        System.out.println(obj.AddNum(10,20,30));
        System.out.println(obj.AddNum(10.18f,20.45f));

    }
}
