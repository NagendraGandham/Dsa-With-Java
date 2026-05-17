package StackImplementation.InfixToPrefix;

import java.util.Scanner;
import java.util.Stack;/*
steps to convert infix to postfix
reverse th expression
change ( to ) and ) to (
convert expreseeion to postfix and in postfix same precedence  associative left to right
 we pop but here we push right to left associative will pop
reverse the expression again to get prefix
 */
public class InfixToPrefix {
static String reverseAndSwap(String expr){
    StringBuilder rev=new StringBuilder();
    for(int i=expr.length()-1;i>=0;i--){
        char ch=expr.charAt(i);
        if(ch=='('){
            rev.append(')');
        }
        else if(ch==')'){
            rev.append('(');
        }
        else{
            rev.append(ch);
        }
    }
    return rev.toString();
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
            while(!stack.isEmpty() && stack.peek()!='(' && (precedence(ch) < precedence(stack.peek())
                    || precedence(ch)==precedence(stack.peek()) && ch=='^')){
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

static int precedence(char ch) {
    switch (ch) {
        case '^':
            return 3;
        case '/', '*':
            return 2;
        case '+', '-':
            return 1;
    }
    return -1;
}

static String infixToPrefixFun(String expr){
    String exp=reverseAndSwap(expr);
    String postfix=infixToPostfix(exp);
    return new StringBuilder(postfix).reverse().toString();
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String expression=sc.nextLine();
    System.out.println("The infix expr is:"+expression+"\nthe postfix expr is:"+infixToPrefixFun(expression));
    }
}
