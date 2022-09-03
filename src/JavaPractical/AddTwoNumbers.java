package JavaPractical;

import java.util.*;

public class AddTwoNumbers {
    public static  void main(String [] args){

        int T;

        Scanner sc =new Scanner(System.in);
        T =sc.nextInt();
        while( T!= 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (a) {
                case 0:
                    if(b==0){
                        System.out.println("never gonna mind");
                    }else{
                        System.out.println(a + b + "Testing");
                    }
                    break;

                case 10:
                    System.out.println("Ohh You wanna add 10");
                    break;
                default:
                    System.out.println("thanks!!!!!!!!!");
            }
            System.out.println(a + b);
            T--;
        }

    }
}