import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 <= N <= 300
        int N = Integer.parseInt(br.readLine());

        // 1 <= stairsScore[i] <= 10,000
        int[] stairsScore = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++){
            stairsScore[i] = Integer.parseInt(br.readLine());
        }

        // 기저조건 설정
        // 시작점은 계단에서 포함되지 않는다.
        if (N >= 1) {
            dp[1] = stairsScore[1];
        }

        if (N >= 2) {
            dp[2] = stairsScore[1] + stairsScore[2];
        }

        // DP 계산
        // dp[i-2] = 두 계단을 건너뛰고 현재 계산 도달
        // ex) 1 -> 2 -> 4
        // dp[i-3] + stairsScore[i-1] = 한 계단을 밟고, 그 이전 계단을 밟지 않은 경우
        // ex) 1 -> 3 -> 4
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + stairsScore[i-1]) + stairsScore[i];
        }

        // 출력
        // 첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.
        System.out.println(dp[N]);
    }
}