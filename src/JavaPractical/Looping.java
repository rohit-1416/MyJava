package JavaPractical;

import java.util.Arrays;
import java.util.Scanner;

class Looping{
    public static void main(String[] args){
//        int i =10 ;
//        for (i = 0 ;i<= 10 ;++i)
////        {
////            System.out.println(" 2 * "+ i + " =" +2*i);
/////
//        System.out.println("Enter elements of array");
////        for(int i= 0 ;i<arr.length;i++){
//            arr[i] =sc.nextInt();
//        }
////        for(int i= 0 ;i<arr.length;i++){
////            System.out.println(arr[i]);
////        }
//
//        Arrays.sort(arr);
//        for (int i = 0 ; i<arr.length; i++) {
//            System.out.println(arr[i]+ " nnnn ");
//
//        }
//
  int n = 10;
        for (int i =0 ; i<= n ; i++){
            if (i == 5){
                System.out.println("Two");
                continue;
            }
            System.out.println(i);
        }
    }
}