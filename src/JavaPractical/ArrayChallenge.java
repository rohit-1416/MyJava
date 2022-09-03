package JavaPractical;

import java.util.ArrayList;

public class ArrayChallenge {
    void ArrayNAme(int arr[]){
    int result =1 ;
        ArrayList <Integer> Newarr = new ArrayList<>();
        int j = 0 ;
        while( j< 5) {

            for (int i = 0; i < arr.length; i++) {
                if(j== arr[i])
                    break;
                result *= arr[i];
            }
            Newarr.add(result);
            j++;
        }
        System.out.println(Newarr);
    }

    public static void main(String[] args) {
        ArrayChallenge a = new ArrayChallenge();
        a.ArrayNAme(new int []{1,2,3,4,5});
    }
}
