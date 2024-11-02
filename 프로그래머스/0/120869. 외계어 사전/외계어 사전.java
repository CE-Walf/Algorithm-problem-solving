import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String sortSpell = "";
        // 정렬
        Arrays.sort(spell);
        
        for (int i = 0; i < spell.length; i++) {
            sortSpell += spell[i];
        }
        
        for (int i = 0; i < dic.length; i++) {
            String temp = dic[i];
            
            char[] charArray = temp.toCharArray();
            
            Arrays.sort(charArray);
            
            String sortedStr = new String(charArray);
            
            if (sortedStr.equals(sortSpell)) {
                return 1;
            }
            
        }
        return 2;

        
    }
}