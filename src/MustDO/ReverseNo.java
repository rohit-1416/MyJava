package MustDO;

public class ReverseNo {
    static int Reverse(int num){
        int digit, reverse =0 ;
        while (num != 0 ){
            digit = num % 10 ;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num= 1234;
        System.out.println(Reverse(num));
    }
}
