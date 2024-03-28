import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());

            System.out.println(countWay(n));
        }
    }

    // 1를 1, 2, 3의 합으로 만드는 방법 = 1
    // 2를 1, 2 ,3의 합으로 만드는 방법 = 1 + 1, 2
    // 3을 1, 2, 3의 합으로 만드는 방법 = 1 + 1 + 1 + 1, 1 + 2, 2 + 1, 3
    // 예를 들어,
    // n = 4일 때, 1을 더하면 3이 남고,
    // n = 4일 때, 2를 더하면 2가 남고,
    // n = 4일 때, 3을 더하면 1이 남는다.
    // 이렇게 줄여가며, 불필요한 계산을 줄이자.

    static int countWay(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return countWay(n-1) + countWay(n-2) + countWay(n-3);
    }
}