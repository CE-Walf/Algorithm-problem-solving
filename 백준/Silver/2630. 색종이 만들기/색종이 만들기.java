import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int white = 0;
    static int blue = 0;

    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N은 2, 4, 8, 16, 32, 64, 128 중 하나
        int N = Integer.parseInt(br.readLine());

        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 탐색 시작
        dividePaper(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    static void dividePaper(int x, int y, int size) {

        if (checkColor(x, y, size)) {
            if (paper[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        size = size / 2;

        dividePaper(x, y, size);
        dividePaper(x, y + size, size);
        dividePaper(x + size, y, size);
        dividePaper(x + size, y + size, size);
    }

    static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (color != paper[x + i][y + j]) {
                    return false;
                }
            }
        }

        return true;
    }
}