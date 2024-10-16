import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph; // 그래프 연결 상태를 저장할 2차원 배열
    static boolean[] visited; // 방문 여부를 확인할 방문자 배열
    static int N, M, V; // N : 정점의 개수, M : 간선의 개수, V : 탐색을 시작할 정점의 번호
    static int count = 0; // DFS에서 탐색한 정점의 수를 세는 변수
    static Queue<Integer> q = new LinkedList<>(); // BFS에서 사용할 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            // 간선은 양방향이므로 모두 1로 설정해준다.
            graph[N1][N2] = 1;
            graph[N2][N1] = 1;
        }

        dfs(V);
        System.out.println();
        visited = new boolean[N + 1]; // 방문자 배열 초기화

        bfs(V);
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        count++;

        if (count == N) {
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        q.offer(v);
        visited[v] = true;

        while(!q.isEmpty()){
            v = q.poll();
            System.out.print(v + " ");

            for (int i = 1; i <= N; i++) {
                if (graph[v][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }


    }
}