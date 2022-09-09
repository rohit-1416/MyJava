package JavaPractical;

import java.util.Scanner;
class BinarySearch {
    public static int BSearch(int array[], int l, int r, int element) {
//        int start = array[0];
//        int end = array.length - 1;
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (array[mid] == element) {
                System.out.println("Element found");
                return mid;
            }
            if (array[mid] > element) {
//                System.out.println("Lesser element");
                return BSearch(array, l, mid - 1, element);
            } else{
//                System.out.println("Grater Element");
                return BSearch(array, mid + 1, r, element);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        System.out.println("Enter Sorted Elements ");
        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter Element to Search");
        int element= sc.nextInt();
        sc.close();
//        Search(array,element);

        int end = array.length - 1;
        BinarySearch b =new BinarySearch();
        int result= b.BSearch(array,0,end, element);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

    }
}
