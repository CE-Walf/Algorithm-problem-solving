class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n번 반복문을 순회한다.
        for (int i = 0; i < n; i++){
            answer++;
            
            // answer이 3의 배수이거나, 3이 포함되어 있는 경우, 1 추가해준다.
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        
        return answer;
    }
}