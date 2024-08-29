import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        // 정답을 담을 변수
        String answer = "";
        
        // 정수 배열을 문자열 배열로 바꾸어준다.
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬 순서를 정하여 정렬해준다.
        // (o1 + o2)가 (o2 + o1)보다 크면 o1이 o2보다 앞에 오게 된다.
        // 반대로 (o1 + o2)가 (o2 + o1)보다 작으면 o2가 o1보다 앞에 오게 된다.
        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1+o2));
        
        // 만약 맨 앞이 0이라면, 0을 반환해준다.
        if (strNumbers[0].equals("0")){
            answer = "0";
        } else { // 아니라면, 해당 문자열 배열을 이어 붙어 문자열로 만들어준다.
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strNumbers.length; i++){
                sb.append(strNumbers[i]);
            }
            answer = sb.toString();   
        }
        
        return answer;
    }
}