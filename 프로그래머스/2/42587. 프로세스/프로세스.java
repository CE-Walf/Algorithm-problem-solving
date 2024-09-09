import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int n = priorities.length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        // Queue에 값 넣기
        for (int i = 0; i < n; i++){
            // 배열의 0번 인덱스는 위치
            // 배열의 1번 인덱스는 우선 순위이다.
            int[] arr = new int[]{i, priorities[i]};
            queue.offer(arr);
        }
        
        while (!queue.isEmpty()) {
            // 큐의 맨 앞의 값의 우선순위를 가져온다.
            int frontPriority = queue.peek()[1];
            boolean haveBigPriority = false;
                
            for (int[] process : queue){
                int priority = process[1];
                
                if (priority > frontPriority){
                    haveBigPriority = true;
                    break;
                }
            }
            
            if (haveBigPriority){
                queue.offer(queue.poll());
            } else {
                answer++;
                int processIndex = queue.poll()[0];
                if (processIndex == location){
                    break;
                }
            }
        }

        return answer;
    }
}