import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        // 배열을 정렬해준다. (같은 종류의 폰켓몬끼리 인접하게)
        Arrays.sort(nums);
        
        // 가져갈 수 있는 최대 폰캣몬의 수는 전체 폰켓몬 수의 절반
        int n = nums.length / 2;
        
        // 첫 번째 폰캣몬 종류는 무조건 선택되므로 n--
        n--;
        
        // 나머지 배열 요소를 순회하며, 다른 종류의 폰켓몬이 선택될 때마다 n을 줄인다.
        for (int i = 1; i < nums.length; i++){
            // 가져갈 수 있는 폰켓몬의 수가 다 차면 반복문 탈출
            if (n == 0) break;
            
            // 현재 폰켓몬이 이전 폰켓몬과 다른 종류면 n--
            if (nums[i] != nums[i-1]){
                n--;
            }
        }
        
        // 가져갈 수 있는 최대 폰켓몬의 종류는
        // 가져갈 수 있는 최대 폰켓몬의 수에서 남은 n을 뺀 값
        return nums.length / 2 - n; 
    }
}