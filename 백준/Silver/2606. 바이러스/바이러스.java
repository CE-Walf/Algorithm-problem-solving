import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N; // 컴퓨터의 수
    static int count = 0; // 바이러스에 감염된 컴퓨터의 수를 저장할 변수
    static int[][] connections; // 네트워크 연결 상태를 저장할 2차원 배열
    static boolean[] visited; // 방문 여부를 체크할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1 ≤ N ≤ 100
        N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        connections = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        // K개의 연결 정보를 입력받아 connections 배열에 저장
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 양방향 연결 설정
            connections[start][end] = connections[end][start] = 1;
        }

        // 1번 컴퓨터에서 시작하여 DFS 탐색 수행
        dfs(1);

        // 감염된 컴퓨터 수 출력 (중요 : 1번 컴퓨터를 제외)
        System.out.println(count);
    }

    // DFS(깊이 우선 탐색) 메서드
    static void dfs(int node) {
        // 현재 노드를 방문 처리
        visited[node] = true;

        // 모든 컴퓨터를 탐색
        for (int i = 1; i <= N; i++) {
            // 아직 방문하지 않았고, 현재 노드와 연결된 컴퓨터인 경우
            if (!visited[i] && connections[node][i] == 1) {
                // DFS를 통해 해당 노드를 탐색하고, 카운트 변수를 1 증가시킨다.
                dfs(i);
                count++;
            }
        }
    }
}