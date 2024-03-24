import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 갯수 입력

        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        long[] fx = new long[max + 1];
        for (int i = 0; i <= max; i++) {
            fx[i] = 1;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = 1; i * j <= max; j++) {
                fx[i * j] += i;
            }
        }

        long[] gx = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            gx[i] = gx[i-1] + fx[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(gx[arr[i]]).append('\n');
        }

        System.out.print(sb.toString());
    }
}
