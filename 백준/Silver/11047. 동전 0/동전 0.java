import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1 ≤ Ai ≤ 1,000,000
        // A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수
        int[] A = new int [N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = N-1; i >= 0; i--){
            if (K < A[i]){
                continue;
            }

            count += K / A[i];
            K -= A[i] * (K / A[i]);

            if (K == 0)break;
        }

        System.out.println(count);
    }
}