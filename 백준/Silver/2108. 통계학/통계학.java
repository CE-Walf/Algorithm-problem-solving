import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> modeMap = new HashMap<>();
        double sum = 0;

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            modeMap.put(numbers[i], modeMap.getOrDefault(numbers[i], 0) + 1);
        }

        // 배열 오름차순 정렬
        Arrays.sort(numbers);

        int average = (int) Math.round(sum / N);

        int median = numbers[N / 2];

        int maxCount = 0;
        ArrayList<Integer> modeList = new ArrayList<>();
        for (int number : modeMap.keySet()) {
            int count = modeMap.get(number);
            if (count > maxCount) {
                maxCount = count;
                modeList.clear();
                modeList.add(number);
            } else if (maxCount == count){
                modeList.add(number);
            }
        }
        Collections.sort(modeList);
        int mode = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);

        int scope = numbers[N-1] - numbers[0];

        // 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
        // 둘째 줄에는 중앙값을 출력한다.
        // 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
        // 넷째 줄에는 범위를 출력한다.
        System.out.println(average);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(scope);

    }
}