// 두 번째 풀이
// HashMap을 사용해보자.
import java.util.*;

class Solution {
    public String solution(String[] participants, String[] completions) {
        // 완주하지 못한 선수를 담을 변수
        String answer = "";
        
        // HashMap 선언
        // Key : 각 참가자들의 이름
        // Value : 그 이름의 출현 횟수 (동명이인 때문에)
        Map<String, Integer> map = new HashMap<>();
        
        // 모든 참가자 이름을 HashMap에 저장한다.
        // 만약 이미 존재하는 이름이라면 출현 횟수를 1 증가시킨다.
        for (String participant : participants){
            map.put(participant, map.getOrDefault(participant, 0) + 1);
        }
        
        // 모든 완주자 이름에 대해 HashMap에서 출현 횟수를 1 감소시킨다.
        for (String completion: completions) {
            map.put(completion, map.get(completion) - 1);
        }
        
        // 참가자 중 출현 횟수가 0이 된 이름을 제거해준다.
        for (String participant : participants){
            map.remove(participant, 0);
        }
        
        // HashMap에 남아 있는 유일한 이름이 완주하지 못한 사람이다.
        for (String name : map.keySet()){
            answer = name;
        }
        
        return answer;
    }
}