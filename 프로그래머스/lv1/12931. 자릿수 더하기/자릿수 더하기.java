import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String N = Integer.toString(n);
        
        for(int i = 0; i < N.length(); i++){
            answer += N.charAt(i) - '0';        
        }
        
        return answer;
    }
}