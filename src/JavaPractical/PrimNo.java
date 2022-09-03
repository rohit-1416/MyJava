package JavaPractical;

public class PrimNo {

    public static void main(String[] args) {
        boolean isPrime = false;
        int no = 29;
        if (no < 2) {
            isPrime = false;
        }
        for (int i = 2; i < Math.sqrt(no); i++) {
            if (no / i == 0) {
                isPrime = false;
                break;
            }
        }

        String result = isPrime ? "Prime" : "not Prime";
        System.out.println("The number " + no + " is : " + result);
    }
}
