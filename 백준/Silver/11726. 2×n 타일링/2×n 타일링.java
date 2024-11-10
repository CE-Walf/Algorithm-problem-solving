import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다시 풀기 (규칙성 찾기)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n : 타일링할 2×n 직사각형의 길이
        // 1 ≤ n ≤ 1,000
        int n = Integer.parseInt(br.readLine());

        // dp 배열 생성
        int[] dp = new int[1001];

        // 기저 조건
        dp[1] = 1;
        dp[2] = 2;

        // 점화식을 도출 후,
        // 2×n 크기의 직사각형을 채우는 방법의 수를 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}