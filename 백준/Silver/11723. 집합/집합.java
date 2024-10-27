import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 비트마스크 생각하고 다시 풀기
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 1 ≤ M ≤ 3,000,000
        int M = Integer.parseInt(br.readLine());

        int S = 0; // 공집합은 0으로 표현한다.

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            // 1 ≤ x ≤ 20
            int x = 0;
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "add":
                    S |= (1 << (x - 1));
                    break;
                case "remove":
                    S &= ~(1 << (x - 1));
                    break;
                case "check":
                    int output = (S & (1 << (x - 1))) != 0 ? 1 : 0;
                    sb.append(output + "\n");
                    break;
                case "toggle":
                    S ^= (1 << (x - 1));
                    break;
                case "all":
                    S = (1 << 20) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;

            }
        }
        System.out.println(sb.toString());

    }
}