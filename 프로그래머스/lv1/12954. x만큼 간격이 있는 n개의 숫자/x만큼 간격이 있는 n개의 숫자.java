import java.math.*;

class Solution {
    public BigInteger[] solution(int x, int n) {
        // long[] answer = new long[n];
        BigInteger[] answer = new BigInteger[n];
        
        for(int i = 0; i < n; i++)
            answer[i] = BigInteger.valueOf(x).multiply(BigInteger.valueOf(i+1));
        
        return answer;
    }
}