// 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 출력하는 것
// 만약 주어진 단어들로 탈락자가 생기지 않는다면, [0, 0]을 return 해주세요
// 정답은 [ 번호, 차례 ] 형태로 return 해주세요.
// 값 존재 유무 : List contains

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer;
        List<String> appeared = new ArrayList<>(); // 등장한 단어를 담을 배열
        
        // 번호와 차례 (기본값 : 0)
        int number = 0;
        int order = 0;
        
        // 이전 단어의 마지막 문자
        char lastAlphabet = ' ';
        
        for (int i = 1; i <= words.length; i++) {
            // n명의 사람 (틀린 사람을 n으로 나눈 몫 = 차례, 나머지 = 번호)
            String word = words[i-1]; 
            if (appeared.contains(word)) {
                number = (i - 1) % n + 1;
                order = (i - 1) / n + 1;
                break;
            }
            
            appeared.add(word);
            
            if (i > 1) {
                if (lastAlphabet != word.charAt(0)){
                    number = (i - 1) % n + 1;
                    order = (i - 1) / n + 1;
                    break;
                }
            }

            lastAlphabet = word.charAt(word.length() - 1);
            
        }
        
        answer = new int[]{number, order};
        
        return answer;
    }
}