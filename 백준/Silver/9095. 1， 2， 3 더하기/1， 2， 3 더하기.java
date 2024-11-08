import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 1를 1, 2, 3의 합으로 만드는 방법 = 1
    // 2를 1, 2 ,3의 합으로 만드는 방법 = 1 + 1, 2
    // 3을 1, 2, 3의 합으로 만드는 방법 = 1 + 1 + 1, 1 + 2, 2 + 1, 3 이다.

    // 예를 들어 n = 4라고 할 때, 모든 경우의 수는
    // 3일때의 값의 마지막에 + 1을 붙힌 것
    // 2일때의 값의 마지막에 + 2를 붙인 것
    // 1일때의 값의 마지막에 + 3을 붙인 것의 합으로 총 7개다.

    // 이러한 성질을 이용하여 이 점화식을 유도할 수 있다.
    // dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
    // dp[i-1]은 마지막에 +1을 추가한 경우의 수
    // dp[i-2]는 마지막에 +2를 추가한 경우의 수
    // dp[i-3]는 마지막에 +3을 추가한 경우의 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T : 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        // 최대 n이 11보다 작으므로 dp 배열은 11까지 선언
        int[] dp = new int[12];

        // 기저 조건
        dp[1] = 1; // 1을 만드는 방법의 수는 1개 (1)
        dp[2] = 2; // 2를 만드는 방법의 수는 2개 (1+1, 2)
        dp[3] = 4; // 3을 만드는 방법의 수는 4개 (1+1+1, 1+2, 2+1, 3)

        // dp 배열 채우기
        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < T; i++) {
            // n은 양수이며, 11보다 작다.
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}