import java.util.*;

class Solution {
    public int solution(int[] array) {
        // Map을 이용하여 최빈값을 구해보자.
        // Key : array의 원소
        // Value : 등장 횟수
        Map<Integer, Integer> modeMap = new HashMap<>();

        int maxCount = 0; // 최대 등장 횟수
        int answer = 0; // 정답을 담을 변수
        
        // 향상된 for문으로 array를 순회해준다.
        for(int element : array) {
            // 기본값은 0으로, 등장횟수를 1 추가해준다.
            int count = modeMap.getOrDefault(element, 0) + 1;
            
            if (count > maxCount){
                // 만약 count가 maxCount보다 클 경우,
                // maxCount의 값을 count로 바꾸어주고, answer를 해당 원소 값으로 설정한다.
                maxCount = count;
                answer = element;
            } else if (maxCount == count){ 
                // 만약 count와 maxCount가 같을 경우, 
                // 최빈값이 여러개이므로, answer를 -1로 설정한다.
                answer = -1;
            }
            
            // Map에 값을 넣어준다.
            modeMap.put(element, count); 
        }
        
        return answer;
    }
}