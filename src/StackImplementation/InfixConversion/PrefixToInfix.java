package StackImplementation.InfixConversion;

import java.util.Scanner;
import java.util.Stack;

//for prefix to infix we do same as postfix
//but rule 1 is we will push from right to left means reverse expression
//and in postfix to prefix we evalute like poped2 operand poped1 but here poped1 operand poped 2
public class PrefixToInfix {
    static  String prefixToInfix(String prefix){
        Stack<String> stack=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push("("+op1+ch+op2+")");
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        //*+ab/ef
        //-+a*bc-/de+fg
        System.out.println("Enter the  Prefix Expression:");
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        System.out.println("Infix:"+prefixToInfix(expression));
    }
}
