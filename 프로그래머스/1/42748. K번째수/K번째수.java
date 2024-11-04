import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        int i, j, k;
        
        for (int a = 0; a < n; a++) {
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];
            
            int[] tempArr = new int[j-i+1];
            int index = 0;
            for (int b = i-1; b < j; b++) {
                tempArr[index++] = array[b];
            }
            
            Arrays.sort(tempArr);

            answer[a] = tempArr[k-1];
            
        }
        return answer;
    }
}