// 다시 풀어보기
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> countList  = new ArrayList(countMap.values());
        countList.sort(Collections.reverseOrder());
    
        for (int count : countList) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }
        
        return answer;
    }
}