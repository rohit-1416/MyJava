package MustDO;

public class PalindromeNo {
   static boolean isPalindrome(int num){
        int digit, reverse= 0 ;
        int temp = num;
        while (temp != 0){
            digit = temp %10 ;
            reverse = (reverse * 10) +digit;
            temp /= 10;
        }
       System.out.println(reverse);
       if (num == reverse)
           return true;
        return false;
    }
    public static void main(String[] args) {
        int num =121;
        System.out.println(isPalindrome(num));
    }
}
