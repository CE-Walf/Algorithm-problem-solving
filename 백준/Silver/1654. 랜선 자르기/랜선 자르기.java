import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 다시 풀기
public class Main {
    static int K, N;
    static long[] lanLengths;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        lanLengths = new long[K];

        for (int i = 0; i < K; i++) {
            lanLengths[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lanLengths);

        long answer = findCorrectLength();
        System.out.println(answer);
    }

    public static long findCorrectLength() {
        long start = 1;
        long end = lanLengths[lanLengths.length - 1];

        long result = 0;

        // 이분 탐색 시작
        while (start <= end) {
            long mid = (start + end) / 2;
            if (countLan(mid) >= N) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return result;
    }

    public static long countLan(long length) {
        int count = 0;
        for (long lan : lanLengths) {
            count += lan / length;
        }
        return count;
    }


}