import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        
        int[] completeDays = new int[n];
        
        for (int i = 0; i < n; i++){
            int remainProgress = 100 - progresses[i];
            int speed = speeds[i];
            int completeDay = remainProgress / speed;
            completeDays[i] = remainProgress % speed == 0 ? completeDay : completeDay + 1;
        }
        
        List<Integer> deployFunction = new ArrayList<>();
        
        int count = 1;
        int max = completeDays[0];
        for (int i = 1; i < n; i++){
            if (max < completeDays[i]){
                max = completeDays[i];
                deployFunction.add(count);
                count = 1;
                continue;
            }
            count++;
        }
        deployFunction.add(count);
        
        int deploySize = deployFunction.size();
        int[] answer = new int[deploySize];
        for (int i = 0; i < deploySize; i++){
            answer[i] = deployFunction.get(i);
        }
        
        return answer;
    }
}