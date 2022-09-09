package JavaPractical;

class InheritanceEg_{
    public int a= 10,b=5;
    public void getA(){
        System.out.println("A ="+a);
//        return a;
    }
    static class InheritanceEg extends InheritanceEg_{
        public  void getB(){
            System.out.println("B = "+b);
//            return b;
        }
        public void calculate(){
            System.out.println(a*b);
        }

    }
    public static void main(String[] args) {
        InheritanceEg e =new InheritanceEg ();
        e.getA();
        e.getB();
        System.out.println("**********************************************");
        e.calculate();
    }
}