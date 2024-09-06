// 큐를 사용하여 풀어보자.
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 전체 기능의 갯수
        int n = progresses.length;
        
        // 기능 완성까지 남은 일을 담을 Queue 생성
        Queue<Integer> completionDates = new LinkedList<>();
        
        // 완성일을 반복문을 통해 담아준다.
        for (int i = 0; i < n; i++){
            int remainingProgress = 100 - progresses[i]; // 남은 진행도
            int daysToComplete = (int)Math.ceil((double)remainingProgress / speeds[i]); // 기능 완성까지 남은 일
            completionDates.add(daysToComplete);
        }
        // 배열의 크기를 알지 못하니, ArrayList 선언
        List<Integer> result = new ArrayList<>();
        
        // 각 배포날에 배포될 작업의 수 계산
        while (!completionDates.isEmpty()) {
            // 첫 번째 작업의 완료 날짜를 가져온다.
            int currentDate = completionDates.poll();
            // 현재 날짜에 배포될 작업의 수
            int count = 1;
            
            // 큐에서 완료 날짜가 currentDate보다 작거나 같은 작업의 수를 계산
            // 작거나 같다면, 큐에서 꺼내고, 배포될 작업의 수는 1 추가
            while (!completionDates.isEmpty() && completionDates.peek() <= currentDate) {
                completionDates.poll(); 
                count++; 
            }
            
            // 현재 날짜에 재포될 작업 수를 결과 리스트에 추가
            result.add(count);
        }
        
        // Stream을 통해 List를 배열로 바꾸어 반환한다.
        // result.stream() : List<Integer>를 스트림으로 변환
        // mapToInt(i -> i)를 사용하여 각 Integer 객체를 기본형 int로 변환
        // toArray() : IntStream을 int 배열로 변환 
        return result.stream().mapToInt(i -> i).toArray();
    }
}