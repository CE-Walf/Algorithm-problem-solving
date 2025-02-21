// 다시 풀기
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        // split의 동작방식은 regex로, 일반문자로 해석하게 하기 위해 \\를 앞에 붙여준다.     
        String[] parts = polynomial.split(" \\+ "); 
        int xCoeff = 0;
        int constCoeff = 0;
        
        for (String part : parts) {
            if (part.contains("x")) {
                String coef = part.replace("x", "");
                xCoeff += coef.isEmpty() ? 1 : Integer.parseInt(coef);
            } else {
                constCoeff += Integer.parseInt(part);
            }
        }
        
        if (xCoeff != 0 && constCoeff != 0) {
            answer = (xCoeff == 1 ? "x" : xCoeff + "x") + " + " + constCoeff;
        } else if (constCoeff == 0) {
            answer = (xCoeff == 1 ? "x" : xCoeff + "x"); 
        } else if (xCoeff == 0) {
            answer = "" + constCoeff;
        }
        
        return answer;
    }
}