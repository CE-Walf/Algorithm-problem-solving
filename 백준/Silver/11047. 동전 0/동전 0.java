import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N : 준규가 가지고 있는 동전의 종류
        // 1 ≤ N ≤ 10
        int N = Integer.parseInt(st.nextToken());
        // K : 동전을 적절히 사용해서 만들 합
        // 1 ≤ K ≤ 100,000,000
        int K = Integer.parseInt(st.nextToken());

        // A : 동전의 가치를 담는 배열 (오름차순으로 주어짐)
        // 1 ≤ A[i] ≤ 1,000,000, A[1] = 1, i ≥ 2인 경우에 A[i]는 A[i-1]의 배수
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        // 필요한 최소 동전 개수를 담을 변수
        int answer = 0;

        // 반복문을 통해 큰 가치의 동전부터 사용하여 최소 동전 개수를 구한다.
        for (int i = N - 1; i >= 0; i--) {
            int coin = A[i]; // 현재 고려 중인 동전의 가치

            // 현재 동전을 사용할 수 있다면,
            if (K / coin != 0) {
                answer += K / coin; // 동전을 사용한 개수를 정답에 더함
                K = K % coin; // 남은 금액을 갱신
            }
        }

        System.out.println(answer);
    }
}