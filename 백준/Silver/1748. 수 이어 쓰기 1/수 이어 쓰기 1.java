import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 <= N < = 100,000,000
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        int divisor = 10;
        int addDigit = 1;
        for (int i = 1; i <= N; i++){
            if (i / divisor == 1){
                divisor *= 10;
                addDigit += 1;
            }

            if (i / divisor == 0){
                count += addDigit;
            }
        }
        System.out.println(count);
    }
}