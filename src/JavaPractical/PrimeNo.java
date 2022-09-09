package JavaPractical;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

class PrimeNo{
    public static boolean isprime(int no){
        if(no<= 1) {
            return false;
        }

            for(int i=2; i<no/2;i++){
                if (no%i==0)
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int no= sc.nextInt();
        if (isprime(no))
            System.out.println(no+ " is prime");
        else
            System.out.println(no+" is not Prime ");

    }
}