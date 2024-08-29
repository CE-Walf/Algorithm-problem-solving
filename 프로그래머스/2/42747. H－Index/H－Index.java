import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 과학자가 발표한 논문 n편
        int n = citations.length;
        
        // 우선 정렬 해주자.
        Arrays.sort(citations);
        
        // 가장 많이 인용된 횟수, 가장 적게 인용된 횟수
        int max = citations[n-1];
        int min = citations[0];

        // 반복문으로 이를 찾아보자.
        for (int h = max; h >= 0; h--){
            // h번 이상 인용된 논문, h번 이하 인용된 논문 찾기
            int countMore = 0;
            int countBelow = 0;
            for (int i = 0; i < n; i++){
                if (h <= citations[i]) {
                    countMore++;
                } else { 
                    countBelow++;
                }
            }
            // 만약 h번 이상 인용된 논문이 h편 이상이고
            // 나머지 논문이 h번 이하 인용되었다면 
            // 답을 해당 시점의 h로 설정하고 반복문 탈출
            if (countMore >= h && countBelow < h){
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}