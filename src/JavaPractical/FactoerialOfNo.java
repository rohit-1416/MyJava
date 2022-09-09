package JavaPractical;

public class FactoerialOfNo {
//    static void getFactor(int num){
//        for (int i = 1; i <= (num/2); i++)
//        {
//            if (num % i == 0)
//            {
//                // Example (10,10) we only want to print once
//                // If both factors are equal then print just one
//                if (i == num / i) {
//                    System.out.print(i + " ");
//                    // other wise print both
//                }
//                else {
//                    System.out.print(i + " " + num / i + " ");
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        int num =10;
//        getFactor(num);

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }
}
