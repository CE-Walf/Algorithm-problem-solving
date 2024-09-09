import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 몇 번째로 실행되는지 담는 변수이다.
        int answer = 0;
        
        // Queue를 선언해준다.
        Queue<Process> q = new LinkedList<>();
        
        // Queue에 처음 위치, 우선순위 정보를 객체로 담아 넣어준다.
        for (int i = 0; i < priorities.length; i++){
            q.offer(new Process(i, priorities[i]));
        }
        
        // Queue 순회
        while(!q.isEmpty()) {
            // 첫 번째 프로세스를 가져온다.
            Process frontProcess = q.poll();
            boolean priorityFlag = false;
            
            // 큐를 순회하며 첫 번째 프로세스의 우선순위보다 높은 우선순위가 있는지 찾는다.
            // 우선순위가 더 높은게 있다면, 플래그를 true로 바꾸고 반복문을 탈출해준다.
            for (Process p : q){
                if(p.priority > frontProcess.priority){
                    priorityFlag = true;
                    break;
                }
            }
            
            // 우선순위가 더 높은게 큐에 존재한다면,
            // 맨 앞의 프로세스를 다시 큐에 넣는다.
            // 맨 앞의 프로세스가 우선순위가 가장 크다면, 
            // 우선 몇 번째로 실행되는지 담는 변수를 1 추가해주고,
            // 그 프로세스의 처음 위치가 location과 같은지 확인하고 같다면 반복문을 탈출해준다.
            if (priorityFlag) {
                q.offer(frontProcess);
            } else {
                answer++;
                if(frontProcess.index == location){
                    break;
                }
            }
        }
        
        return answer;
    }
    
    // Process 객체를 만들어 준다.
    // 이 Process 객체는, 처음 위치에 대한 정보, 우선순위 정보를 담고 있다.
    class Process {
        int index;
        int priority;
        
        Process(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
    }
}