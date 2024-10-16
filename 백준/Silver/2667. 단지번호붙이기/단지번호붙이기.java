import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map; // 정사각형 모양의 지도
    static boolean[][] visited; // 방문자 배열
    static int N; // 지도의 크기 N (정사각형, 5 <= N <= 25)
    // di, dj = 동, 서, 남, 북
    static int[] di = {0, 0, 1, -1};
    static int[] dj = {1, -1, 0, 0};
    static int count = 0; // 총 단지의 수
    static List<Integer> homeCounts = new ArrayList<>(); // 각 단지내 집의 수를 오름차순 정렬하기 위한 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        // 값 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int homeCount = bfs(i, j);
                    homeCounts.add(homeCount);
                    count++;
                }
            }
        }

        // 출력
        // 첫 번째 줄 : 총 단지 수
        // 두 번째 줄 : 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩
        System.out.println(count);

        Collections.sort(homeCounts);
        for(int num : homeCounts){
            System.out.println(num);
        }
    }

    public static int bfs(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        int homeCount = 0; // 단지 내 집의 수
        q.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            homeCount++;

            for (int index = 0; index < 4; index++){
                int moveI = temp[0] + di[index];
                int moveJ = temp[1] + dj[index];

                if (moveI < 0 || moveI >= N || moveJ < 0 || moveJ >= N){
                    continue;
                }
                if (map[moveI][moveJ] == 1 && !visited[moveI][moveJ]){
                    q.offer(new int[]{moveI, moveJ});
                    visited[moveI][moveJ] = true;
                }

            }
        }

        return homeCount;
    }
}