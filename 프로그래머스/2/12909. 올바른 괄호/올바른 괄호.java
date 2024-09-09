import java.util.*;

class Solution {
    boolean solution(String s) {
        // Stack을 사용하여 풀어보자.
        Stack<String> stack = new Stack<>();
        
        // 문자열 s을 순회하며, 열린 괄호일때 push하고, 닫힌 괄호일 때 pop해주자. 
        for (int i = 0; i < s.length(); i++){
            char parentheses = s.charAt(i);
            if (parentheses == '('){
                stack.push("(");
            }
            
            if (parentheses == ')' && !stack.isEmpty()){
                stack.pop();
            } else if (stack.isEmpty() && parentheses == ')'){ 
                // 열린괄호가 없는데, 닫힌 괄호가 나오면 올바르지 않은 괄호
                return false;
            }
        }
        
        // 스택에 남아있는 값이 없을 때, 올바른 괄호이고
        // 그렇지 않을때는 올바르지 않은 괄호이다.
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}