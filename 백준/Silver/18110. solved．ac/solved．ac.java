import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 난이도 의견의 개수 n
        // 0 <= n <= 3 * 10^5
        int n = Integer.parseInt(br.readLine());

        // 사용자들이 제출한 난이도 의견들 opinions
        // 1 <= opinions[i] <= 30
        int[] opinions = new int[n];

        for (int i = 0; i < n; i++){
            opinions[i] = Integer.parseInt(br.readLine());
        }

        // 15%의 인덱스를 계산하자.
        int index = (int)Math.round(n * 0.15);

        // 배열 오름차순 정렬
        Arrays.sort(opinions);

        double sum = 0;
        for (int i = index; i < n - index; i++) {
            sum += opinions[i];
        }

        int difficultyLevel = (int)Math.round(sum / (n - 2 * index));

        System.out.println(difficultyLevel);
    }
}