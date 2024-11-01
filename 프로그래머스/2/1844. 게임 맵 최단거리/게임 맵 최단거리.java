import java.util.*;

class Solution {
    // 동서남북 이동을 담은 변수
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    // 가로와 세로 크기
    // n = 세로, m = 가로 길이
    int n, m;
        
    // 횟수를 카운팅하는 변수
    int count = 0;
        
    public int solution(int[][] maps) {
        
        n = maps.length;
        m = maps[0].length;
        
       // Map 방문자 배열
        boolean[][] visited = new boolean[n][m];
        
        bfs(visited, maps); 
        
        int answer = maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
        
        return answer;
    }
    
    private void bfs(boolean[][] visited, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int currentX = current[0];
            int currentY = current[1];
            
            for (int i = 0; i < 4; i++) {
                            
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)continue;
            
                if(!visited[nextX][nextY] && maps[nextX][nextY] == 1) {
                    q.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    maps[nextX][nextY] = maps[currentX][currentY] + 1;
                }
            }
            
        }
    }
}