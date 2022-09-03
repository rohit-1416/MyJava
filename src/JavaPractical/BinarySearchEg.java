package JavaPractical;

class BinarySearchEg{
    public static int Search(int arr[], int l,int r, int target){
        if(r>=l){
            int mid = l+(r-l)/2;
            if(arr[mid]==target)
                return mid;
            if (arr[mid]>target)
                return Search(arr,l,mid-1,target);
            return Search(arr,mid+1,r,target);
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearchEg ob =new BinarySearchEg();
        int arr [] ={10,20,30,40,50,60,70,80,90,100};
        int target =70;
        int result = ob.Search(arr,0,arr.length-1,target);
        if(result == -1)
            System.out.println("Not present");
        else
            System.out.println("Found at "+(result+1));
    }
}