package JavaPractical;

//multilevel Inheritance
//                      College
//                          ^
//                      Department
//                          ^
//                         Teacher
//
//

//Hierarchical  Inheritance
//                       College
//                          ^
//                      Department
//                         /\
//              Teacher         LabAssistance
//
//

class College{
    int code =5002 ;
    String collegeName  = "GHRCEM";
    String address = "Wagholi";
    boolean isOpen =true;
    void showCollegeDetails(){
        System.out.println("!!!!!!!!!!!!!  College details !!!!!!!!!!!!");
        System.out.println( code +"\n"+collegeName+
                "\n"+address+ "\nadmisoon open "+isOpen);

    }
}

class Department extends College{
    int deptid = 101;
    String dept = "comp";
    void showDepartmentDetail(){
        System.out.println("$$$$$$$$$$$$$$$  Department Details $$$$$$$$$ ");
        System.out.println(deptid +" " +dept+ " from "+ collegeName);
    }
}
class Teacher extends Department{
    int id = 12;
    String TeacherName = "XYZ";
    String Subject = "DSA";
    void showTeacherDetails(){
        System.out.println("---------- Teacher Detail ---------");
        System.out.println(id +" "+TeacherName+ " from "
                +dept+" for subject "+Subject + " of clg "+ collegeName);
    }
}
class LabAssistant extends Department{
    int assid = 505;
    void showLabAssitantsDetails(){
        System.out.println("%%%%%%%%%%%% LAB ASSITANT %%%%%%%%%%%");
        System.out.println(assid + " from "+dept + " of" +collegeName);
    }
}


public class InheritanceEG  {

    public static void main(String[] args){
//        Single Inheritance
        Department d = new Department();
        d.showCollegeDetails();;                          //college->department
        d.showDepartmentDetail();

//multilevel Inheritance
        Teacher t = new Teacher();                      // college-> department -> Teacher
        t.showCollegeDetails();
        t.showDepartmentDetail();
        t.showTeacherDetails();

//        Hierarchical  Inheritance
        LabAssistant la = new LabAssistant();           // college -> department-> labAssistance
        la.showCollegeDetails();
        la.showDepartmentDetail();
        la.showLabAssitantsDetails();
    }
}
