import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모듈러 연산의 성질 참고
// https://zzinise.tistory.com/73
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String word = br.readLine();

        long answer = 0;
        long pow = 1; // 31^0

        for (int i = 0; i < L; i++){
            answer += (word.charAt(i) - 'a' + 1) * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(answer % 1234567891);

    }
}