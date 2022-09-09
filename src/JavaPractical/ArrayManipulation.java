package JavaPractical;/*
Input: Given a list of numbers separated with a comma.The numbers 5 and 8 are present in the list.

Assume that 8 always comes after 5.

Case 1: num1 -> Add all numbers which do not lie between 5 and 8 in the Input List.

Case 2: num2 -> Numbers formed by concatenating all numbers from 5 to 8 in the list

.Output: Sum of num1 and num2

Example: 3,2,6,5,1,4,8,9

Num1: 3+2+6+9 =20

Num2: 5148O/p=5148+20 = 5168
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayManipulation  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[]= br.readLine().split(",");
        int num=0;
        String num2="";
        int indexOfFive=-1;
        int indexOfEaight=-1;
        int arr[]= new int [str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);   // conversion string to int array
            if(arr[i]==5)
                indexOfFive=i;
            else if(arr[i]==8)
                    indexOfEaight = i;
        }
        for(int i =indexOfFive;i<=indexOfEaight;i++){
            num2 +=str[i];
            arr[i]=0; // assining used value to 0 so no need in nxt itration
        }
        for (int num1: arr) {
            num+= num; //here we are adding all values. we have assigned zero in above loop
            //between fiveIndex and eightIndex in the arr.so it will add remaining outer values.
        }
        System.out.println(num + (Integer.parseInt(num2))); //print the sum!
    }
}
