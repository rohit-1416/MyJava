package MustDO;

public class PowerofNo {
    static double findPow(int base, int expo){
        double res = 1.0;
        while (expo != 0){
            res *= base;
            expo--;
        }
        return res;
    }
    public static void main(String[] args) {
        int base =2,expo =3;
        System.out.println(findPow(base,expo));
    }
}
