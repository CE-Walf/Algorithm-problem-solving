class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백으로 문자열을 잘라 배열에 넣기
        String[] strArray = s.split(" ");
        
        // 대소비교를 위해 정수형으로 만들기
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        // 가장 큰 값과 작은 값 찾기
        int max = intArray[0];
        int min = intArray[0];
        
        for (int i = 1; i < intArray.length; i++){
            if (max < intArray[i]){
                max = intArray[i];
            }
            
            if (min > intArray[i]){
                min = intArray[i];
            }
        }
        
        answer = min + " " + max;     
        
        return answer;
    }
}