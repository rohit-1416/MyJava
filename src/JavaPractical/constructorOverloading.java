package JavaPractical;

class constructorOverloading{
    constructorOverloading(){
        System.out.println("0 Param");
    }
    constructorOverloading(int a){
        System.out.println("1 param");
        System.out.println(a);
    }
    constructorOverloading(int a, int b){
        System.out.println(" 2 Param");
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        constructorOverloading c= new constructorOverloading(10, 5);

    }
}