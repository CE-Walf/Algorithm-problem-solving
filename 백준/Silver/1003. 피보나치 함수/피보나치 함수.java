import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count0 = 0;
    static int count1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0) {
                System.out.println(1 + " " + 0);
            } else if (N == 1) {
                System.out.println(0 + " " + 1);
            } else {
                int[][] answer = new int[N+1][2];

                answer[0][0] = 1;
                answer[0][1] = 0;
                answer[1][0] = 0;
                answer[1][1] = 1;

                for (int j = 2 ; j <= N; j++) {
                    answer[j][0] = answer[j-1][0] + answer[j-2][0];
                    answer[j][1] = answer[j-1][1] + answer[j-2][1];
                }

                System.out.println(answer[N][0] + " " + answer[N][1]);
            }
        }
    }
}