package JavaPractical;

public class MatrixAddition {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}} ;
        int b[][]={{1,2,3},{4,5,6},{7,8,9}} ;
        int row=3,col=3;
        int c[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition is");
        for (int []rows :c){
            for (int cols:rows){
                System.out.print(cols+"\t");

            }
            System.out.println();
        }

    }
}
