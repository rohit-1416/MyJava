package JavaPractical;//Worst case complexity O(N^2)

import java.util.Scanner;

class BubbleSort{
    static void SortArray(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            //check second element with fst
            for (int j=1; j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("How many elemennts ? ");

        int size =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter unsorted Elements");
//        for (int i=0; i<=size;i++);
//        {
//            arr[i]=sc.nextInt();
//        }
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Before Sorting ");
        for(int i :arr){
            System.out.print(i+ "\t");
        }
        SortArray(arr);

        System.out.println("after sorting ");
        for (int i :arr){
            System.out.print(i+"\t");
        }
    }
}
