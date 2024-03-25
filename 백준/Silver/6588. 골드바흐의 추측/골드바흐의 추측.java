import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        // 에라토스테네스의 체로 1,000,000까지 소수 판별여부가 담긴 배열
        // 소수면 true, 아니면 false;
        boolean[] isPrime = isPrimeArray();

        // 골드바흐의 추측 이란?
        // 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
        int num = Integer.parseInt(br.readLine()); // 6 <= N <= 1000000

        // 입력의 마지막 줄에는 0이 하나 주어진다.
        while (num != 0) {
            // num을 입력받았다.
            // 출력할때 n을 만들 수 있는 방법이 여러가지라면, b-a가 가장 큰 것을 출력해야한다.
            // 이 조건을 생각하면서 반복문을 만들어보자.

            // 이중 반복문을 탈출하기 위한 플래그 생성
            // 이렇게하면 시간초과.
//            boolean flag = false;
//            for (int i = 1; i <= num; i += 2){ // 1부터 num까지, 홀수만 판별하기 위해 += 2씩 체크한다.
//                for (int j = num-1; j >= i; j -= 2){ // num이 짝수이므로, num-1 부터 i보다 크거나 같을때 까지만, -2씩 체크한다.
//                    if (isPrime[i] && isPrime[j] && i + j == num){
//                        System.out.println(num + " = " + i + " + " + j);
//                        flag = true;
//                        break;
//                    }
//                }
//                if(flag)break;
//            }

            for (int i = 1; i <= num / 2; i += 2){ // 불 필요한 계산 줄이기 위해 1부터 num / 2 까지
                if (isPrime[i] && isPrime[num - i]){
                    System.out.println(num + " = " + i + " + " + (num - i));
                    break;
                }
            }
            num = Integer.parseInt(br.readLine());
        }
    }

    static boolean[] isPrimeArray(){
        // 이 안에 에라토스테네스의 체를 구현해보자.
        boolean[] isPrime = new boolean[1000001];
        // 소수 = true, 아니면 false
        // boolean 배열은 기본값으로 false를 가진다

        //우선 기본값으로 배열에 true로 채워준다.
        Arrays.fill(isPrime, true);

        // 0과 1은 소수가 아니다.
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < isPrime.length; i++){
            if(isPrime[i]){
                // 만약 isPrime이 true일 경우, 그의 배수를 다 소수가 아닌 처리를 해준다.
                for (int j = 2 * i; j < isPrime.length; j += i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }


}