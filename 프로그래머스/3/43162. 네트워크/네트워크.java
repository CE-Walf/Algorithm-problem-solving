class Solution {
    public int solution(int n, int[][] computers) {
        // n : 컴퓨터의 개수 (1 <= n <= 200)
        // computers : 컴퓨터의 연결 정보
        
        // 네트워크 수를 세는 변수
        int answer = 0;
        
        // 방문자 배열
        boolean[] visited = new boolean[n];
        
        // 노드마다 DFS를 돌리며 네트워크 수를 센다.
        for (int node = 0; node < n; node++) {
            // 방문하지 않은 노드일때 반복문을 실행한다.
            // 아무 곳도 연결 안된 노드이다.
            if (!visited[node]) {
                answer++;
                dfs(node, visited, computers);
            }
        }
        
        return answer;
    }
    
    private void dfs(int node, boolean[] visited, int[][] computers){
        // 방문했으므로 방문자 배열을 true로 바꿔준다.
        visited[node] = true; 
        
        // 연결된 노드를 탐색하면서,
        // 방문한 적이 없고, 연결할 수 있는 노드가 있다면 다시 dfs를 돌린다.
        for (int targetNode = 0; targetNode < computers.length; targetNode++) {
            if (!visited[targetNode] && computers[node][targetNode] == 1) {
                dfs(targetNode, visited, computers);
            }
        }
    }
}