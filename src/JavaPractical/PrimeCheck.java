package JavaPractical;

public class PrimeCheck {

    public static void main(String[] args) {
        int no =33;
        boolean check= true;
        if(no<2)
            check = false;
        else {
            for(int i=2;i<Math.sqrt(no);i++){
                if(no % i == 0) {
                    check = false;
                    break;
                }

            }
        }

        String result= check ?"Prime ":"Notprime";
        System.out.println(result);

    }
}
