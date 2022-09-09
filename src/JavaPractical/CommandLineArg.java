package JavaPractical;

class CommandLineArg{
    public static void main(String[] args) {
        try {
            String txt1 = args[0];
            String txt2 = args[1];
            int a = Integer.parseInt(txt1);
            int b = Integer.parseInt(txt2);
            System.out.println("Addition = "+(a+b));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Too few args");
        }
    }
}