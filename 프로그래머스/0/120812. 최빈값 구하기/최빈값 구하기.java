class Solution {
    public int solution(int[] array) {
        // 최빈값을 반환하는 함수
        // 최빈값이 여러개면 -1을 return 
        int answer = 0;
        
        // 0 <= array의 원소 < 1000
        // 이 제한사항을 이용하여, 배열을 생성해보자.
        // 정수 배열의 기본값은 0이며, 0번부터 999번까지 0으로 차있다.
        int[] modeArr = new int[1000];
        
        // array를 순회하면서, 최빈값을 세자.
        int max = 0;
        for (int element : array){
            modeArr[element]++;
            max = Math.max(max, modeArr[element]); 
        }
        
        // 최고로 많이 나온 값을 비교한다. 
        int count = 0;
        for (int i = 0; i < 1000; i++){
            if (modeArr[i] == max){
                answer = i;
                count++;
            }
            if(count == 2){
                answer = -1;
                break;
            }
        }
        
        
        return answer;
    }
}