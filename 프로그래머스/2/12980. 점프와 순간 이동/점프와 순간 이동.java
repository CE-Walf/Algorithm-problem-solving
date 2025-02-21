// 다시 풀기
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0; // 배터리 사용량을 담을 변수
        
        // n이 0이 아닐때까지 순회
        while (n != 0) {
            if (n % 2 == 0) { // 짝수일 경우 2로 나누어 준다.
                n /= 2;
            } else { // 홀수일 경우 1을 빼주고, 배터리 사용량을 1 추가해준다.
                n--;
                ans++;
            }
        }

        return ans;
    }
}