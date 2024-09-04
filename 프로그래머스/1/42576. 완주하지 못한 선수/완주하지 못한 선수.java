import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참여자와 완주자 배열을 알파벳 순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 두 배열을 비교하여 다른 이름이 나올 때까지 탐색
        // 완주자 배열의 길이만큼 반복하며, 각 인덱스의 요소 비교
        // 참여자와 완주자의 이름이 다르면 그 참여자가 완주하지 못한 사람
        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        // 반복문을 모두 돌았는데도 차이가 없다면,
        // 참여자 배열의 마지막 요소가 완주하지 못한 사람이다.
        return participant[participant.length -1];
    }
}