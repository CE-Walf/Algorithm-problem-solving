import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 명령의 갯수만큼의 answer 배열 생성
        int[] answer = new int[commands.length];
        int i, j, k;
        
        // i 번째 숫자부터, j 번째 숫자까지 자르고 정렬했을때, k번째에 있는 수 대입
        for (int a = 0; a < commands.length; a++){
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];
            
            // j-i+1 의 크기로 임시 배열을 생성한다.
            int[] temp = new int[j-i+1];
            
            // array에서 i번째 숫자부터 j번째 숫자까지 대입한다.
            int index = 0;
            for (int b = i-1; b < j; b++){
                temp[index++] = array[b];
            }
            
            // 해당 배열을 정렬한다.
            Arrays.sort(temp);
            
            // k번째 수를 answer 배열에 넣는다.
            answer[a] = temp[k-1];
            
            
        }
        
        return answer;
    }
}