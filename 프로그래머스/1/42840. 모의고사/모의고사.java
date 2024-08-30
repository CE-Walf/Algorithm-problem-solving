// 리팩토링 해보자.
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 1 -> [1, 2, 3, 4, 5] 반복
        int[] supoPattern1 = {1, 2, 3, 4, 5};
        // 수포자 2 ->  [2, 1, 2, 3, 2, 4, 2, 5] 반복
        int[] supoPattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // 수포자 3 -> [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] 반복
        int[] supoPattern3=  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각 수포자들의 점수를 계산하는 배열
        int[] scores = new int[3];
        
        // 점수를 계산한다.
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == supoPattern1[i % supoPattern1.length]) scores[0]++;
            if (answers[i] == supoPattern2[i % supoPattern2.length]) scores[1]++;
            if (answers[i] == supoPattern3[i % supoPattern3.length]) scores[2]++;
        }
        
        // 최고 점수를 받은 수포자를 찾는다.
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최고 점수를 받은 수포자를 찾아 List에 넣는다.
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            if (scores[i] == maxScore){
                result.add(i + 1);
            }
        }
        // 크기를 받는다.
        int answerSize = result.size();
        
        // List를 배열로 변환한다.
        int[] answer = new int[answerSize];
        for (int i = 0; i < answerSize; i++){
            answer[i] = result.get(i);
        }
        
        // 결과값 반환
        return answer; 
    }
}