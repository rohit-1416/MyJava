package JavaPractical;

import java.util.Stack;

class InfixToPostfix{
    static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfixExp(String exp){
        String result = "";
        Stack <Character> stack =new Stack<>();

        for(int i =0 ; i<exp.length(); i++){
            char c = exp.charAt(i);
//            if expression cointain letter or digit i.e not operatr
            if(Character.isLetterOrDigit(c))
                result += c;
            else if(c == '(')
                stack.push(c);
            else if(c== ')')
            {
                while (stack.peek()!='('&& !stack.isEmpty())

                    result += stack.pop();

                stack.pop();
            }
            else{
                while (!stack.isEmpty() && precedence(c) <=(stack.peek()))
                {
                    result+= stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();

        }
        return result;
    }
    public static void main(String[]args){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfixExp(exp));
    }
}