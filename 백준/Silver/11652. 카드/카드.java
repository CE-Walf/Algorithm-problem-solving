import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // (1 <= N <= 100,000)

        // 배열을 생성하고, 그 안에 숫자가 적혀있는 카드를 담는다.
        // 적혀있는 수는 -2^62보다 크거나 같고, 2^62보다 작거나 같다. (범위 long지정)
        long[] arr = new long[N];
        for (int i = 0; i < N; i++){
            arr[i] = scanner.nextLong();
        }

        Arrays.sort(arr); // 숫자를 적은 카드를 정렬해준다.

        long maxValue = arr[0]; // 가장 큰 원소가 무엇인지 담는 변수
        int maxCount = 0; // 가장 많이 나온 횟수

        int count = 0; // 횟수
        for (int i = 0; i < N-1; i++){
            if (arr[i] == arr[i+1]){ // 만약 현재의 값과 다음의 값이 같을 경우
                count++;
            } else { // 현재의 값과 다음의 값이 다를 경우
                if(maxCount < count){ // maxCount보다 count가 크다면
                    maxCount = count;
                    maxValue = arr[i];
                }
                count = 0;
            }
        }
        
        // 허나 여기서 마지막이 [0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2] 이런 배열일 경우 마지막 2를 count 하지 않는다.
        if (count > maxCount){
            maxValue = arr[N-1];
        }

        System.out.println(maxValue);

    }
}