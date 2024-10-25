import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        // N : 나무의 수
        // 1 ≤ N ≤ 1,000,000
        int N = Integer.parseInt(st.nextToken());
        // M : 집으로 가져가려는 나무의 길이
        // 1 ≤ M ≤ 2,000,000,000
        long M = Integer.parseInt(st.nextToken());

        // 가장 큰 나무 길이를 찾기 위한 변수
        // 이분 탐색의 right에 사용할 것이다.
        int maxHeight = 0;

        st = new StringTokenizer(br.readLine());
        // treesHeight : 나무의 높이를 담을 배열
        // 0 ≤ treeHeights[i] ≤ 1,000,000,000
        int[] treeHeights = new int[N];
        for (int i = 0; i < N; i++) {
            treeHeights[i] = Integer.parseInt(st.nextToken());
            // 나무들 중에서 가장 큰 높이를 찾는다.
            if (treeHeights[i] > maxHeight)
                maxHeight = treeHeights[i];
        }

        long left = 0; // 이분 탐색 left
        long right = maxHeight; // 이분 탐색 right
        long answer = 0; // 높이의 최댓값을 담을 변수

        // 이분 탐색 시작
        while (left <= right) {
            long mid = (left + right) / 2; // 중간 값
            long cutWoodLength = 0; // 자른 나무의 합을 담을 변수

            // 배열을 순회하며, 자른 나무의 합을 담는다.
            for (int treeHeight : treeHeights) {
                if (treeHeight - mid > 0) {
                    cutWoodLength += treeHeight - mid;
                }
            }

            // 자른 나무의 합이 M보다 크다면, 정답을 중간값으로 변경해주고,
            // 작은 값에 1을 더해 탐색을 이어 나간다.
            // 합이 M보다 작다면, 큰 값에 1을 빼서 탐색을 이어나간다.
            if (cutWoodLength >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}