import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int maxIndex = 0;
        int max = 0;

        // 9개의 서로 다른 자연수 입력 받기
        for(int i = 0; i < 9; i++)
            arr[i] = sc.nextInt();

        // 최댓값 탐색하기
        for(int i = 0; i < 9; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}