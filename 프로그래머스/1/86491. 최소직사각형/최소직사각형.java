import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        // 명함의 갯수
        int n = sizes.length;
        
         // 명함의 가로 및 세로 길이 중 큰 값과 작은 값을 각각 저장할 배열을 선언한다.
        int[] bigLength = new int[n]; // 큰 값을 저장할 배열
        int[] smallLength = new int[n]; // 작은 값을 저장할 배열
        
        // 각 명함의 가로와 세로 길이 중 큰 값은 bigLength에,
        // 작은 값은 smallLength에 저장한다.
        for (int i = 0; i < n; i++){
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            // 큰 값은 bigLength
            // 작은 값은 smallLength에 저장
            if (width > height){
                bigLength[i] = width;
                smallLength[i] = height;
            } else {
                bigLength[i] = height;
                smallLength[i] = width;
            }
        }
        
        // 두 배열을 정렬시켜 준다.
        Arrays.sort(bigLength);
        Arrays.sort(smallLength);
        
        // 큰 값과 작은 값 배열의 최대 값을 곱하여 준게 답이다.
        return bigLength[n-1] * smallLength[n-1];
    }
}