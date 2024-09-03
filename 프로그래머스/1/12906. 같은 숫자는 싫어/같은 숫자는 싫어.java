import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택 선언
        Stack<Integer> stack = new Stack<>();
        
        // 배열을 순회한다.
        // 스택이 비어있거나, 맨 위의 값이랑 element의 값이 같지 않을 때 push한다.
        for (int element : arr){
            if (stack.isEmpty() || stack.peek() != element){
                stack.push(element);
            }
        }
        
        // Stack을 배열로 바꿔준다.
        int[] answer = new int[stack.size()];
        // Stack은 LIFO 구조로, 정답 배열의 맨 뒤부터 채운다.
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}