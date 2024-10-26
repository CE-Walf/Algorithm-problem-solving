import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N : 좌표의 개수
        // 1 ≤ N ≤ 1,000,000
        int N = Integer.parseInt(br.readLine());

        // X[i] : 좌표들 정보
        // sortedX : 정렬된 좌표
        // -10^9 ≤ X[i] ≤ 10^9
        int[] X = new int[N];
        int[] sortedX = new int[N];

        // 랭킹을 담을 Map
        Map<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            X[i] = sortedX[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedX); // 배열 정렬

        // 정렬한 배열로 랭킹을 구하여 Map에 담아준다.
        int rankCount = 0;

        for (int i : sortedX) {
            if (!map.containsKey(i)) {
                map.put(i, rankCount);
                rankCount++;
            }
        }

        // 출력
        // StringBuilder를 사용하지 않으면 시간초과 발생
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(X[i]) + " ");
        }

        System.out.println(sb.toString());
    }
}