import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // N: 미로의 행 수, M: 미로의 열 수
    static int N, M;
    // 동, 서, 남, 북 이동하기 위한 direction 배열
    static int[] dI = {0, 0, 1, -1};
    static int[] dJ = {1, -1, 0, 0};
    // N × M 크기의 배열로 표현되는 미로
    static int[][] maze;
    // 방문 여부를 확인하는 배열
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2 ≤ N, M ≤ 100
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

       // 미로 데이터 입력
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                maze[i][j] = Integer.parseInt(String.valueOf(line.charAt(j-1)));
            }
        }

        // 너비 우선 탐색(BFS)을 사용하여 최소 이동 칸 수를 구하기.
        bfs();

        System.out.println(maze[N][M]);
    }

    static void bfs() {
        // 큐를 사용하여 BFS 구현 (시작점은 (1, 1))
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,1});
        visited[1][1] = true;

        while(!q.isEmpty()) {
            // 현재 위치를 큐에서 꺼냄
            int[] current = q.poll();
            int currentI = current[0];
            int currentJ = current[1];

            // 동, 서, 남, 북 네 방향으로 탐색
            for (int i = 0; i < 4; i++) {
                int nextI = currentI + dI[i];
                int nextJ = currentJ + dJ[i];

                // 다음 위치가 미로의 범위를 벗어나거나, 이미 방문했거나, 이동할 수 없는 칸(0)인 경우 건너뛴다.
                if (nextI <= 0 || nextI > N || nextJ <= 0 || nextJ > M || visited[nextI][nextJ] || maze[nextI][nextJ] == 0){
                    continue;
                }

                // 다음 위치를 큐에 추가하고, 현재 위치의 값에 1을 더해 최소 이동 칸 수 갱신한다.
                q.add(new int[]{nextI, nextJ});
                maze[nextI][nextJ] = maze[currentI][currentJ] + 1;
                visited[nextI][nextJ] = true;
            }
        }

    }
}