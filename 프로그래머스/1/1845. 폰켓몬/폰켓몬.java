// HashSet을 사용하여 풀어보자.
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // HashSet 선언
        Set<Integer> typeOfPonkemon = new HashSet<>();
        
        // 배열의 내용을 Set에 넣어 중복을 제거시켜준다.
        for (int num : nums){
            typeOfPonkemon.add(num);
        }
        
        // 가져갈 수 있는 최대 폰켓몬의 수
        int maxPonkemon = nums.length / 2;
        
        // 가져갈 수 있는 최대 폰켓몬의 수와,
        // 주어진 폰켓몬 종류의 수 중 작은 값이 답이다.
        return Math.min(maxPonkemon, typeOfPonkemon.size());
    }
}