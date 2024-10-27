import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 <= N <= 1,000
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int num = 1; num <= N; num++) {
           if (num <= 99) {
               count++;
               continue;
           }

           int digit100 = num / 100;
           int digit10 = (num % 100) / 10;
           int digit1 = num % 10;

           if ((digit100 - digit10) == (digit10 - digit1)) {
               count++;
           }
        }

        System.out.println(count);
    }
}