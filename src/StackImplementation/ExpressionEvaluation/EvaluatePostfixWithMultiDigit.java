package StackImplementation.ExpressionEvaluation;

import java.util.Stack;

public class EvaluatePostfixWithMultiDigit {
    static  boolean isOperator(String op){
        return op.equals("+")||op.equals("-")||op.equals("*")
                ||op.equals("/")||op.equals("^");
    }

    static int compute(int op1,int op2,String op){
        switch(op){
            case "+":return op2+op1;
            case "-":return op2-op1;
            case "*":return op2*op1;
            case "/":return op2/op1;
            case "^":return (int)Math.pow(op2,op1);
            default:throw new IllegalArgumentException("Inavlid Operator "+op);
        }
    }


    static int evaluatePostfix(String exp){
        Stack<Integer> stack=new Stack<>();
        String[] strArr=exp.trim().split("\\s+");
        for(int i=0;i<strArr.length;i++){
            String ch=strArr[i];
            if(isOperator(ch)){
                int op1=stack.pop();
                int op2= stack.pop();
                stack.push(compute(op1,op2,ch));
            }
            else {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
//        String prefix="+1*23";
        try {
            String postfix = "101 2 6 * -";
            int output = evaluatePostfix(postfix);
            System.out.println("Output: " + output);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
