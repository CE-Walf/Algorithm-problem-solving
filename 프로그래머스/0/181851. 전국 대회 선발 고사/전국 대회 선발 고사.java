class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 참석이 가능한 상위 순위 3명 
        int[] selectedStudents  = new int[3];
        
        // 1등부터 탐색 (상위 3명 다 뽑을 때까지)
        int currentRank = 1;
        
        // selectedStudents 배열에 값을 저장할 인덱스
        int index  = 0;
        
        while (index != 3){
            for (int i = 0; i < attendance.length; i++) {
                // 현재 학생이 전국 대회에 참석 가능하고, 등수가 일치할 때 
                if (attendance[i] && currentRank == rank[i]){
                    selectedStudents[index++] = i;
                    break;
                }
            }
            currentRank++;
        }
        
        // 최종 값 계산
        int answer = 10000 * selectedStudents[0] + 100 * selectedStudents[1] + 1 * selectedStudents[2];
        
        return answer;
    }
}