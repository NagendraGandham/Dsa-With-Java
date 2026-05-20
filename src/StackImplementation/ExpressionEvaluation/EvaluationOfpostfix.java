package StackImplementation.ExpressionEvaluation;

import java.util.Stack;

public class EvaluationOfpostfix {
    static  boolean isOperator(char op){
        return op=='+'||op=='-'||op=='*'||op=='/'||op=='^';
    }

    static int compute(int op1,int op2,char op){
        switch(op){
            case '+':return op2+op1;
            case '-':return op2-op1;
            case '*':return op2*op1;
            case '/':return op2/op1;
            case '^':return (int)Math.pow(op2,op1);
            default:throw new IllegalArgumentException("Inavlid Operator "+op);
        }
    }


    static int evaluatePostfix(String exp){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
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
            String postfix = "126*-";
            int output = evaluatePostfix(postfix);
            System.out.println("Output: " + output);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
