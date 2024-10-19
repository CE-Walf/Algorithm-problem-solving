import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
        } else if (N == 2) {
            System.out.println(1);
        } else if (N == 3) {
            System.out.println(1);
        } else {
            int[] X = new int[N + 1];

            X[2] = 1;
            X[3] = 1;
            
            for (int i = 4; i <= N; i++) {
                X[i] = X[i - 1] + 1;
                if (i % 2 == 0) {
                    X[i] = Math.min(X[i], X[i / 2] + 1);
                }

                if (i % 3 == 0) {
                    X[i] = Math.min(X[i], X[i / 3] + 1);
                }
            }

            System.out.println(X[N]);
        }


    }
}