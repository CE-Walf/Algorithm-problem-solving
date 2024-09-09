import java.util.*;

class Solution {
    boolean solution(String s) {
        // Stack 선언
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char parentheses = s.charAt(i);
            
            // 열린 괄호일 때 스택에 추가
            if (parentheses == '(') {
                stack.push(parentheses);
            } else {
                // 닫힌 괄호가 들어오는데, 스택이 비어있다면 올바르지 않은 괄호
                if (stack.isEmpty()){
                    return false;
                }
                // 열린 괄호와 매칭. 삭제 
                stack.pop(); 
            }
        }

        // 문제 없이 반복문을 탈출하고,
        // 열린괄호가 다 사라져 스택이 비어있다면, 올바른 괄호
        // 스택이 비어있지 않다면, 올바르지 않은 괄호이다.
        return stack.isEmpty();
    }
}