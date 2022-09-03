package JavaPractical;

class LinearSearchEg{
    public static int search(int arr[],int target, int count ) {
        for (int i =0; i<arr.length; i++) {
            if (arr[i] == target){
                count ++;
                System.out.println(count+" count");
                System.out.println(i+ " Position");
                continue;
//                return i;

            }
        }
        return -1;
    }

    public static void main(String[]args){
        int target = 10;
        int arr [] = {10,20,30,10,4,0,8,0,7,56,55,5,6,10,6,44,84848,10,848,484,848,4};

        int res =search(arr,target,0);
        if (res == -1){
            System.out.println("Elemet isnt there");
        }else {
            System.out.println("Fofund on "+ (res+1));
        }
        }
    }