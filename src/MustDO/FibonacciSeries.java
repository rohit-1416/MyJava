package MustDO;

public class FibonacciSeries {
    static int findFibo(int n){
        int arr[] = new int[n+2];
        arr[0] =0;
        arr[1] =1 ;
        System.out.print(arr[0]+" "+arr[1]);
        for(int i = 2 ; i <= n ;i++ ){
            arr[i] = arr[i-1]+arr[i-2];
            System.out.print(" " +arr[i]+ " ");
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(findFibo(n));
    }
}
