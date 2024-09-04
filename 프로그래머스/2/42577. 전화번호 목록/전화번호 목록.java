import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호 배열을 사전순으로 정렬하여
        // 접두사가 되는 번호들이 인접하게 만든다.
        // 같은 시작 문자열을 가진 경우, 글자 수가 적은 문자열이 더 앞에 온다.
        Arrays.sort(phone_book);
        
        // 인접한 두 전화번호를 비교하여, 접두사 관계가 있는지 확인한다.
        for (int i = 0; i < phone_book.length - 1 ; i++) {
            // phone_book[i]가 phone_book[i + 1]의 접두사면 false 반환
            if (phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        // 모든 번호를 확인했는데, 접두사 관계가 없다면 true 반환
        return true;
    }
}