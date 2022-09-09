package JavaPractical;

class MethodOverloading{
    public int showA(){
        System.out.println("0 Param");
        return 0;
    }
    public int showA(int a){
//        System.out.println(a);
        System.out.println("1 Param");
        return a;
    }
    public int showA(int a, int b){
        System.out.println(a+ " "+b);
        System.out.println(" 2 Param");
        return a*b;
    }
    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
//        m.showA(5,4);
        System.out.println(m.showA(10,20));
    }
}