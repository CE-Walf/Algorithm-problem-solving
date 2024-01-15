import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i, j, k;
        
        // i 번째 숫자부터, j 번째 숫자까지 자르고 정렬했을때, k번째에 있는 수 대입
        for (int a = 0; a < commands.length ; a++) {
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];

            int[] temp = new int[j-i+1]; // 임시 배열 선언.
            int index = 0;
            
            for (int b = i-1; b < j; b++) {
                 temp[index++] = array[b];
                }
            Arrays.sort(temp);
            answer[a] = temp[k-1];
        }
        
        return answer;
    }
}