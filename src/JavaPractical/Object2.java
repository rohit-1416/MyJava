package JavaPractical;

class Student{
    int id;
    String name;
    void showData(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
}

class Object2{
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.id=111;
        s1.name="RK";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}