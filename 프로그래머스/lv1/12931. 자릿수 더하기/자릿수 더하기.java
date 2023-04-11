import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nString = Integer.toString(n);
        for(int i = 0; i < nString.length(); i++)
            answer += (int)(nString.charAt(i) - '0');

        return answer;
    }
}