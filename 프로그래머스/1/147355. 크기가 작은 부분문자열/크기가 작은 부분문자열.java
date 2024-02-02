class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long b = Long.parseLong(p);
        
        for (int i = 0; i < t.length()-p.length()+1; i++){
            String tSubstring = t.substring(i, i+p.length());
            long a = Long.parseLong(tSubstring);
            
            if (a <= b)
                answer++;
        }
        
        return answer;
    }
}