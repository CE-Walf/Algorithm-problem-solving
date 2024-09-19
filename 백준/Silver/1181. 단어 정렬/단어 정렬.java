import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    String[] words = new String[N];

    for (int i = 0; i < N; i++) {
      words[i] = br.readLine();
    }

    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 먼저 길이 비교 (오름차순)
        if (o1.length() != o2.length()) {
          return Integer.compare(o1.length(), o2.length());
        }
        // 길이가 같으면 사전 순으로 비교
        return o1.compareTo(o2);
      }
    });

    // 출력
    // 중복을 제거하기 위해, 조건문을 작성해준다.
    System.out.println(words[0]);
    for (int i = 1; i < N; i++){
      if (!words[i].equals(words[i-1]))
        System.out.println(words[i]);
    }

  }
}