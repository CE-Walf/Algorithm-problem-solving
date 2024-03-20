import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // 에라토스 테네스의 체를 사용하자.
        // 소수의 배수를 지워주는 방식
        // 2부터 false인것이 소수, true인것이 소수가 아니다.
        boolean[] isPrime = new boolean[N + 1]; // N까지. 초기값 false

        // 0과 1은 소수가 아니다. 그러므로 미리 true 선언 해준다.
        isPrime[0] = true;
        isPrime[1] = true;
        
        for (int i = 2; i <= N; i++){
            if (!isPrime[i]){
                for (int j = 2*i ; j <= N; j += i){
                    isPrime[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++){
            if(!isPrime[i]){
                System.out.println(i);
            }
        }
    }
}