import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        // 두 변 중에서 큰 변의 최댓값과 작은 변의 최댓값을 저장할 변수
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int[] size : sizes) {
            // 큰 값은 width로, 작은 값은 height로 설정
            int width = size[0] > size[1] ? size[0] : size[1];
            int height = size[0] > size[1] ? size[1] : size[0];
            
            // 최댓값 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        // 둘을 곱한 것이 답
        return maxWidth * maxHeight;
    }
}