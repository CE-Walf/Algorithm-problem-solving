import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++){
            // 한 줄 읽어온 것을 " "를 기준으로 나누어 담아준다.
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 평균을 구하기 점수의 합을 담는 변수
            double sum = 0;
            // 학생의 수
            int N = Integer.parseInt(st.nextToken());

            // 점수들 입력 받기
            int[] scores = new int[N];
            for (int j = 0; j < N; j++){
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            // 평균 구하기
            double aver = sum / N;

            // 비율을 구하기 위해 평균을 넘는 학생들이 몇명이 있는지 찾는다.
            double count = 0;
            for (int j = 0; j < N; j++){
                if (scores[j] > aver){
                    count++;
                }
            }

            // 중요 - prinf 메서드를 사용하므로 % 기호를 사용할때는 %%를 사용한다.
            System.out.printf("%.3f%%", (count / N) * 100);
            System.out.println();
        }
    }
}