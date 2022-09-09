package JavaPractical;

class SuperClass{
    SuperClass(){
        System.out.println("call from super");
    }
    String color ="red";
    public void get (){
        System.out.println("Super class");
    }
}
class SuperEg extends SuperClass{
    SuperEg(){
//        super();  default constructor of super class called automatically
//calls super constructor and must be 1st statment of constructor
    }
    String color="Black";
    void display(){
        System.out.println("Sub class");
        System.out.println("Color = "+color);                     // Shows black color in sub class
        System.out.println(super.color);                          // shows red color from super class
        super.get();                                               // calls super method;

    }
    public static void main(String[] args) {
        SuperEg s = new SuperEg();
        s.display();

    }
}