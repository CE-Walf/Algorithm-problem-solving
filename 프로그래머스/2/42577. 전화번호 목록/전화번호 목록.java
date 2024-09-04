import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호들을 저장할 HashMap 선언
        Map<String, Integer> map = new HashMap<>();
        
        // 각 전화번호를 HashMap에 저장 
        // Value는 의미가 없으므로 0으로 설정해준다.
        for (String phone : phone_book) {
            map.put(phone, 0);
        }
        
        // 다시 전화번호 배열을 순회하며 각 번호의 접두사가 HashMap에 존재하는지 확인한다.
        for (String phone : phone_book){
            // 접두사를 만들기 위해 0부터 현재 전화번호의 길이까지 부분 문자열을 추출
            for (int i = 0; i < phone.length(); i++){
                // 현재 번호의 접두사가 존재하면 false 반환
                if (map.containsKey(phone.substring(0, i))){
                    return false;
                }
            }
        }
        // 모든 번호에 대해 접두사인 경우가 없으면 true 반환
        return true;
    }
}