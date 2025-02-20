// subString 활용을 생각하자.

class Solution {
    public int solution(String A, String B) {
        
        // 우선 A와 B가 같은지 확인.
        if (A.equals(B)) return 0;
        
        int len = A.length();
        
        for (int i = 1; i < len; i++) {
            A = A.charAt(len - 1) + A.substring(0, len - 1);
            if(A.equals(B)) return i;
        }
        
        return -1;
        
    }
}