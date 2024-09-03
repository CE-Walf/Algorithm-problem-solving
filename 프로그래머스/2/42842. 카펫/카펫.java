/*
예시 풀이)
방정식으로 접근
brown = 24, yellow = 24일 때,

24 = x * 2 + 2(y - 2) = 2x + 2y - 4 (테두리)
24 = (x - 2) * (y - 2) =  xy - 2x - 2y + 4 (안쪽)

- 변환
x + y = 14
xy = 2x + 2y + 20

즉 x+y = 14,
xy = 48 

y = 48/x로 치환하자.

x + 48/x = 14
x^2 + 48 = 14x
x^2 - 14x + 48 = 0 // 인수분해
(x - 8)(x - 6) = 0

카펫의 가로길이는 세로길이보다 커야하므로, 
x(가로)는 8이고 y(세로)는 6이다.
*/ 
class Solution {
    public int[] solution(int brown, int yellow) {
        // 가로 세로를 담을 정답 배열
        int[] answer = new int[2];

        // x : 카펫의 가로 길이
        // y : 카펫의 세로 길이
        // brown = x * 2 + 2(y - 2) = 2x + 2y - 4
        // yellow = (x - 2) * (y - 2) = xy - 2x - 2y + 4
        // 이러한 방정식들을 도출해낼 수 있다. 

        // 전체 격자의 수
        int totalGrid = brown + yellow;
        
        // yellow가 1일때 brown은 8이다. (x = 3, y = 3)
        // 가로길이가 3일때부터 비교해보자.
        for (int x = 3; x <= totalGrid / 3; x++) {
            if (totalGrid % x == 0) {
                int y = totalGrid / x;

                int checkBrown = 2*x + 2*y - 4;
                int checkYellow = x*y - 2*x - 2*y + 4;

                if (brown == checkBrown && yellow == checkYellow){
                    // 카펫의 가로 길이 >= 카펫의 세로 길이
                    if (x >= y){
                        answer[0] = x;
                        answer[1] = y;
                    } else {
                        answer[0] = y;
                        answer[1] = x;
                    }
                    break;
                }
            }  
        }
         
        return answer;
    }
}