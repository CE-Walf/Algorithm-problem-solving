import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 배열 안에 입력 받는다. 1과 A를 제외한 약수를 받는다.
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // 해당 배열을 정렬해준다.

        // 최솟값 * 최댓값이 A이므로, 그것들을 구해준다.
        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println(min * max);
    }
}