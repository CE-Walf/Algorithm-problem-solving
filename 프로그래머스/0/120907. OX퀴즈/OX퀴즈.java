import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answerList = new ArrayList<>();
        
        for (String question : quiz) {
            String[] split = question.split(" ");
            
            int operand1 = Integer.parseInt(split[0]);
            String operator = split[1];
            int operand2 = Integer.parseInt(split[2]);
            int result = Integer.parseInt(split[4]);
            
            if (operator.equals("+")) {
                if (operand1 + operand2 == result) {
                    answerList.add("O");
                } else {
                    answerList.add("X");
                }
            } else if(operator.equals("-")) {
                if(operand1 - operand2 == result) {
                    answerList.add("O");
                } else {
                    answerList.add("X");
                }
            }
        }
        
        String[] answer = new String[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}