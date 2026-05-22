package StackImplementation.ExpressionEvaluation;

import java.util.Stack;

public class ValidParanthesis {
    static boolean checkValidParanthesis(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if(ch!='(' && ch!='[' && ch !='{' && ch!='}' && ch!=')' && ch!=']'){
                continue;
            }
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if ((ch == ')' && c != '(') || (ch == '}' && c != '{') || (ch == ']' && c != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        String exp="(){}[]";
        String exp="[(1+2){}[]]";
//        String exp="[({)}]";
        boolean result=checkValidParanthesis(exp);
        System.out.println(result);
    }
}
