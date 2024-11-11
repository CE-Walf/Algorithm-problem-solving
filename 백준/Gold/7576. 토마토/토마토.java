import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N; // 상자의 세로 칸의 수
    static int M ; // 상자의 가로 칸의 수
    static int[] di = {0, 0, 1, -1}; // 사방탐색 상,하
    static int[] dj = {1, -1, 0, 0}; // 사방탐색 좌, 우
    static int[][] field; // 토마토 농장의 상태를 저장하는 배열
    static Queue<int[]> q = new LinkedList<>(); // BFS를 위한 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2 ≤ M,N ≤ 1,000
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        field = new int[N][M];

        // 토마토 상태를 입력받는다.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                if (field[i][j] == 1) {
                    // 익어있는 토마토의 좌표를 큐에 추가
                    q.add(new int[]{i, j});
                }
            }
        }

        // BFS 수행
        bfs();

        // 모든 토마토가 익지 못한 경우 확인
        if (hasUnripeTomatoes()){
            // 모든 토마토를 익히지 못하면 -1 출력
            System.out.println(-1);
        } else {
            // 모든 토마토가 익은 경우, 최댓값 탐색
            System.out.println(getMaxRipeningDays());
        }

    }

    // BFS를 통해 토마토가 익는 과정을 탐색
    static void bfs() {
        while(!q.isEmpty()) {
            int[] current = q.poll(); // 현재 위치의 좌표를 큐에서 꺼냄
            int currentI = current[0];
            int currentJ = current[1];

            // 사방탐색
            for (int i = 0; i < 4; i++) {
                int nextI = currentI + di[i];
                int nextJ = currentJ + dj[i];

                // 유효한 범위 확인
                if (nextI < 0 || nextI >= N || nextJ < 0 || nextJ >= M ) {
                    continue;
                }

                // 익지 않은 토마토(0)를 익힌다.
                if (field[nextI][nextJ] == 0) {
                    q.add(new int[]{nextI, nextJ});
                    field[nextI][nextJ] = field[currentI][currentJ] + 1;
                }
            }
        }
    }

    static boolean hasUnripeTomatoes() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익지않은 토마토가 있으면 true 반환
                if (field[i][j] == 0) {
                    return true;
                }
            }
        }
        // 모든 토마토가 다 익은 경우 false 반환
        return false;
    }

    static int getMaxRipeningDays() {
        int max = 0;

        // 토마토가 모두 익는 데 걸린 일수를 찾는다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (field[i][j] > max) {
                    max = field[i][j];
                }
            }
        }

        // 가장 처음 주어진 토마토가 1이였으므로, 일 수를 계산하기 위해서는 1을 빼준다.
        return max - 1;
    }
}