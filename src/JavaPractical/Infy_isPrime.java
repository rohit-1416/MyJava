package JavaPractical;

import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

import javax.print.event.PrintEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Infy_isPrime {
    static boolean isPrime(int num){
        if(num<2)
            return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr =sc.nextLine();
        int outnum=0;
        boolean noPresent =false;
        String strarr[] = instr.split("\\s");
        int sum=0;
        for (int i=0;i<strarr.length-1;i++){
            try{
                int temp =Integer.parseInt(strarr[i])%10;
                sum+=temp;
                noPresent=true;
            }catch (Exception e){
            }
        }
        if(noPresent){
            if(isPrime(sum)){
                outnum=sum;
                System.out.println(outnum);
            }else {
                int rev =0;
                while(sum>0) {
                    rev= rev*10+(sum)%10;
                    sum=sum/10;
                }
                if(isPrime(rev)){
                    outnum=rev;
                    System.out.println(outnum);
                }else {
                    int ans=1;
                    for(int i=1;i<=rev;i++){
                        ans=ans*i;
                    }
                    System.out.println(ans);
                }
            }
        }
//        System.out.println(-1);
    }
}
