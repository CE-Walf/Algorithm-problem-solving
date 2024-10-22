import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 다시 풀기
public class Main {

    static int M, N;
    static int[][] field;
    static int[] di = {0, 0, 1, -1};
    static int[] dj = {1, -1, 0, 0};
    static Queue<int[]> fieldQueue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        // 2 <= M, N <= 1,000
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        field = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                if (field[i][j] == 1) {
                    fieldQueue.add(new int[]{i, j});
                }
            }
        }

        bfs();

        if (isCheckZero()) {
            System.out.println(-1);
        } else {
            System.out.println(countDay());
        }
    }

    public static void bfs() {
        while (!fieldQueue.isEmpty()) {
            int[] coordinate = fieldQueue.poll();
            int qI = coordinate[0];
            int qJ = coordinate[1];

            for (int i = 0; i < 4; i++) {
                int tempI = qI + di[i];
                int tempJ = qJ + dj[i];

                if (tempI < 0 || tempI >= N || tempJ < 0 || tempJ >= M) {
                    continue;
                }

                if (field[tempI][tempJ] == 0) {
                    field[tempI][tempJ] = field[qI][qJ] + 1;
                    fieldQueue.add(new int[]{tempI, tempJ});
                }
            }
        }
    }

    public static int countDay() {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (answer < field[i][j]) {
                    answer = field[i][j];
                }
            }
        }

        return --answer; // 처음엔 이미 익어있을테니
    }

    public static boolean isCheckZero() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (field[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}