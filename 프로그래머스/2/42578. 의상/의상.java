import java.util.*;

class Solution {
    public int solution(String[][] someClothes) {
        // HashMap을 사용하여 각 의상 종류별로 의상 개수를 저장한다.
        // Key : 의상의 종류
        // Value : 의상 개수
        Map<String, Integer> map = new HashMap<>();
        
        // 배열을 순회하며 의상 종류별 개수를 계산한다.
        for (String[] clothes : someClothes) {
            String typeOfClothes = clothes[1];
            map.put(typeOfClothes, map.getOrDefault(typeOfClothes, 0) + 1);
        }

        // 중요
        // 각 의상 종류마다 입지 않는 경우를 포함해 경우의 수를 계산한다.
        int answer = 1;
        for (String key : map.keySet()){
            // 해당 의상 종류에서 안 입는 경우를 포함해야하므로 +1
            answer *= map.get(key) + 1;
        }
        
        // 의상을 아예 안입는 경우는 없으므로 1을 빼준다.
        return answer - 1;
    }
}