import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 참가자 N (1 <= N <= 10^9)
        long N = Integer.parseInt(br.readLine());

        // 사이즈는 6가지
        // 0 <= S, M, L, XL, XXL, XXXL <= N
        // S + M + L + XL + XXL + XXXL = N
        int[] size = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++){
            size[i] = Integer.parseInt(st.nextToken());
        }

        // T : 티셔츠의 묶음 수
        // P : 펜의 묶음 수
        st = new StringTokenizer(br.readLine());
        long T = Integer.parseInt(st.nextToken());
        long P = Integer.parseInt(st.nextToken());

        // 우선 티셔츠 먼저 구해보자.
        // 티셔츠는 T장 묶음으로 팔고, 최소 몇 묶음 주문해야하는지 구해야한다.
        long answerT = 0;
        for (int i = 0; i < 6; i++){
            answerT += size[i] % T == 0 ?  size[i] / T : size[i] / T + 1;
        }

        // 다음은 펜을 구해보자.
        // 펜은 P자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있다.
        long answerPenBundle = N / P;
        long answerPenEach = N % P;

        System.out.println(answerT);
        System.out.println(answerPenBundle + " " + answerPenEach);


    }
}