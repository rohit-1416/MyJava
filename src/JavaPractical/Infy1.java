package JavaPractical;

import java.util.Scanner;

public class Infy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr =sc.nextLine();
//        String strarr []= str.split(" ");
        char charnum[]=instr.toCharArray();
        int sum=0;
        for (int i=0;i<charnum.length-1;i++){
            if(instr.charAt(i)>=48&& instr.charAt(i)<=57){
                int a= Integer.parseInt(String.valueOf(charnum[i]));
                sum+=a;
            }
        }
        if(sum==0){
            System.out.println(-1);
            System.exit(0);
        }
        if(charnum[charnum.length-1]>=48 && charnum[charnum.length]<=57){
            int b=Integer.parseInt(String.valueOf(charnum[charnum.length-1]));
            sum+=b;

        }
        for(int d=2;d<sum;d++){
            if(sum%d==0){
                break;
            }
            else {
                System.out.println(sum);
                System.exit(0);
            }
        }
        String sum1= String.valueOf(sum);
        char ch[]= sum1.toCharArray();
        int i=0;
        int j=ch.length-1;
        while (i<j){
            char temp =ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        int finalSum= Integer.parseInt(String.valueOf(ch));
        for(int d=0;d<finalSum;d++){
            if(finalSum%d==0)
                break;
        }
        int count=0;
        for(int k=0;k<finalSum;k++){
            if(finalSum%i==0){
                count++;
            }
        }
            System.out.println(count);

    }

}
