class Solution {
    public int[] solution(int[] arr) {
        // arr 배열의 길이
        int length = arr.length;
        
        // arr의 길이만큼 answer 배열 선언
        int[] answer = new int[length];
        
        // 50보다 크거나 같은 짝수라면 2로 나누기
        // 50보다 작은 홀수라면 2를 곱하기
        // 전부 아니라면 그대로
         for (int i = 0; i < length; i++) {
            int num = arr[i];
            if (num >= 50 && num % 2 == 0) {
                answer[i] = num / 2;
            } else if (num < 50 && num % 2 == 1) {
                answer[i] = num * 2;
            } else {
                answer[i] = num;
            }
        }
        
        return answer;
    }
}