package StackImplementation.ExpressionEvaluation;

import java.util.Stack;

public class EvaluatePrefixWithMultiDigit {

    static  boolean isOperator(char op){
        return op=='+'||op=='-'||op=='*'||op=='/'||op=='^';
    }

    static int compute(int op1,int op2,char op){
        switch(op){
            case '+':return op1+op2;
            case '-':return op1-op2;
            case '*':return op1*op2;
            case '/':return op1/op2;
            case '^':return (int)Math.pow(op1,op2);
            default:throw new IllegalArgumentException("Inavlid Operator "+op);
        }
    }

    static  int evaluatePrefixWithDigit(char[] exp){
        Stack<Integer> stack=new Stack<>();
        int i=exp.length-1;
        while(i>=0){
            if(exp[i]==' '){
                i--;
                continue;
            }
            char ch=exp[i];
            if(isOperator(ch)){
                int op1=stack.pop();
                int op2= stack.pop();
                stack.push(compute(op1,op2,ch));
                i--;
            }
            else if(Character.isDigit(ch)){
                StringBuilder num=new StringBuilder();
                while(i>=0 && Character.isDigit(exp[i])){
                    num.insert(0,exp[i]);
                    i--;
                }
                stack.push(Integer.parseInt(num.toString()));
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
//                String prefix = "^ 2 2";
                String prefix = "+ 10 * 2 3";
                char[] charArr=prefix.toCharArray();
                int output = evaluatePrefixWithDigit(charArr);
                System.out.println("Output: " + output);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
   }
