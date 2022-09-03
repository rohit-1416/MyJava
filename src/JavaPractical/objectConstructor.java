package JavaPractical;

class Emp{
    int id;
    float sal;
    String name;
    Emp(int i,float s,String n)
    {
        id=i;
        sal=s;
        name= n;
    }
    void show(){
        System.out.println(id + " "+sal+" "+name);
    }
}
class objectConstructor{
    public static void main(String[] args) {
    Emp e= new Emp(1,150000.2f,"rk");
    Emp e2 =new Emp(0,2.2f,"  l"); //overrriden by following
    e2.name="RK";
    e2.sal=1300.2f;
    e2.id=12;
    e.show();
    e2.show();
    }
}