package StackImplementation.InfixConversion;

import java.util.Scanner;
import java.util.Stack;

public class PostFixToInfix {
    static  String postfixToInfix(String postfix){
        Stack<String> stack=new Stack<>();
        for(char ch:postfix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push("("+op2+ch+op1+")");
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        //ab+ef/+
        //ab+cd-*e/
        System.out.println("Enter the  Postfix Expression:");
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        System.out.println("Infix:"+postfixToInfix(expression));
    }
}
