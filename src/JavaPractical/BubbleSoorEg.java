package JavaPractical;

class BubbleSortEg{
    public static int Find(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr [j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
             }

        }
        return -1;
    }

    public static int Print(int arr[]){
        for(int i = 0 ;i<arr.length; ++i){
            System.out.println(arr[i]+" ");
        }
        return -1;
    }

    public static void main(String[] args){
        BubbleSortEg ob =new BubbleSortEg();
        int arr [] = {10,70,84,90,20,44,30,4,0,7,88};
        ob.Find(arr);
        System.out.println("Sorted Array");
        ob.Print(arr);

    }
}