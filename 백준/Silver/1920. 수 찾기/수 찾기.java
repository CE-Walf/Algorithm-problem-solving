import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++){
            arrN[i] = scanner.nextInt();
        }

        Arrays.sort(arrN); // 탐색하고자 하는 배열을 정렬하자.

        int M = scanner.nextInt();
        int elementM;
        int answer = 0;
        for (int i = 0; i < M; i++){
            elementM = scanner.nextInt();
            answer = binarySearch(arrN,elementM);
            System.out.println(answer);
        }

    }

    public static int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}