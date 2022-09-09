package JavaPractical;

class ReturnSomething{
    int display(){
        return 10;
    }

    public static void main(String[] args) {
        ReturnSomething r= new ReturnSomething();
        System.out.println( r.display());
    }
}