import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        // 배열의 크기를 받는다.
        int n = A.length;
        
        // 최소가 되려면, 가장 작은 값과, 가장 큰 값이 곱해져야 한다.
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n-i-1];
        }

        return answer;
    }
}