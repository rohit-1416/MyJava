package MustDO;

public class ArmStrongNo {
    static int len(int num){
        int  count  =0 ;
        while (num != 0 ){
            num /= 10;
            count++;
        }
        System.out.println(count);
        return count;
    }
    static int isArmstrong(int num, int count){
        int digit, sum =0;
        while (num != 0 ){
            digit = num %10;
            sum = sum + (int)Math.pow(digit,count);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 317;

        System.out.println(isArmstrong(n,len(n)));
    }
}
