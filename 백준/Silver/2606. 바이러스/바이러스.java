import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] conenctions;
    static boolean[] visited;
    static int computers, networks;
    static int count = 0;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        computers = Integer.parseInt(br.readLine());
        networks = Integer.parseInt(br.readLine());

        conenctions = new int[computers+1][computers+1];
        visited = new boolean[computers+1];

        for (int i = 0; i < networks; i++) {
            st = new StringTokenizer(br.readLine());

            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            conenctions[c1][c2] = 1;
            conenctions[c2][c1] = 1;
        }

        // 1번 컴퓨터가 웜 바이러스에 걸렸을 때,
        // 1번 컴퓨터를 통해 웜 바이러스에 걸리게되는 컴퓨터의 수룰 구하기 위해 DFS
        // BFS로 진행하자.
        bfs(1);
        count--; // 1번 컴퓨터 본인을 지난건 빼준다.
        System.out.println(count);
    }

    public static void bfs(int v){
        q.offer(v);
        visited[v] = true;

        while(!q.isEmpty()){
            v = q.poll();
            count++;
            for (int i = 1; i <= computers; i++){
                if (conenctions[v][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}