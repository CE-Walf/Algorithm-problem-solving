import java.util.Scanner;

public class Main{

    static int[][] field;
    static boolean[][] visited;
    static int[] dI = {0, 0, 1, -1};
    static int[] dJ = {1, -1, 0, 0};
    // M : 배추밭의 가로 길이
    // N : 배추밭의 세로 길이
    static int N, M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // 테스트 케이스의 갯수

        for (int test_case = 0; test_case < T; test_case++) {

            M = scanner.nextInt();
            N = scanner.nextInt();

            field = new int[N][M];
            visited = new boolean[N][M];

            // K : 배추가 심어져 있는 위치의 개수
            int K = scanner.nextInt();

            for (int i = 0; i < K; i++) {
                int plantedI = scanner.nextInt();
                int plantedJ = scanner.nextInt();

                field[plantedJ][plantedI] = 1;
            }
            int count = 0;

            for (int i = 0; i < N; i++){
                for (int j = 0; j < M; j++){
                    if (field[i][j] == 1 && !visited[i][j]){
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

    public static void dfs(int i, int j){
        visited[i][j] = true;

        for (int index = 0; index < 4; index++){
            int moveI = i + dI[index];
            int moveJ = j + dJ[index];

            if (moveI < 0 || moveI >= N || moveJ < 0 || moveJ >= M){
                continue;
            }

            if (field[moveI][moveJ] == 1 && !visited[moveI][moveJ]) {
                dfs(moveI, moveJ);
            }

        }
    }
}