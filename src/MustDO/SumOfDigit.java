package MustDO;

public class SumOfDigit {
    static int AddEachDigit(int n){
        int sum = 0 ;
        while (n!= 0 ){
            sum += n %10 ;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 43;
        System.out.println(AddEachDigit(n));
    }
}
