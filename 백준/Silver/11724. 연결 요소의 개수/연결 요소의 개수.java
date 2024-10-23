import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다시 풀기
public class Main {

    static int N, M;
    static boolean[][] nodeConnected;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1 ≤ N ≤ 1,000
        // 0 ≤ M ≤ N×(N-1)/2
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 1 ≤ u, v ≤ N, u ≠ v
        nodeConnected = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start =  Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            nodeConnected[start][end] = true;
            nodeConnected[end][start] = true;
        }

        int count = 0;
        for (int i = 1; i <= N; i++ ){
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    public static void dfs(int node){
        visited[node] = true;

        for (int i = 1; i <= N; i++){
            if(nodeConnected[node][i] && !visited[i]){
                dfs(i);
            }
        }

    }
}