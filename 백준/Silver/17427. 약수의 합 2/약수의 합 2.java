import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // N보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값 구하기
        // f(y)는 y의 약수를 모두 더한 것
        long sum = 0;

        // 중요
        for (int i = 1; i <= N; i++){
            sum += N / i * i;
        }

        System.out.println(sum);

    }
}