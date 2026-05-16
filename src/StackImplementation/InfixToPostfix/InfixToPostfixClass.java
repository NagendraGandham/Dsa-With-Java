package StackImplementation.InfixToPostfix;

import java.util.Stack;

public class InfixToPostfixClass {
    static int precedence(char ch){
        switch(ch){
            case '^':return 3;
            case '/','*':return 2;
            case '+','-':return 1;
        }
        return -1;
    }

    static boolean isRightAssociative(char ch){
        return ch=='^';
    }

    static String infixToPostfix(String exp){
        StringBuilder output=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                output.append(ch);
            }
            else if(ch=='('){
                stack.push('(');
            }
            else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    output.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && stack.peek()=='(' && (precedence(ch) < precedence(stack.peek())
                        || precedence(ch)==precedence(stack.peek()) && !isRightAssociative(ch))){
                        output.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            output.append(stack.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String expression="a+b+c";
        System.out.println("The infix expr is:"+expression+"\nthe postfix expr is:"+infixToPostfix(expression));;
    }
}
