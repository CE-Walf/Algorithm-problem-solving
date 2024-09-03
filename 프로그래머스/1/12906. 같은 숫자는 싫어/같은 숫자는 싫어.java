import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> notSameNum = new ArrayList<>();
        
        notSameNum.add(arr[0]);
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i-1]) {
                    notSameNum.add(arr[i]);
                }
            }
        }
        
        int answerSize = notSameNum.size();
        int[] answer = new int[answerSize];
        for (int i = 0; i < answerSize; i++){
            answer[i] = notSameNum.get(i);
        }
    
        return answer;
    }
}