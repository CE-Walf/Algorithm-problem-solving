import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        char endCh = words[0].charAt(words[0].length() - 1);
        char startCh;
        
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            startCh = words[i].charAt(0);
            wordSet.add(words[i]);
            
            if (endCh != startCh || wordSet.size() != i + 1) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            endCh = words[i].charAt(words[i].length() - 1);
        }
        
        return answer;
    }
}