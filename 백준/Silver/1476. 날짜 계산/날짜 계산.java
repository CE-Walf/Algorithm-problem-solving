import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄에 세 수 E,S,M이 주어진다.
        // 1 <= E <= 15, 1 <= S <= 28, 1 <= M <= 19
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Earth = Integer.parseInt(st.nextToken()); // 지구를 나타내는 수
        int Sun = Integer.parseInt(st.nextToken()); // 태양을 나타내는 수
        int Moon = Integer.parseInt(st.nextToken()); // 달을 나타내는 수

        int answer = 0;
        while (true){
            answer++;
            boolean check1 = returnYear(answer, 'E') == Earth;
            boolean check2 = returnYear(answer, 'S') == Sun;
            boolean check3 = returnYear(answer, 'M') == Moon;

            if (check1 && check2  && check3) break;
        }
        System.out.println(answer);
    }

    static int returnYear(int number, char divisor){

        if (divisor == 'E'){ // 지구일 경우,
            number = (number - 1) % 15 + 1;
        } else if (divisor == 'S'){ // 태양일 경우
            number = (number - 1) % 28 + 1;
        } else if (divisor == 'M') { // 달일 경우
            number = (number - 1) % 19 + 1;
        }
        return number;
    }
}