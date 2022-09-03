package JavaPractical;

public abstract class AbstractionImplementation {
    abstract void moveForword();
    abstract void moveBackword();
    public void start(){
        System.out.println("Engine started");
    }
}
class NewClass extends AbstractionImplementation{
    @Override
    void moveBackword() {
//        start();
        System.out.println("Moving Forword");
    }

    @Override
    void moveForword() {
//        start();
        System.out.println("Moving Backword");
    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.start();
        n.moveForword();
        n.moveBackword();

    }
}