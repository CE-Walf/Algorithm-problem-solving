import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 2*N-1번째 줄까지 차례로 별을 출력
        for (int i = 1; i <= 2*N-1; i++){ // 줄바꿈 for문
            // i가 N보다 작거나 같을때,
            if (i <= N) {
                for (int j = N-i; j >= 1; j--){ // 공백 출력
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2*i-1; k++){ // 별 출력
                    System.out.print("*");
                }
            } else { // i가 N보다 클때,
                for (int j = 1; j <= i-N; j++){ // 공백 출력
                    System.out.print(" ");
                }

                for (int k = (2*N-1)-2*(i-N); k >= 1; k--){ // 별 출력
                    System.out.print("*");
                }

            }
            System.out.println(); // 줄 바꿈
        }

    }
}