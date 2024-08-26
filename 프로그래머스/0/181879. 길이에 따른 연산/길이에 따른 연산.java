class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // 우선 num_list의 길이를 구하자. (배열의 길이는 괄호를 붙이지 않는다.)
        int length = num_list.length;
        
        // 리스트의 길이가 11 이상이면, 리스트에 있는 모든 원소의 합
        if (length >= 11) {
            for (int i = 0; i < length; i++){
                answer += num_list[i];
            }
        } else { // 리스트의 길이가 10 이하이면 모든 원소의 곱
            answer = 1;
            for (int i = 0; i < length; i++){
                answer *= num_list[i];
            }
        }

        return answer;
    }
}