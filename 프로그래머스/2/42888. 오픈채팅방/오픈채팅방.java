import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>(); // 유저들 정보를 담는 맵 (유저 아이디, 닉네임)
        List<String[]> logs = new ArrayList<>(); // 결과값을 담을 변수
        
        for (String rec : record) {
            String[] split = rec.split(" ");
            
            String activity = split[0];
            String userId = split[1];
            
            if (activity.equals("Enter")) {
                String nickname = split[2];
                userMap.put(userId, nickname);
                logs.add(new String[]{userId, "님이 들어왔습니다."});
            } else if (activity.equals("Leave")) {
                logs.add(new String[]{userId, "님이 나갔습니다." });
            } else if (activity.equals("Change")) {
                String nickname = split[2];
                userMap.replace(userId, nickname);
            }
        }
        
        String[] answer = new String[logs.size()]; // 정답을 담을 변수
        
        for (int i = 0; i < logs.size(); i++) {
            String userId = logs.get(i)[0];
            String action = logs.get(i)[1];
            answer[i] = userMap.get(userId) + action;
        }
        
        return answer;
    }
}