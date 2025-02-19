import java.util.*;

class Solution {
    public String[] solution(String[] records) {
        Map<String, String> userInfo = new HashMap<>();
        int count = 0;
        
        for (String record : records) {
            String[] command = record.split(" ");
            
            String activity = command[0];
            String id = command[1];
            
            if (activity.equals("Leave")) {
                count++;
                continue;
            }
            
            String nickname = command[2];
            
            if (activity.equals("Enter")) {
                userInfo.put(id, nickname);
                count++;
            } else if(activity.equals("Change")) {
                userInfo.replace(id, nickname);
            }

        }
        
        
        String[] answer = new String[count];
        int index = 0;
        
        for (String record : records) {
            String[] command = record.split(" ");
            
            String activity = command[0];
            String id = command[1];
            
            if (activity.equals("Enter")) {
                answer[index++] = userInfo.get(id) + "님이 들어왔습니다.";
            } else if (activity.equals("Leave")) {
                answer[index++] = userInfo.get(id) + "님이 나갔습니다.";
            }

        }
        
        return answer;
    }
}