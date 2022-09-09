package JavaPractical;

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String arr[] =br.readLine().split(",");
        HashSet<Integer> hs =new HashSet<>();
        for(int i =0 ; i<arr.length;i++){
            hs.add(Integer.parseInt(arr[i]));
            System.out.println(hs);
        }
        System.out.println();
        System.out.println("size "+hs.size());
        System.out.println("n "+n);
        System.out.println(hs.size()-n);
    }
}
