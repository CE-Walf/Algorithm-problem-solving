import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // M이상, N이하의 소수를 모두 출력
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // 에라토스테네스의 체를 사용하자.
        // N까지의 소수를 구할 isNotPrime 배열을 생성하자.
        // N까지이므로, N+1의 크기로 배열을 생성해준다.
        // 여기서 소수는 false이며, 소수가 아닌 값은 true이다.
        boolean[] isNotPrime = new boolean[N+1];

        // 우선 0과 1은 소수가 아니다. true로 바꿔준다.
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 에라토스테네스의 체를 구현해보자.
        for (int i = 2; i <= N; i++){
            if (!isNotPrime[i]){ // 기본값인 false일 경우, 그의 배수는 다 소수가 아니다.
                for (int j = 2 * i; j <= N; j += i){ // i를 제외하고, 그의 배수들을 다 true로 바꿔준다.
                    isNotPrime[j] = true;
                }
            }
        }

        // 이제, boolean 배열을 순회하면서, 소수인것을 출력해보자.
        for (int i = M; i <= N; i++){
            if(!isNotPrime[i]){
                System.out.println(i);
            }
        }

    }
}