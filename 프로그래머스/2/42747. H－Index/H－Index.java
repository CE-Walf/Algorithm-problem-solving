import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;
        
        // n : 발표한 논문의 수 
        int n = citations.length;
        
        // 정렬 - 논문의 인용 횟수
        Arrays.sort(citations);
        
        // 반복문을 순회하면서 h-index를 찾자.
        while (true) {
            int countMore = 0;
            int countLess = 0;
            
            for (int i = 0; i < n; i++) {
                int temp = citations[i];
                if (temp >= hIndex) countMore++;
                if (temp < hIndex) countLess++;
            }
            
            if(hIndex <= countMore && hIndex >= countLess){
                hIndex++;
            } else {
                return --hIndex;
            }      
        }

    }
}