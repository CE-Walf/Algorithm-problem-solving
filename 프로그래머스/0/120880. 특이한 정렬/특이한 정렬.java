import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        
        // Comparator은 int형에서는 되지 않고, Integer형에서만 가능하다.
        Integer[] temp = new Integer[length];
        
        for (int i = 0; i < length; i++) {
            temp[i] = numlist[i];
        }
        
        Arrays.sort(temp, (a, b) -> {
            int diff1 = Math.abs(a - n);
            int diff2 = Math.abs(b - n);
            
            if (diff1 == diff2) {
                return b - a;
            }
            
            return diff1 - diff2;
        });
            
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] =  temp[i];
        }
        
        return answer;
    }
}