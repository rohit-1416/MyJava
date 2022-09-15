package MustDO;

public class PerfectNo {
    static  boolean checkPerfect(int num){
        int sum =0 ;
        for (int i = 1 ; i< num ; i++)
            if (num % i == 0)
                sum += i;
        if (sum == num)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int num = 28 ;
        System.out.println(checkPerfect(num));
    }
}
