import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        // 배열로 만들어준다.
        int[] dice = {a, b, c, d};
        // 주사위를 정렬해준다.
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) {
            // 네 주사위에서 나온 숫자가 모두 같을 때,
            answer = 1111 * dice[0];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]){
            // 세 주사위에서 나온 숫자가 같을 때,
            int p = dice[1];
            int q = dice[0] == dice[2] ? dice[3] : dice[0];
            answer = (10 * p + q) * (10 * p + q);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            // 주사위가 두 개씩 같은 값일 때,
            int p = dice[0];
            int q = dice[2];
            answer = (p + q) * Math.abs(p - q);
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]){
            // 두 주사위에서 나온 숫자가 p로 같고
            // 나머지 두 주사위에서 나온 숫자가 다를 때,
            if (dice[0] == dice[1]){
                answer = dice[2] * dice[3];
            } else if (dice[1] == dice[2]){
                answer = dice[0] * dice[3];
            } else if (dice[2] == dice[3]){
                answer = dice[0] * dice[1];
            }
        } else {
            // 네 주사위에 적힌 숫자가 모두 다를 때,
            answer = dice[0];
        }
 
        return answer;
    }
}