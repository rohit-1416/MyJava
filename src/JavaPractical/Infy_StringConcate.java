package JavaPractical;

public class Infy_StringConcate {
    public static void main(String[] args) {
        String str ="HelloWorld";
        String str1="";
        String finalString ="";
        for(int i =0;i<str.length()/2;i++)
        {
            str1+= str.charAt(i);
        }
        String str2= "";
        for (int i=str.length()-1;i>(str.length()/2)-1; --i){
            str2+= str.charAt(i);
        }
        System.out.println(str1+" "+str2);
        for(int i=0;i<str1.length();i++){
            finalString+= str1.charAt(i);
            System.out.println("1:" +finalString);
            finalString+= str2.charAt(i);
            System.out.println("2: "+finalString);
        }
        System.out.println(finalString);
    }

}
//Hello World
//HdellrlooW