package StackImplementation.ExpressionEvaluation;

import java.util.Stack;

public class PrefixEvaluation {
    static  boolean isOperator(char op){
        return op=='+'||op=='-'||op=='*'||op=='/'||op=='^';
    }

    static int compute(int op1,int op2,char op){
        switch(op){
            case '+':return op1+op2;
            case '_':return op1-op2;
            case '*':return op1*op2;
            case '/':return op1/op2;
            case '^':return (int)Math.pow(op1,op2);
            default:throw new IllegalArgumentException("Inavlid Operator "+op);
        }
    }


    static int evaluatePrefix(String exp){
        Stack<Integer> stack=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else if(isOperator(ch)){
                int op1=stack.pop();
                int op2= stack.pop();
                stack.push(compute(op1,op2,ch));
            }
            else{
                throw new IllegalArgumentException("Invalid Character: "+ch);
            }

        }
        return stack.pop();
    }
    public static void main(String[] args) {
//        String prefix="+1*23";
        try {
            String prefix = "^22";
            int output = evaluatePrefix(prefix);
            System.out.println("Output: " + output);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
