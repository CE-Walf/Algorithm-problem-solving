import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 우선 정수 배열을 문자배열로 바꾸자.
        String[] strNumbers = new String[numbers.length];
        
        int index = 0;
        for (int number : numbers) {
            strNumbers[index++] = String.valueOf(number);
        }
        
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        if (strNumbers[0].equals("0")) {
            return "0";
        } 
        
        for (String strNumber : strNumbers) {
            answer += strNumber;
        }
        
        return answer;
    }
}