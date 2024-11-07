import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N을 1로 만들기 위한 최소 연산 횟수를 구하는 것이 문제이다.
        // 1 <= N <= 10^6
        int N = Integer.parseInt(br.readLine());

        // 각 숫자까지 도달하는 최소 연산 횟수를 저장할 배열 X
        int[] X = new int[N + 1];

        // 기저 조건
        if (N >= 2) {
            X[2] = 1;
        }

        if (N >= 3) {
            X[3] = 1;
        }

        // 4부터 N까지 연산 횟수를 채운다.
        for (int i = 4; i <= N; i++) {
            // 3. 1을 빼는 연산으로 접근하는 경우
            X[i] = X[i - 1] + 1;

            // 1. i가 3으로 나누어 떨어지는 경우, 최소 연산 횟수 갱신
            if (i % 3 == 0) {
                X[i] = Math.min(X[i], X[i / 3] + 1);
            }

            // 2. i가 2으로 나누어 떨어지는 경우, 최소 연산 횟수 갱신
            if (i % 2 == 0) {
                X[i] = Math.min(X[i], X[i / 2] + 1);
            }
        }

        // 답 출력
        System.out.println(X[N]);

    }
}