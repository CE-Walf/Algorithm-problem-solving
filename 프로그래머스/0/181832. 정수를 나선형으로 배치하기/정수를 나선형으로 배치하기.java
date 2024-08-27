class Solution {
    public int[][] solution(int n) {
        // n x n 배열에 1부터 n^2까지 시계방향 나선형으로 배치 
        int[][] answer = new int[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int x = 0;
        int y = 0;
        int index = 0;
        for (int i = 1; i <= n*n; i++){
            answer[y][x] = i;
            y = y + dy[index];
            x = x + dx[index];
            if (x == n || y == n || x == -1 || y == -1 || answer[y][x] != 0){
                y = y - dy[index];
                x = x - dx[index];
                index = (index + 1) % 4;
                y = y + dy[index];
                x = x + dx[index];
            }
        }
        
        return answer;
    }
}