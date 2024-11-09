import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // M : 밭의 가로 길이
    // N : 밭의 세로 길이
    static int N, M;
    // 동서남북 사방 탐색을 위한 정수형 배열 변수
    static int[] di = {0, 0, 1, -1};
    static int[] dj = {1, -1, 0, 0};
    static int[][] field; // 배추밭을 표현하기 위한 배열
    static boolean[][] visited; // 방문 여부를 확인하기 위한 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 T

        for (int test_case = 0; test_case < T; test_case++) {
            st = new StringTokenizer(br.readLine());
            // 1 ≤ M ≤ 50,  1 ≤ N ≤ 50, 1 ≤ K ≤ 2500
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            field = new int[N][M];
            visited = new boolean[N][M];

            // 배추 위치 입력 받기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());

                int indexJ = Integer.parseInt(st.nextToken());
                int indexI = Integer.parseInt(st.nextToken());

                field[indexI][indexJ] = 1; // 배추가 심어진 위치를 표시
            }

            int answer = 0;

            // 모든 칸을 탐색하여 BFS로 배추 군집을 탐색한다.
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 배추가 있고 방문하지 않은 경우 새로운 군집으로 간주하고 BFS 수행한다.
                    if(field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        answer++; // 새로운 군집 발견 시 배추흰지렁이 수 증가
                    }
                }
            }

            System.out.println(answer);

        }

    }

    // BFS를 통해 연결된 배추 군집 탐색
    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y}); // 시작 위치를 큐에 추가
        visited[x][y] = true; // 시작 위치 방문 처리

        while(!q.isEmpty()) {
            int[] current = q.poll(); // 현재 위치 가져오기
            int currentI = current[0]; // 현재 세로 위치
            int currentJ = current[1]; // 현재 가로 위치

            // 사방 탐색
            for (int i = 0; i < 4; i++) {
                int nextI = currentI + di[i]; // 다음 세로 위치
                int nextJ = currentJ + dj[i]; // 다음 가로 위치

                // 경계 조건 확인
                if (nextI < 0 || nextI >= N || nextJ < 0 || nextJ >= M) {
                    continue;
                }

                // 다음 위치가 배추가 있고 방문하지 않은 경우
                if (field[nextI][nextJ] == 1 && !visited[nextI][nextJ]) {
                    // 다음 위치 큐에 추가하고 방문처리
                    q.add(new int[]{nextI, nextJ});
                    visited[nextI][nextJ] = true;
                }
            }
        }
    }
}