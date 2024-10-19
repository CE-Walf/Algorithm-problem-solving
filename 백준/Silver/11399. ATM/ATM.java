import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1 <= N <= 10^6
        int N = Integer.parseInt(br.readLine());

        int[] P = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        // 줄은 빨리 하는사람부터 서는게 낫다.
        Arrays.sort(P);

        for (int i = 1; i < N; i++){
            P[i] = P[i] + P[i-1];
        }

        int answer = 0;
        for (int i = 0; i < N; i++){
            answer += P[i];
        }

        System.out.println(answer);

    }
}