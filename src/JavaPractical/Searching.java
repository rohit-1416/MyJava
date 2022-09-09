package JavaPractical;

import java.util.Scanner;

class Searching{
    public static void Search(int array[],int element){
        for(int i=0;i<array.length;i++){
            if(array[i]==element)
                System.out.println("Fount at "+array[i]+" position");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        System.out.println("Enter Elements You want");
        int array[]=new int[size];

        for(int i=0;i<=size-1;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter Element to Search");
        int element= sc.nextInt();
        sc.close();
        Search(array,element);
    }
}