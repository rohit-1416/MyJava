package JavaPractical;

public class ExtendingTheadClass extends Thread {
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        ExtendingTheadClass c = new ExtendingTheadClass();
        c.start();
    }

}
