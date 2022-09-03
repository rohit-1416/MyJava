package JavaPractical;

class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
            System.out.println("From A:i "+i);
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
            System.out.println("From B:i "+i);
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
            System.out.println("From C:i "+i);
        System.out.println("Exit from C");
    }
}
class ThreadClass{
    public static void main(String[] args) {
        A a =new A();
        a.start();
//        abbrivation
        new B().start();
        new C().start();
        System.out.println("Exit from Main");
        Thread t =Thread.currentThread();
        System.out.println("********************************current thread is "+t);
    }
}