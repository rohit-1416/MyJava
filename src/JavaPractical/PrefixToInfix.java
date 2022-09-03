package JavaPractical;

import java.util.Scanner;
import java.util.Stack;

class PrefixToInfix{
    static  boolean isOperator(char x){
        switch (x){
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
    public  static String convert(String str)
    {
        Stack<String> stack =new Stack<>();
        for(int i = str.length()-1; i>=0; i--)
        {
            char c =str.charAt(i);
            if(isOperator(c))
            {
                String op1 =stack.pop();
                String op2 =stack.pop();
//                concat operand and operator
                String temp = "("+op1+c+op2+")";
                stack.push(temp);
            }
            else {
//                make character as String
                stack.push(c+"");
            }
        }
        return stack.pop();
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String exp =sc.nextLine();
        System.out.println("Infix : " + convert(exp));
    }
}