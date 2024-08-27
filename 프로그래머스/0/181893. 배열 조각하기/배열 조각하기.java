import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0; 
        int end = arr.length;
        
        for (int i = 0; i < query.length; i++){
            // 짝수 인덱스
            // arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버림
            if (i % 2 == 0) {
                end = start + query[i] + 1;
            }
            
            // 홀수 인덱스
            // arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버림
            if (i % 2 == 1) {
                start = start + query[i];
            }
        }
        
        int[] answer = new int[end-start];
        
        int index = 0;
        for (int i = start; i < end; i++){
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}