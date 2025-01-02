class Solution {
    public int[] solution(String s) {
        int count = 0; // 이진 변환의 횟수
        int removed = 0; // 제거된 모든 0의 개수
        
        // "1"이 될 때까지 이진 변환
        while (!s.equals("1")) {
            int tempLength = 0; // 0을 제거하고 남은 문자열의 길이
            
            // 문자열 s를 순회한다.
            for (int i = 0; i < s.length(); i++) {
                
                if (s.charAt(i) == '1'){ // 1일 경우, tempLength + 1
                    tempLength++;
                } else { // 0일 경우, removed + 1 해준다.
                    removed++;
                }
            }
            // 1로 구성된 문자열의 길이를 2진수 문자열로 변환해준다.
            s = Integer.toBinaryString(tempLength);
            // 이진 변환 횟수 1 추가
            count++;
        }
        
        // 정답 제출
        int[] answer = {count, removed};
        return answer;
    }
}