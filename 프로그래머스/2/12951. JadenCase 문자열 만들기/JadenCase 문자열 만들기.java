// 다시 풀어봐야할 것 같다.
// Character.toLowerCase(), Character.toUpperCase()를 몰랐다.
class Solution {
    public String solution(String s) {
        String[] sArr = s.toLowerCase().split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < sArr[i].length(); j++) {
                char temp = sArr[i].charAt(j);
                if (j == 0) {
                    sb.append(Character.toUpperCase(temp));
                } else {
                    sb.append(temp);
                }
            }
            if (i != sArr.length - 1){
                sb.append(" ");       
            }

        }

        return sb.toString();
    }
}